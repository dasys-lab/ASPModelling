package de.unikassel.vs.asp.modelling;

import de.unikassel.vs.asp.modelling.syntax.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AspStringGenerationTest {

    final String lineSeparator = System.getProperty("line.separator");

    @Test
    public void predicateStringTest() {
        String testString = "fly(X) :- bird(X), not -fly(X).";


        Variable v1 = new Variable().withName("X");
        Predicate fly = new Predicate().withName("fly").withElements(v1);
        Predicate bird = new Predicate().withName("bird").withElements(v1);
        Predicate notFly = new Predicate().withName("fly").withNot().withFalse().withElements(v1);
        Rule rule = new Rule()
                .withHead(new Head().withPredicates(fly))
                .withBody(new Body().withPredicates(bird, notFly));

        AspGenerator gen = new AspGenerator().withRules(rule);
        Assertions.assertEquals(testString, gen.toString());
    }

    @Test
    public void factStringTest() {

        final String testString = "eagle(eddy).penguin(tux).penguin(0..3).";

        Constant eddy = new Constant().withName("eddy");

        Constant tux = new Constant().withName("tux");

        Range tuf = new Range().withMin(0).withMax(3);

        Rule eagle = new Rule().withHead(
                new Head().withPredicates(new Predicate().withName("eagle").withElements(eddy)));
        Rule penguinTux = new Rule().withHead(
                new Head().withPredicates(new Predicate().withName("penguin").withElements(tux)));
        Rule penguinTuf = new Rule().withHead(
                new Head().withPredicates(new Predicate().withName("penguin").withElements(tuf)));

        AspGenerator gen = new AspGenerator().withRules(eagle, penguinTux, penguinTuf);
        final String generatedCodeString = gen.toString().replaceAll(lineSeparator, "");

        Assertions.assertEquals(testString, generatedCodeString);
    }

    @Test
    public void moreDigitPredicatesAndFacts() {
        final String testString = "edge(eddy, tux).fromEddy(X) :- edge(eddy, X).";

        Variable x = new Variable().withName("X");

        Constant eddy = new Constant().withName("eddy");

        Constant tux = new Constant().withName("tux");

        Rule ruleOne = new Rule().withHead(
                new Head().withPredicates(new Predicate().withName("edge").withElements(eddy, tux)));

        Predicate fromEddy = new Predicate().withName("fromEddy").withElements(x);
        Predicate edge = new Predicate().withName("edge").withElements(eddy, x);
        Rule ruleTwo = new Rule()
                .withHead(new Head().withPredicates(fromEddy))
                .withBody(new Body().withPredicates(edge));

        AspGenerator gen = new AspGenerator()
                .withRules(ruleOne, ruleTwo);
        final String generatedCodeString = gen.toString().replaceAll(lineSeparator, "");

        Assertions.assertEquals(testString, generatedCodeString);
    }

    @Test
    public void conditionalLiteral() {

        final String testString = "a(X, Y) :- b(X, Y) : c(X, Y); d(X, Y).";

        Variable x = new Variable().withName("X");
        Variable y = new Variable().withName("Y");

        Predicate a = new Predicate().withName("a")
                .withElements(x, y);
        Predicate b = new Predicate().withName("b")
                .withElements(x, y);
        Predicate c = new Predicate().withName("c")
                .withElements(x, y);
        Predicate d = new Predicate().withName("d")
                .withElements(x, y);

        // ConditionalLiterals in the Asp-program
        ConditionalLiteral conditionalLiteral = new ConditionalLiteral()
                .withConditional(b)
                .withConditions(c);


        // Rules, that are part of the Asp-program
        Rule rule = new Rule()
                .withHead(new Head().withPredicates(a))
                .withBody(new Body().withPredicates(conditionalLiteral, d));

        // The final model
        AspGenerator gen = new AspGenerator()
                .withRules(rule);

        Assertions.assertEquals(testString, gen.toString());
    }
}
