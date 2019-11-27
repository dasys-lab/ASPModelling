package de.unikassel.vs.asp.modelling;

import de.unikassel.vs.asp.modelling.syntax.Constant;
import de.unikassel.vs.asp.modelling.syntax.Range;
import de.unikassel.vs.asp.modelling.syntax.Variable;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AspStringGenerationTest {

    @Test
    public void predicateStringTest() {
        String testString = "fly(X) :- bird(X), not -fly(X).";

        AspGenerator gen = new AspGenerator();

        Variable v1 = new Variable();
        v1.setName("X");
        gen.createRule().addHead().withPredicate("fly").withVariableAsRule(v1)
                .addBody().withPredicate("bird").withVariableAsBody(v1)
                .withPredicateNot("-fly").withVariableAsBody(v1);

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

        final String lineSeparator = System.getProperty("line.separator");

        final String generatedCodeString = gen.toString().replaceAll(lineSeparator, "");

        Assertions.assertEquals(testString.replaceAll(lineSeparator, ""), generatedCodeString);
    }
}
