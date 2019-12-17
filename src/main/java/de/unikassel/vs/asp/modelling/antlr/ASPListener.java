package de.unikassel.vs.asp.modelling.antlr;


import de.unikassel.vs.asp.modelling.AspGenerator;
import de.unikassel.vs.asp.modelling.syntax.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

public class ASPListener extends ASPCore2BaseListener {

    ASPCore2Parser parser;
    AspGenerator gen;
    Rule currentRule;
    RuleComponent currentHeadOrBody;
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
        currentHeadOrBody = new Head();
        currentRule.withHead(currentHeadOrBody);
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
        currentHeadOrBody.withPredicates(currentPredicate);
    }

    @Override public void visitTerminal(TerminalNode node) {
        String text = node.getText();
    }

    @Override
    public void enterBody(ASPCore2Parser.BodyContext ctx) {
        currentHeadOrBody = new Body();
        currentRule.withBody(currentHeadOrBody);
        String text = ctx.getText();
    }

    @Override
    public void enterNaf_literal(ASPCore2Parser.Naf_literalContext ctx) {
        String text = ctx.getText();
    }

    @Override public void enterTerm_variable(ASPCore2Parser.Term_variableContext ctx) {
        String variableName = ctx.getText();
        Variable variable = new Variable();
        variable.withName(variableName);
        currentPredicate.withElements(variable);
    }

    @Override public void enterTerm_const(ASPCore2Parser.Term_constContext ctx) {
        String constantName = ctx.getText();
        Constant constant = new Constant();
        constant.withName(constantName);
        currentPredicate.withElements(constant);
    }

}
