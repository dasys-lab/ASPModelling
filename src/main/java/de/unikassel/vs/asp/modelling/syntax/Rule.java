package de.unikassel.vs.asp.modelling.syntax;

/**
 * Defines a rule, i.e. a full ASP-if statement with a head and a body separated by the {@code :-} operator.
 */
public class Rule {

    private Head head;
    private Body body;

    /**
     * Standard getter.
     *
     * @return The rule's head.
     */
    public Head getHead() {
        return this.head;
    }

    /**
     * Adds the head for this rule.
     *
     * @return The rule this method was called on.
     */
    public Rule withHead(Head head) {
        this.head = head;
        return this;
    }

    /**
     * Standard getter.
     *
     * @return The rule's body.
     */
    public Body getBody() {
        return this.body;
    }

    /**
     * Adds the body for this rule.
     *
     * @return The rule this method was called on.
     */
    public Rule withBody(Body body) {
        this.body = body;
        return this;
    }
}