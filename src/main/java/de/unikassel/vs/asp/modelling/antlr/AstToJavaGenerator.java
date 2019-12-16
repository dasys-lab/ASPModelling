package de.unikassel.vs.asp.modelling.antlr;

import java.util.Arrays;
import java.util.List;
import de.unikassel.vs.asp.modelling.AspGenerator;
import de.unikassel.vs.asp.modelling.syntax.*;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.Trees;


public class AstToJavaGenerator {

    List<String> ruleNamesList;
    AspGenerator gen;


    public AspGenerator startTraversing(Parser parser, ParseTree tree) {
        gen = new AspGenerator();
        String[] ruleNames = parser != null ? parser.getRuleNames() : null;
        ruleNamesList = ruleNames != null ? Arrays.asList(ruleNames) : null;
        traverseWithGenerator(tree, ruleNamesList, gen);
        return gen;
    }

    public void traverseWithGenerator(ParseTree tree, List<String> ruleNames, AspGenerator gen) {
        String nodeText = Trees.getNodeText(tree, ruleNames);
        if (nodeText.equals("statements")) {
            for (int i = 0; i < tree.getChildCount(); i++) {
                traverseWithGenerator(tree.getChild(i), ruleNames, gen);
            }
        } else if (nodeText.equals("statement")) {
            Rule rule = new Rule();
            gen.withRules(rule);
            for (int i = 0; i < tree.getChildCount(); i++) {
                traverseWithRule(tree.getChild(i), ruleNames, rule);
            }
        }
    }

    public void traverseWithRule(ParseTree tree, List<String> ruleNames, Rule rule) {
        String nodeText = Trees.getNodeText(tree, ruleNames);
        if (nodeText.equals("head")) {
            Head head = new Head();
            rule.withHead(head);
            for (int i = 0; i < tree.getChildCount(); i++) {
                traverseWithHead(tree.getChild(i), ruleNames, head);
            }
        } else if (nodeText.equals("body")) {
            Body body = new Body();
            rule.withBody(body);
            for (int i = 0; i < tree.getChildCount(); i++) {
                traverseWithBody(tree.getChild(i), ruleNames, body);
            }
        }
        if (tree.getChildCount() == 0) {
            return;
        }
    }

    public void traverseWithHead(ParseTree tree, List<String> ruleNames, Head head) {
        String nodeText = Trees.getNodeText(tree, ruleNames);
        if (nodeText.equals("disjunction")) {
            for (int i = 0; i < tree.getChildCount(); i++) {
                traverseWithHead(tree.getChild(i), ruleNames, head);
            }
        } else if (nodeText.equals("classical_literal")) {
            Predicate predicate = new Predicate();
            head.withPredicates(predicate);
            for (int i = 0; i < tree.getChildCount(); i++) {
                String childText = Trees.getNodeText(tree.getChild(i), ruleNames);
                if (childText.equals("(") || childText.equals(")")) {
                    continue;
                }
                if (childText.equals("terms")) {
                    Variable variable = new Variable();
                    traverseWithVariable(tree.getChild(i), ruleNames, predicate);
                } else {
                    traverseWithPredicate(tree.getChild(i), ruleNames, predicate);
                }
            }
        }
    }

    private void traverseWithBody(ParseTree tree, List<String> ruleNames, Body body) {
        String nodeText = Trees.getNodeText(tree, ruleNames);
        if (nodeText.equals("naf_literal")) {
            for (int i = 0; i < tree.getChildCount(); i++) {
                traverseWithBody(tree.getChild(i), ruleNames, body);
            }
        } else if (nodeText.equals("classical_literal")) {
            Predicate predicate = new Predicate();
            body.withPredicates(predicate);
            for (int i = 0; i < tree.getChildCount(); i++) {
                String childText = Trees.getNodeText(tree.getChild(i), ruleNames);
                if (childText.equals("(") || childText.equals(")")) {
                    continue;
                }
                if (childText.equals("terms")) {
                    Variable variable = new Variable();
                    traverseWithVariable(tree.getChild(i), ruleNames, predicate);
                } else {
                    traverseWithPredicate(tree.getChild(i), ruleNames, predicate);
                }
            }
        }
    }

    private void traverseWithPredicate(ParseTree tree, List<String> ruleNames, Predicate predicate) {
        String predicateName = Trees.getNodeText(tree, ruleNames);
        predicate.withName(predicateName);
    }

    private void traverseWithVariable(ParseTree tree, List<String> ruleNames, Predicate predicate) {
        String nodeText = Trees.getNodeText(tree, ruleNames);
        if (nodeText.equals("terms")) {
            for (int i = 0; i < tree.getChildCount(); i++) {
                traverseWithVariable(tree.getChild(i), ruleNames, predicate);
            }
        } else if (nodeText.equals("term")) {
            for (int i = 0; i < tree.getChildCount(); i++) {
                traverseWithVariable(tree.getChild(i), ruleNames, predicate);
            }
        } else {
            if (nodeText.matches(Variable.getLEGAL_VARIABLE_NAMES())) {
                Variable variable = new Variable();
                variable.withName(nodeText);
                predicate.withElements(variable);
            } else if (nodeText.matches(Constant.getLegalConstantNames())) {
                Constant constant = new Constant();
                constant.withName(nodeText);
                predicate.withElements(constant);
            }
        }
    }
}
