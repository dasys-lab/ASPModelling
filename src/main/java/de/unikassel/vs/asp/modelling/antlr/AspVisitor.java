package de.unikassel.vs.asp.modelling.antlr;

import de.unikassel.vs.asp.modelling.AspGenerator;
import de.unikassel.vs.asp.modelling.syntax.*;
import java.util.List;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;

public class AspVisitor extends ASPCore2BaseVisitor<AspGenerator> {

    boolean notToSet;
    boolean nextPredicateInChoice;

    AspGenerator gen = new AspGenerator();
    Rule currentRule;
    RuleComponent currentHeadOrBody;
    Predicate currentPredicate;
    Choice currentChoice;
    ConditionalLiteral currentConditionalLiteral;

    /**
     * Visits the top level token (ProgramContext).
     *
     * @return The complete AspGenerator.
     */
    @Override
    public AspGenerator visitProgram(ASPCore2Parser.ProgramContext ctx) {
        visitChildren(ctx);
        return gen;
    }

    @Override
    public AspGenerator visitStatement_rule(ASPCore2Parser.Statement_ruleContext ctx) {
        currentRule = new Rule();
        this.gen.withRules(currentRule);
        visitChildren(ctx);
        return gen;
    }

    /**
     * Statement_Facts are rules within our Java-Asp-Structure.
     */
    @Override
    public AspGenerator visitStatement_fact(ASPCore2Parser.Statement_factContext ctx) {
        currentRule = new Rule();
        this.gen.withRules(currentRule);
        visitChildren(ctx);
        return gen;
    }

    /**
     * Statement_Constraints are rules within our Java-Asp-Structure.
     */
    @Override
    public AspGenerator visitStatement_constraint(ASPCore2Parser.Statement_constraintContext ctx) {
        currentRule = new Rule();
        this.gen.withRules(currentRule);
        visitChildren(ctx);
        return gen;
    }

    @Override
    public AspGenerator visitHead(ASPCore2Parser.HeadContext ctx) {
        if (currentRule.getHead() == null) {
            currentHeadOrBody = new Head();
        }
        currentRule.withHead(currentHeadOrBody);
        visitChildren(ctx);
        return gen;
    }

    @Override
    public AspGenerator visitBody(ASPCore2Parser.BodyContext ctx) {
        if (currentRule.getBody() == null) {
            currentHeadOrBody = new Body();
        }
        currentRule.withBody(currentHeadOrBody);
        visitChildren(ctx);
        return gen;
    }

    @Override
    public AspGenerator visitChoice(ASPCore2Parser.ChoiceContext ctx) {
        currentChoice = new Choice();
        currentHeadOrBody.withPredicates(currentChoice);
        nextPredicateInChoice = true;
        setChoiceBounds(ctx);
        visitChildren(ctx);
        nextPredicateInChoice = false;
        return gen;
    }

    /**
     * No colon indicates that last predicate within the choice.
     */
    @Override
    public AspGenerator visitChoice_element(ASPCore2Parser.Choice_elementContext ctx) {
        TerminalNode colon = ctx.COLON();
        visitChildren(ctx);
        if (colon == null) {
            nextPredicateInChoice = false;
        }
        return gen;
    }


    @Override
    public AspGenerator visitNaf_literal(ASPCore2Parser.Naf_literalContext ctx) {
        // NAF corresponds to "not"
        if (ctx.NAF() != null) {
            notToSet = true;
        }
        visitChildren(ctx);
        return gen;
    }

    @Override
    public AspGenerator visitConditional_literal(ASPCore2Parser.Conditional_literalContext ctx) {
        currentConditionalLiteral = new ConditionalLiteral();
        if (nextPredicateInChoice && currentChoice != null) {
            currentChoice.withPredicates(currentConditionalLiteral);
        } else {
            currentHeadOrBody.withPredicates(currentConditionalLiteral);
        }
        visitChildren(ctx);
        return gen;
    }

    @Override
    public AspGenerator visitConditional(ASPCore2Parser.ConditionalContext ctx) {
        TerminalNode minus = ctx.MINUS();
        TerminalNode id = ctx.ID();
        TerminalNode not = ctx.NAF();
        configureCurrentPredicate(minus, id, not);
        currentConditionalLiteral.withConditional(currentPredicate);
        visitChildren(ctx);
        return gen;
    }

    @Override
    public AspGenerator visitConditions(ASPCore2Parser.ConditionsContext ctx) {
        List<ASPCore2Parser.ConditionContext> conditions = ctx.condition();
        for (ASPCore2Parser.ConditionContext conditionContext : conditions) {
            TerminalNode minus = conditionContext.MINUS();
            TerminalNode id = conditionContext.ID();
            TerminalNode not = conditionContext.NAF();
            configureCurrentPredicate(minus, id, not);
            currentConditionalLiteral.withConditions(currentPredicate);
        }
        visitChildren(ctx);
        return gen;
    }

    @Override
    public AspGenerator visitClassical_literal(ASPCore2Parser.Classical_literalContext ctx) {
        TerminalNode minus = ctx.MINUS();
        TerminalNode id = ctx.ID();
        configureCurrentPredicate(minus, id, null);
        if (nextPredicateInChoice && currentChoice != null) {
            currentChoice.withPredicates(currentPredicate);
        } else {
            currentHeadOrBody.withPredicates(currentPredicate);
        }
        visitChildren(ctx);
        return gen;
    }

    @Override
    public AspGenerator visitTerm_variable(ASPCore2Parser.Term_variableContext ctx) {
        String variableName = ctx.getText();
        Variable variable = new Variable();
        variable.withName(variableName);
        currentPredicate.withElements(variable);
        visitChildren(ctx);
        return gen;
    }

    @Override
    public AspGenerator visitTerm_const(ASPCore2Parser.Term_constContext ctx) {
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
        Range range = configureRange(ctx);
        currentPredicate.withElements(range);
        visitChildren(ctx);
        return gen;
    }

    private void configureCurrentPredicate(TerminalNode minus, TerminalNode id, TerminalNode not) {
        String predicateName = id.toString();
        currentPredicate = new Predicate();
        currentPredicate.withName(predicateName);
        if (not != null || notToSet) {
            currentPredicate.withNot();
            notToSet = false;
        }
        if (minus != null) {
            currentPredicate.withFalse();
        }
    }

    private Range configureRange(ASPCore2Parser.IntervalContext ctx) {
        Range range = new Range();
        Token lower = ctx.lower;
        Token upper = ctx.upper;
        range.withMin(Integer.parseInt(lower.getText()));
        range.withMax(Integer.parseInt(upper.getText()));
        return range;
    }

    private void setChoiceBounds(ASPCore2Parser.ChoiceContext ctx) {
        // check for lower bound
        if (ctx.lt != null) {
            int lowerBound = Integer.parseInt(ctx.lt.getText());
            currentChoice.withUpperBound(lowerBound);
        }
        // check for upper bound
        if (ctx.ut != null) {
            int upperBound = Integer.parseInt(ctx.ut.getText());
            currentChoice.withUpperBound(upperBound);
        }
        // check for upper and lower bound expression
        if (ctx.ut != null && ctx.uop.EQUAL() != null) {
            int upperAndLowerBound = Integer.parseInt(ctx.ut.getText());
            currentChoice.withUpperBound(upperAndLowerBound);
            currentChoice.withLowerBound(upperAndLowerBound);
        }
    }
}
