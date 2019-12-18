package de.unikassel.vs.asp.modelling.antlr;

import de.unikassel.vs.asp.modelling.AspGenerator;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class ASPVisitor extends ASPCore2BaseVisitor<AspGenerator> {

    AspGenerator gen = new AspGenerator();

    public void visitProgram(RuleContext ctx) {
        String text = ctx.getText();
    }

    @Override
    public AspGenerator visitStatements(ASPCore2Parser.StatementsContext ctx) {
        String text = ctx.getText();
        visitChildren(ctx);
        return gen;
    }

    @Override public AspGenerator visitQuery(ASPCore2Parser.QueryContext ctx) { return visitChildren(ctx); }

    @Override public AspGenerator visitStatement_fact(ASPCore2Parser.Statement_factContext ctx) { return visitChildren(ctx); }

    @Override public AspGenerator visitStatement_constraint(ASPCore2Parser.Statement_constraintContext ctx) { return visitChildren(ctx); }

    @Override public AspGenerator visitStatement_weightConstraint(ASPCore2Parser.Statement_weightConstraintContext ctx) { return visitChildren(ctx); }

    @Override public AspGenerator visitAggregate(ASPCore2Parser.AggregateContext ctx) { return visitChildren(ctx); }

    @Override
    public AspGenerator visitStatement_rule(ASPCore2Parser.Statement_ruleContext ctx) {
        String text = ctx.getText();
        visitChildren(ctx);
        return gen;
    }

    @Override
    public AspGenerator visitHead(ASPCore2Parser.HeadContext ctx) {
        String text = ctx.getText();
        return gen;
    }

    @Override public AspGenerator visitTerm_variable(ASPCore2Parser.Term_variableContext ctx) { return visitChildren(ctx); }

    @Override
    public AspGenerator visitTerminal(TerminalNode node) {
        String text = node.getText();
        return gen;
    }

    @Override
    public AspGenerator visitChildren(RuleNode node) {
        String text = node.getText();
        visitProgram(node.getRuleContext());
        return gen;
    }


}
