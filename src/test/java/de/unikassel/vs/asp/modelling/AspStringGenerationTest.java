package de.unikassel.vs.asp.modelling;

import de.unikassel.vs.asp.modelling.syntax.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AspStringGenerationTest {

    final String lineSeparator = System.getProperty("line.separator");

    @Test
    public void predicateStringTest() {
        String testString = "fly(X) :- bird(X), not -fly(X).";

        AspGenerator gen = new AspGenerator();

        Variable v1 = new Variable().withName("X");
        Predicate fly = new Predicate().withName("fly").withElements(v1);
        Predicate bird = new Predicate().withName("bird").withElements(v1);
        Predicate notFly = new Predicate().withName("-fly").withTrue(false).withElements(v1);
        gen.createRule()
                .withHead(new Head().withPredicates(fly))
                .withBody(new Body().withPredicates(bird, notFly));

        Assertions.assertEquals(testString, gen.toString());
    }

    @Test
    public void factStringTest() {

        final String testString = "eagle(eddy).penguin(tux).penguin(0..3).";

        AspGenerator gen = new AspGenerator();

        Constant eddy = new Constant().withName("eddy");

        Constant tux = new Constant().withName("tux");

        Range tuf = new Range(0, 3);

        gen.createFact("eagle").withConstants(eddy);
        gen.createFact("penguin").withConstants(tux);
        gen.createFact("penguin").withConstants(tuf);

        final String generatedCodeString = gen.toString().replaceAll(lineSeparator, "");

        Assertions.assertEquals(testString, generatedCodeString);
    }

    @Test
    public void moreDigitPredicatesAndFacts() {
        final String testString = "edge(eddy, tux).fromEddy(X) :- edge(eddy, X).";


        Variable x = new Variable().withName("X");

        Constant eddy = new Constant().withName("eddy");

        Constant tux = new Constant().withName("tux");

        AspGenerator gen = new AspGenerator();

        gen.createFact("edge").withConstants(eddy, tux);

        Predicate fromEddy = new Predicate().withName("fromEddy").withElements(x);
        Predicate edge = new Predicate().withName("edge").withElements(eddy, x);
        gen.createRule()
                .withHead(new Head().withPredicates(fromEddy))
                .withBody(new Body().withPredicates(edge));

        final String generatedCodeString = gen.toString().replaceAll(lineSeparator, "");

        Assertions.assertEquals(testString, generatedCodeString);
    }
}
