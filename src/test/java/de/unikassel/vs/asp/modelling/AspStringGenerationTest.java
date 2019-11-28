package de.unikassel.vs.asp.modelling;

import de.unikassel.vs.asp.modelling.syntax.Constant;
import de.unikassel.vs.asp.modelling.syntax.Range;
import de.unikassel.vs.asp.modelling.syntax.Variable;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AspStringGenerationTest {

    final static String lineSeparator = System.getProperty("line.separator");

    @Test
    public void predicateStringTest() {
        String testString = "fly(X) :- bird(X), not -fly(X).";

        AspGenerator gen = new AspGenerator();

        Variable v1 = new Variable();
        v1.setName("X");
        gen.createRule().addHead().withPredicate("fly").withElementsAsRule(v1)
                .addBody().withPredicate("bird").withElementsAsBody(v1)
                .withPredicateNot("-fly").withElementsAsBody(v1);

        Assertions.assertEquals(testString, gen.toString());
    }

    @Test
    public void factStringTest() {

        final String testString = "eagle(eddy).penguin(tux).penguin(0..3).";

        AspGenerator gen = new AspGenerator();

        Constant eddy = new Constant();
        eddy.setName("eddy");

        Constant tux = new Constant();
        tux.setName("tux");

        Range tuf = new Range(0, 3);

        gen.createFact("eagle").withConstant(eddy);
        gen.createFact("penguin").withConstant(tux);
        gen.createFact("penguin").withConstant(tuf);

        final String generatedCodeString = gen.toString().replaceAll(lineSeparator, "");

        Assertions.assertEquals(testString, generatedCodeString);
    }

    @Test
    public void moreDigitPredicatesAndFacts(){
        final String testString = "edge(eddy, tux).fromEddy(X) :- edge(eddy, X).";

        AspGenerator gen = new AspGenerator();

        Variable x = new Variable();
        x.setName("X");

        Constant eddy = new Constant();
        eddy.setName("eddy");

        Constant tux = new Constant();
        tux.setName("tux");

        gen.createFact("edge").withConstant(eddy, tux);

        gen.createRule().addHead().withPredicate("fromEddy").withElementsAsRule(x)
                .addBody().withPredicate("edge").withElementsAsBody(eddy, x);

        final String generatedCodeString = gen.toString().replaceAll(lineSeparator, "");

        Assertions.assertEquals(testString, generatedCodeString);
    }
}
