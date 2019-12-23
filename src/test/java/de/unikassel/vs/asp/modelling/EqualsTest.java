package de.unikassel.vs.asp.modelling;

import de.unikassel.vs.asp.modelling.syntax.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class EqualsTest {

    @Test
    public void constantsEquals() {
        Constant c1 = new Constant().withName("x1");
        Constant c2 = new Constant().withName("x1");
        Constant c3 = new Constant().withName("x2");

        Assertions.assertEquals(c1, c2);
        Assertions.assertNotEquals(c1, c3);
    }

    @Test
    public void variablesEquals() {
        Constant c1 = new Constant().withName("x1");
        Variable v1 = new Variable().withName("X1").withConstantsOutOfValueRange(c1);
        Variable v2 = new Variable().withName("X1").withConstantsOutOfValueRange(c1);
        Variable v3 = new Variable().withName("Y1").withConstantsOutOfValueRange(c1);

        Assertions.assertEquals(v1, v2);
        Assertions.assertNotEquals(v1, v3);
    }

    @Test
    public void rangeEquals() {
        Range r1 = new Range().withMin(1).withMax(3);
        Range r2 = new Range().withMin(1).withMax(3);
        Range r3 = new Range().withMin(3).withMax(5);

        Assertions.assertEquals(r1, r2);
        Assertions.assertNotEquals(r1, r3);
    }

    @Test
    public void predicateEquals() {
        Predicate p1 = new Predicate().withName("x1").withNot().withFalse();
        Predicate p2 = new Predicate().withName("x1").withNot().withFalse();
        Predicate p3 = new Predicate().withName("x1").withNot();

        Assertions.assertEquals(p1, p2);
        Assertions.assertNotEquals(p1, p3);
    }

    @Test
    public void choiceEquals() {
        Predicate p1 = new Predicate().withName("x1").withNot().withFalse();
        Predicate p2 = new Predicate().withName("x1").withNot().withFalse();
        Predicate p3 = new Predicate().withName("x1").withNot();

        Choice c1 = new Choice().withPredicates(p1,p2,p3).withLowerBound(1).withUpperBound(3);
        Choice c2 = new Choice().withPredicates(p1,p2,p3).withLowerBound(1).withUpperBound(3);
        Choice c3 = new Choice().withPredicates(p1,p3).withLowerBound(1).withUpperBound(2);

        Assertions.assertEquals(c1, c2);
        Assertions.assertNotEquals(c1, c3);
    }

    @Test
    public void conditionalLiteralEquals() {
        Predicate p1 = new Predicate().withName("x1").withNot().withFalse();
        Predicate p2 = new Predicate().withName("x1").withNot().withFalse();
        Predicate p3 = new Predicate().withName("x1").withNot();
        Predicate p4 = new Predicate().withName("x3").withNot();

        ConditionalLiteral cl1 = new ConditionalLiteral().withConditional(p1).withConditions(p2,p3);
        ConditionalLiteral cl2 = new ConditionalLiteral().withConditional(p1).withConditions(p2,p3);
        ConditionalLiteral cl3 = new ConditionalLiteral().withConditional(p1).withConditions(p2,p4);

        Assertions.assertEquals(cl1, cl2);
        Assertions.assertNotEquals(cl1, cl3);
    }

    @Test
    public void bodyEquals() {
        Predicate p1 = new Predicate().withName("x1").withNot().withFalse();
        Predicate p2 = new Predicate().withName("x1").withNot().withFalse();
        Predicate p3 = new Predicate().withName("x1").withNot();
        Predicate p4 = new Predicate().withName("x3").withNot();

        Body b1 = new Body().withPredicates(p1,p3,p4);
        Body b2 = new Body().withPredicates(p1,p3,p4);
        Body b3 = new Body().withPredicates(p1,p2,p4);

        Assertions.assertEquals(b1, b2);
        Assertions.assertNotEquals(b1, b3);
    }

    @Test
    public void headEquals() {
        Predicate p1 = new Predicate().withName("x1").withNot().withFalse();
        Predicate p2 = new Predicate().withName("x1").withNot().withFalse();
        Predicate p3 = new Predicate().withName("x1").withNot();
        Predicate p4 = new Predicate().withName("x3").withNot();

        Head h1 = new Head().withPredicates(p1,p3,p4);
        Head h2 = new Head().withPredicates(p1,p3,p4);
        Head h3 = new Head().withPredicates(p1,p2,p4);

        Assertions.assertEquals(h1, h2);
        Assertions.assertNotEquals(h1, h3);
    }

    @Test
    public void ruleEquals() {
        Predicate p1 = new Predicate().withName("x1").withNot().withFalse();
        Predicate p2 = new Predicate().withName("x1").withNot().withFalse();
        Predicate p3 = new Predicate().withName("x1").withNot();
        Predicate p4 = new Predicate().withName("x3").withNot();

        Body b1 = new Body().withPredicates(p1,p3,p4);
        Body b2 = new Body().withPredicates(p1,p2,p4);

        Head h1 = new Head().withPredicates(p1,p3,p4);

        Rule r1 = new Rule().withHead(h1).withBody(b1);
        Rule r2 = new Rule().withHead(h1).withBody(b1);
        Rule r3 = new Rule().withHead(h1).withBody(b2);

        Assertions.assertEquals(r1, r2);
        Assertions.assertNotEquals(r1, r3);
    }

    @Test
    public void aspGeneratorEquals() {
        Predicate p1 = new Predicate().withName("x1").withNot().withFalse();
        Predicate p2 = new Predicate().withName("x1").withNot().withFalse();
        Predicate p3 = new Predicate().withName("x1").withNot();
        Predicate p4 = new Predicate().withName("x3").withNot();

        Body b1 = new Body().withPredicates(p1,p3,p4);
        Body b2 = new Body().withPredicates(p1,p2,p4);

        Head h1 = new Head().withPredicates(p1,p3,p4);

        Rule r1 = new Rule().withHead(h1).withBody(b1);
        Rule r2 = new Rule().withHead(h1).withBody(b1);
        Rule r3 = new Rule().withHead(h1).withBody(b2);

        AspGenerator a1 = new AspGenerator().withRules(r1,r2);
        AspGenerator a2 = new AspGenerator().withRules(r1,r2);
        AspGenerator a3 = new AspGenerator().withRules(r1,r3);

        Assertions.assertEquals(a1, a2);
        Assertions.assertNotEquals(a1, a3);
    }
}
