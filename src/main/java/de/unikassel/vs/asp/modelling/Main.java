package de.unikassel.vs.asp.modelling;

import de.unikassel.vs.asp.modelling.syntax.*;

public class Main {

    /**
     * Writes an ASP program to the console.
     *
     * @param args Arguments that influence the program's execution flow..
     */
    public static void main(String[] args) {

        AspGenerator gen = new AspGenerator();

        Constant eddy = new Constant();
        eddy.setName("eddy");

        Constant tux = new Constant();
        tux.setName("tux");

        Range tuf = new Range(0, 3);

        gen.createFact("eagle").withConstant(eddy);
        gen.createFact("penguin").withConstant(tux);
        gen.createFact("penguin").withConstant(tuf);

        Variable v1 = new Variable();
        v1.setName("X");
        gen.createRule().addHead().withPredicate("fly").withVariableAsRule(v1)
                .addBody().withPredicate("bird").withVariableAsBody(v1)
                .withPredicateNot("-fly").withVariableAsBody(v1);

        /* This doesn't work yet with the template
        Choices c = new Choices();
        Predicate p1 = new Predicate();
        p1.setName("test1");
        Predicate p2 = new Predicate();
        p2.setName("test2");
        c.addPredicate(new Predicate());
        c.addPredicate(p1);
        c.addPredicate(p2);

        gen.createRule().addBody().getTerms().add(c);
         */


        System.out.println(gen);

    }
}