package de.unikassel.vs.asp.modelling.antlr;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import de.unikassel.vs.asp.modelling.AspGenerator;
import de.unikassel.vs.asp.modelling.syntax.Body;
import de.unikassel.vs.asp.modelling.syntax.Head;
import de.unikassel.vs.asp.modelling.syntax.Rule;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.Token;



public class EvalVisitor extends ASPCore2BaseVisitor {

    Map<String, Rule> statements = new HashMap<String, Rule>();
    Map<String, String> queries = new HashMap<String, String>();
    AspGenerator gen;


    @Override
    public AspGenerator visitProgram(ASPCore2Parser.ProgramContext ctx) {
        gen = new AspGenerator();
        ASPCore2Parser.QueryContext query = ctx.query();
        RuleContext ruleContext = ctx.getRuleContext();
        Token start = ctx.getStart();
        Class<? extends ASPCore2Parser.ProgramContext> aClass = ctx.getClass();
        gen.withRules(visitStatements(ctx.statements()));
        return gen;
    }
    // ???
    @Override
    public ArrayList<Rule> visitStatements(ASPCore2Parser.StatementsContext ctx) {
        ArrayList<Rule> rules = new ArrayList<Rule>();
        for (ASPCore2Parser.StatementContext context: ctx.statement()){
            rules.add(visitStatement_rule((ASPCore2Parser.Statement_ruleContext) context.getRuleContext()));
        }
        return rules;
    }


    @Override public Rule visitStatement_rule(ASPCore2Parser.Statement_ruleContext ctx) {
        Rule rule = new Rule();
        rule.withHead(visitHead(ctx.head()));
        rule.withBody(visitBody(ctx.body()));
        return rule;
    }

    @Override
    public Head visitHead(ASPCore2Parser.HeadContext ctx) {
        Head head = new Head();
        return head;
    }

    @Override public Body visitBody(ASPCore2Parser.BodyContext ctx) {
        Body body = new Body();
        return body;
    }
    /*
    @Override public T visitQuery(ASPCore2Parser.QueryContext ctx) { return visitChildren(ctx); }

    @Override public T visitStatement_fact(ASPCore2Parser.Statement_factContext ctx) { return visitChildren(ctx); }

    @Override public T visitStatement_constraint(ASPCore2Parser.Statement_constraintContext ctx) { return visitChildren(ctx); }

    @Override public T visitStatement_weightConstraint(ASPCore2Parser.Statement_weightConstraintContext ctx) { return visitChildren(ctx); }

    @Override public T visitStatement_directive(ASPCore2Parser.Statement_directiveContext ctx) { return visitChildren(ctx); }

    @Override public T visitDisjunction(ASPCore2Parser.DisjunctionContext ctx) { return visitChildren(ctx); }

    @Override public T visitChoice(ASPCore2Parser.ChoiceContext ctx) { return visitChildren(ctx); }

    @Override public T visitChoice_elements(ASPCore2Parser.Choice_elementsContext ctx) { return visitChildren(ctx); }

    @Override public T visitChoice_element(ASPCore2Parser.Choice_elementContext ctx) { return visitChildren(ctx); }

    @Override public T visitTerms(ASPCore2Parser.TermsContext ctx) { return visitChildren(ctx); }

    @Override public T visitTerm_variable(ASPCore2Parser.Term_variableContext ctx) { return visitChildren(ctx); }

     */
}
