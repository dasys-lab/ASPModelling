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

        Constant eddy = new Constant().withName("eddy");

        Constant tux = new Constant().withName("tux");

        Range tuf = new Range(0, 3);

        gen.createFact("eagle").withConstants(eddy);
        gen.createFact("penguin").withConstants(tux);
        gen.createFact("penguin").withConstants(tuf);

        Variable v1 = new Variable().withName("X");
        Predicate fly = new Predicate().withName("fly").withElements(v1);
        Predicate bird = new Predicate().withName("bird").withElements(v1);
        Predicate notFly = new Predicate().withName("-fly").withTrue(false).withElements(v1);
        Rule rule = gen.createRule()
                .withHead(new Head().withPredicates(fly))
                .withBody(new Body().withPredicates(bird, notFly));
        Predicate p1 = new Predicate();
        p1.withName("test1");
        Predicate p2 = new Predicate();
        p2.withName("test2");
        Choice c = new Choice().withPredicates(p1, p2).withUpperBound(1);
        gen.createRule().withBody(new Body().withPredicates(c));

        System.out.println(gen);

    }
}