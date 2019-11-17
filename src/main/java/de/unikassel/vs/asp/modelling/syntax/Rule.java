package de.unikassel.vs.asp.modelling.syntax;

/**
 * Defines a rule, i.e. a full ASP-if statement with a head and a body separated by the {@code :-} operator.
 */
public class Rule {
    private Head head;
    private Body body;

    /**
     * Adds a new head for this rule.
     *
     * @return The head that was created in this method.
     */
    public Head addHead() {
        this.head = new Head();
        this.head.setRule(this);
        return this.head;
    }

    /**
     * Adds a new Body for this rule.
     *
     * @return The body that was created in this method.
     */
    public Body addBody() {
        this.body = new Body();
        return this.body;
    }

    /**
     * Standard getter.
     *
     * @return The rule's head.
     */
    public Head getHead() {
        return this.head;
    }

    /**
     * Standard getter.
     *
     * @return The rule's body.
     */
    public Body getBody() {
        return this.body;
    }
}