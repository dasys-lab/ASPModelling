package de.unikassel.vs.asp.modelling.antlr;

import de.unikassel.vs.asp.modelling.AspGenerator;
import de.unikassel.vs.asp.modelling.syntax.Rule;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.Trees;

import java.util.Arrays;
import java.util.List;

public class AstToJavaGenerator {

    List<String> ruleNamesList;


    public AspGenerator startTraversing(Parser parser, ParseTree tree){
        AspGenerator gen = new AspGenerator();
        String[] ruleNames = parser != null ? parser.getRuleNames() : null;
        ruleNamesList = ruleNames != null ? Arrays.asList(ruleNames) : null;
        traverse(tree, ruleNamesList);
        return gen;
    }

    public void traverse(ParseTree tree, List<String> ruleNames){
        String nodeText = Trees.getNodeText(tree, ruleNames);
        switch (nodeText) {
            case "statement":
                Rule rule = new Rule();
            case "head":
        }
        if ( tree.getChildCount() == 0 ){
            return;
        }

        for (int i = 0; i < tree.getChildCount(); i++) {
            traverse(tree.getChild(i), ruleNames);
        }
    }
}
