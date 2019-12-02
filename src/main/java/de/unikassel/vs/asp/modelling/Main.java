package de.unikassel.vs.asp.modelling;

import de.unikassel.vs.asp.modelling.syntax.*;

public class Main {

    /**
     * Writes an ASP program to the console.
     *
     * @param args Arguments that influence the program's execution flow..
     */
    public static void main(String[] args) {

        Constant eddy = new Constant().withName("eddy");
        Constant tux = new Constant().withName("tux");
        Range tuf = new Range().withMin(0).withMax(3);

        Fact eagle = new Fact().withName("eagle").withConstants(eddy);
        Fact penguinTux = new Fact().withName("penguin").withConstants(tux);
        Fact penguinTuf = new Fact().withName("penguin").withConstants(tuf);

        Variable v1 = new Variable().withName("X");
        Predicate fly = new Predicate().withName("fly").withElements(v1);
        Predicate bird = new Predicate().withName("bird").withElements(v1);
        Predicate notFly = new Predicate().withName("-fly").withTrue(false).withElements(v1);
        Rule rule1 = new Rule()
                .withHead(new Head().withPredicates(fly))
                .withBody(new Body().withPredicates(bird, notFly));
        Predicate p1 = new Predicate();
        p1.withName("test1");
        Predicate p2 = new Predicate();
        p2.withName("test2");
        Choice c = new Choice().withPredicates(p1, p2).withUpperBound(1);
        Rule rule2 = new Rule().withBody(new Body().withPredicates(c));

        AspGenerator gen = new AspGenerator()
                .withFacts(eagle, penguinTux, penguinTuf)
                .withRules(rule1, rule2);
        System.out.println(gen);

    }
}