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

        gen.createFact("eagle").withConstants(eddy);
        gen.createFact("penguin").withConstants(tux);
        gen.createFact("penguin").withConstants(tuf);

        Variable v1 = new Variable();
        v1.setName("X");
        Predicate fly = new Predicate().withName("fly").withElements(v1);
        Predicate bird = new Predicate().withName("bird").withElements(v1);
        Predicate notFly = new Predicate().withName("-fly").withTrue(false).withElements(v1);
        Rule rule = gen.createRule();
        rule.addHead().withPredicates(fly);
        rule.addBody().withPredicates(bird, notFly);

        Choice c = new Choice().withUpperBound(1);
        Predicate p1 = new Predicate();
        p1.withName("test1");
        Predicate p2 = new Predicate();
        p2.withName("test2");
        c.addPredicate(p1);
        c.addPredicate(p2);
        gen.createRule().addBody().getPredicateTerms().add(c);

        System.out.println(gen);

    }
}