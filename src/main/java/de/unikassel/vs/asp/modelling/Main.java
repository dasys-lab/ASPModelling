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
        // Range tuf = new Range().withMin(0).withMax(3);

        Fact eagle = new Fact().withName("eagle").withConstants(eddy);
        Fact penguinTux = new Fact().withName("penguin").withConstants(tux);
        // Fact penguinTuf = new Fact().withName("penguin").withConstants(tuf);

        Variable v1 = new Variable().withName("X");
        Predicate fly = new Predicate().withName("fly").withElements(v1);
        Predicate bird = new Predicate().withName("bird").withElements(v1);
        Predicate notFly = new Predicate().withName("fly").withNot().withFalse().withElements(v1);
        Rule rule1 = new Rule()
                .withHead(new Head().withPredicates(fly))
                .withBody(new Body().withPredicates(bird, notFly));

        Predicate nflyX = new Predicate().withElements().withName("fly").withFalse().withElements(v1);
        Predicate pengX = new Predicate().withName("penguin").withElements(v1);
        Predicate eagleX = new Predicate().withName("eagle").withElements(v1);

        Rule rule2 = new Rule()
                .withHead(new Head().withPredicates(nflyX))
                .withBody(new Body().withPredicates(pengX));

        Rule rule3 = new Rule()
                .withHead(new Head().withPredicates(bird))
                .withBody(new Body().withPredicates(pengX));
        Rule rule4 = new Rule()
                .withHead(new Head().withPredicates(bird))
                .withBody(new Body().withPredicates(eagleX));

        Predicate p1 = new Predicate().withName("test1");
        Predicate p2 = new Predicate().withName("test2");
        // Choice c = new Choice().withPredicates(p1, p2).withUpperBound(1);
        // Rule rule2 = new Rule().withBody(new Body().withPredicates(c));

        AspGenerator gen = new AspGenerator()
                .withFacts(eagle, penguinTux) //, penguinTuf)
                .withRules(rule1, rule2, rule3, rule4);
        System.out.println("ASP: \n" + gen);
        System.out.println();
        System.out.println("Java: \n" + gen.toJavaString());

    }
}