package de.unikassel.vs.asp.modelling.antlr;


import de.unikassel.vs.asp.modelling.AspGenerator;
import de.unikassel.vs.asp.modelling.syntax.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

public class ASPListener extends ASPCore2BaseListener {

    ASPCore2Parser parser;
    AspGenerator gen;
    Rule currentRule;
    Head currentHead;
    Body currentBody;
    Predicate currentPredicate;

    public ASPListener(ASPCore2Parser parser){
        this.parser = parser;
        gen = new AspGenerator();
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        String text = ctx.getText();

    }

    @Override
    public void enterStatements(ASPCore2Parser.StatementsContext ctx) {
        String text = ctx.getText();
    }

    @Override public void enterStatement_rule(ASPCore2Parser.Statement_ruleContext ctx) {
        String text = ctx.getText();
        currentRule = new Rule();
        gen.withRules(currentRule);
    }

    @Override public void enterHead(ASPCore2Parser.HeadContext ctx) {
        currentHead = new Head();
        currentRule.withHead(currentHead);
        String text = ctx.getText();
    }

    @Override public void enterTerms(ASPCore2Parser.TermsContext ctx) {
        String text = ctx.getText();
    }

    @Override
    public void enterClassical_literal(ASPCore2Parser.Classical_literalContext ctx) {
        String text = ctx.getText();
        TerminalNode id = ctx.ID();
        String s = id.toString();
        currentPredicate = new Predicate();
        currentPredicate.withName(id.toString());
        currentHead.withPredicates(currentPredicate);
    }

    @Override public void visitTerminal(TerminalNode node) {
        String text = node.getText();
    }

    @Override public void enterTerm_variable(ASPCore2Parser.Term_variableContext ctx) {
        String variableName = ctx.getText();
        Variable variable = new Variable();
        variable.withName(variableName);
        currentPredicate.withElements(variable);

    }

    @Override
    public void enterBody(ASPCore2Parser.BodyContext ctx) {
        currentBody = new Body();
        currentRule.withBody(currentBody);
        String text = ctx.getText();
    }

}
