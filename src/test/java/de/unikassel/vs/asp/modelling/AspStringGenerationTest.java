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
        Predicate notFly = new Predicate().withName("-fly").withTrue(false).withElements(v1);
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

        Fact eagle = new Fact().withName("eagle").withConstants(eddy);
        Fact penguinTux = new Fact().withName("penguin").withConstants(tux);
        Fact penguinTuf = new Fact().withName("penguin").withConstants(tuf);

        AspGenerator gen = new AspGenerator().withFacts(eagle, penguinTux, penguinTuf);
        final String generatedCodeString = gen.toString().replaceAll(lineSeparator, "");

        Assertions.assertEquals(testString, generatedCodeString);
    }

    @Test
    public void moreDigitPredicatesAndFacts() {
        final String testString = "edge(eddy, tux).fromEddy(X) :- edge(eddy, X).";


        Variable x = new Variable().withName("X");

        Constant eddy = new Constant().withName("eddy");

        Constant tux = new Constant().withName("tux");

        Fact fact = new Fact().withName("edge").withConstants(eddy, tux);

        Predicate fromEddy = new Predicate().withName("fromEddy").withElements(x);
        Predicate edge = new Predicate().withName("edge").withElements(eddy, x);
        Rule rule = new Rule()
                .withHead(new Head().withPredicates(fromEddy))
                .withBody(new Body().withPredicates(edge));

        AspGenerator gen = new AspGenerator()
                .withFacts(fact)
                .withRules(rule);
        final String generatedCodeString = gen.toString().replaceAll(lineSeparator, "");

        Assertions.assertEquals(testString, generatedCodeString);
    }
}
