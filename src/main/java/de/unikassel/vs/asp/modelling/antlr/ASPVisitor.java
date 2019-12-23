package de.unikassel.vs.asp.modelling.antlr;

import de.unikassel.vs.asp.modelling.AspGenerator;
import de.unikassel.vs.asp.modelling.syntax.*;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

public class ASPVisitor extends ASPCore2BaseVisitor<AspGenerator> {

    boolean notToSet;
    boolean nextPredicateInChoice;

    AspGenerator gen = new AspGenerator();
    Rule currentRule;
    RuleComponent currentHeadOrBody;
    Predicate currentPredicate;
    Choice currentChoice;
    ConditionalLiteral currentConditionalLiteral;

    @Override
    public AspGenerator visitProgram(ASPCore2Parser.ProgramContext ctx) {
        visitChildren(ctx);
        return gen;
    }

    @Override
    public AspGenerator visitHead(ASPCore2Parser.HeadContext ctx) {
        String text = ctx.getText();
        if (currentRule.getHead() == null){
            currentHeadOrBody = new Head();
        }
        currentRule.withHead(currentHeadOrBody);
        visitChildren(ctx);
        return gen;
    }

    @Override
    public AspGenerator visitBody(ASPCore2Parser.BodyContext ctx) {
        String text = ctx.getText();
        if (currentRule.getBody() == null){
            currentHeadOrBody = new Body();
        }
        currentRule.withBody(currentHeadOrBody);
        visitChildren(ctx);
        return gen;
    }

    @Override
    public AspGenerator visitChoice(ASPCore2Parser.ChoiceContext ctx) {
        String text = ctx.getText();
        currentChoice = new Choice();
        currentHeadOrBody.withPredicates(currentChoice);
        nextPredicateInChoice = true;

        if (ctx.lt != null){
            int lowerBound =  Integer.parseInt(ctx.lt.getText());
            currentChoice.withUpperBound(lowerBound);
        }
        if (ctx.ut != null){
            int upperBound =  Integer.parseInt(ctx.ut.getText());
            currentChoice.withUpperBound(upperBound);
        }
        if (ctx.ut != null && ctx.uop.EQUAL() != null) {
            int upperAndLowerBound =  Integer.parseInt(ctx.ut.getText());
            currentChoice.withUpperBound(upperAndLowerBound);
            currentChoice.withLowerBound(upperAndLowerBound);
        };
        visitChildren(ctx);
        nextPredicateInChoice = false;
        return gen;
    }

    @Override
    public AspGenerator visitChoice_element(ASPCore2Parser.Choice_elementContext ctx) {
        TerminalNode colon = ctx.COLON();
        if (colon != null) {
            currentConditionalLiteral = new ConditionalLiteral();
        }
        visitChildren(ctx);
        if (colon == null) {
            nextPredicateInChoice = false;
        }
        return gen;
    }


    @Override
    public AspGenerator visitNaf_literal(ASPCore2Parser.Naf_literalContext ctx) {
        String text = ctx.getText();
        ASPCore2Parser.Builtin_atomContext builtin_atomContext = ctx.builtin_atom();
        TerminalNode naf = ctx.NAF();
        if (naf != null) {
            notToSet = true;
        }
        visitChildren(ctx);
        return gen;
    }

    @Override
    public AspGenerator visitConditional_literal(ASPCore2Parser.Conditional_literalContext ctx) {
        String text = ctx.getText();
        currentConditionalLiteral = new ConditionalLiteral();
        if (nextPredicateInChoice && currentChoice != null){
            currentChoice.withPredicates(currentConditionalLiteral);
        } else {
            currentHeadOrBody.withPredicates(currentConditionalLiteral);
        }
        visitChildren(ctx);
        return gen;
    }

    @Override
    public AspGenerator visitConditional(ASPCore2Parser.ConditionalContext ctx) {
        String text = ctx.getText();
        Predicate conditional = new Predicate();
        TerminalNode minus = ctx.classical_literal().MINUS();
        TerminalNode id = ctx.classical_literal().ID();
        String conditionalName = id.toString();
        conditional.withName(conditionalName);
        if (notToSet) {
            conditional.withNot();
            notToSet = false;
        }
        if (minus != null) {
            conditional.withFalse();
        }
        currentConditionalLiteral.withConditional(conditional);
        visitChildren(ctx);
        return gen;
    }

    @Override
    public AspGenerator visitConditions(ASPCore2Parser.ConditionsContext ctx) {
        String text = ctx.getText();
        List<ASPCore2Parser.ConditionContext> conditions = ctx.condition();
        for (ASPCore2Parser.ConditionContext conditionContext: conditions){
            Predicate condition = new Predicate();
            TerminalNode minus = conditionContext.classical_literal().MINUS();
            TerminalNode id = conditionContext.classical_literal().ID();
            String conditionName = id.toString();
            condition.withName(conditionName);
            if (notToSet) {
                condition.withNot();
                notToSet = false;
            }
            if (minus != null) {
                condition.withFalse();
            }
            currentConditionalLiteral.withConditions(condition);
            visitChildren(ctx);
        }


        visitChildren(ctx);
        return gen;
    }

    @Override
    public AspGenerator visitClassical_literal(ASPCore2Parser.Classical_literalContext ctx) {
        String text = ctx.getText();
        TerminalNode minus = ctx.MINUS();
        TerminalNode id = ctx.ID();
        String predicateName = id.toString();
        currentPredicate = new Predicate();
        currentPredicate.withName(predicateName);
        if (notToSet) {
            currentPredicate.withNot();
            notToSet = false;
        }
        if (minus != null) {
            currentPredicate.withFalse();
        }
        if (nextPredicateInChoice && currentChoice != null){
            currentChoice.withPredicates(currentPredicate);
        } else {
            currentHeadOrBody.withPredicates(currentPredicate);
        }
        visitChildren(ctx);
        return gen;
    }

    @Override
    public AspGenerator visitTerm_variable(ASPCore2Parser.Term_variableContext ctx) {
        String text = ctx.getText();
        String variableName = ctx.getText();
        Variable variable = new Variable();
        variable.withName(variableName);
        currentPredicate.withElements(variable);
        visitChildren(ctx);
        return gen;
    }

    @Override
    public AspGenerator visitTerm_const(ASPCore2Parser.Term_constContext ctx) {
        String text = ctx.getText();
        String constantName = ctx.getText();
        Constant constant = new Constant();
        constant.withName(constantName);
        currentPredicate.withElements(constant);
        visitChildren(ctx);
        return gen;
    }

    @Override
    public AspGenerator visitTerm_number(ASPCore2Parser.Term_numberContext ctx) {
        String constantName = ctx.getText();
        Constant constant = new Constant();
        constant.withName(constantName);
        currentPredicate.withElements(constant);
        visitChildren(ctx);
        return gen;
    }

    @Override
    public AspGenerator visitInterval(ASPCore2Parser.IntervalContext ctx) {
        String text = ctx.getText();
        Range range = new Range();
        Token lower = ctx.lower;
        Token upper = ctx.upper;
        range.withMin(Integer.parseInt(lower.getText()));
        range.withMax(Integer.parseInt(upper.getText()));
        currentPredicate.withElements(range);
        visitChildren(ctx);
        return gen;
    }

    @Override
    public AspGenerator visitStatement_rule(ASPCore2Parser.Statement_ruleContext ctx) {
        String text = ctx.getText();
        currentRule = new Rule();
        this.gen.withRules(currentRule);
        visitChildren(ctx);
        return gen;
    }

    @Override
    public AspGenerator visitStatement_fact(ASPCore2Parser.Statement_factContext ctx) {
        String text = ctx.getText();
        currentRule = new Rule();
        this.gen.withRules(currentRule);
        visitChildren(ctx);
        return gen;
    }

    @Override
    public AspGenerator visitStatement_constraint(ASPCore2Parser.Statement_constraintContext ctx) {
        String text = ctx.getText();
        currentRule = new Rule();
        this.gen.withRules(currentRule);
        visitChildren(ctx);
        return gen;
    }



    //
//    @Override public AspGenerator visitQuery(ASPCore2Parser.QueryContext ctx) { return visitChildren(ctx); }
//
//    @Override public AspGenerator visitStatement_weightConstraint(ASPCore2Parser.Statement_weightConstraintContext ctx) { return visitChildren(ctx); }
//
//    @Override public AspGenerator visitAggregate(ASPCore2Parser.AggregateContext ctx) { return visitChildren(ctx); }
}
