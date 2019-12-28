package de.unikassel.vs.asp.modelling;

import de.unikassel.vs.asp.modelling.syntax.*;

/**
 * Full rule set ASP examples.
 */
public class Examples {

    /**
     * Getter for the flying birds example.
     *
     * @return A rule set for the flying birds example.
     */
    public static Rule[] getFlyingBirds() {
        Constant eddy = new Constant().withName("eddy");
        Constant tux = new Constant().withName("tux");
        Rule eagle = new Rule()
                .withHead(new Head()
                        .withPredicates(new Predicate().withName("eagle").withElements(eddy)));
        Rule penguinTuf = new Rule()
                .withHead(new Head().withPredicates(new Predicate().withName("penguin").withElements(tux)));
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

        return new Rule[]{eagle, penguinTuf, rule1, rule2, rule3, rule4};
    }
}
