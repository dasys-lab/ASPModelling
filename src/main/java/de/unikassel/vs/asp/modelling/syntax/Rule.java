package de.unikassel.vs.asp.modelling.syntax;

import java.util.Objects;

/**
 * Defines a rule, i.e. a full ASP-if statement with a head and a body separated by the {@code :-} operator.
 */
public class Rule {

    private Head head;
    private Body body;
    private Type myType;

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
        checkAndSetType();
        return this;
    }

    /**
     * Sets the {@link Type} of a rule as fact, constraint or complete rule.
     */
    private void checkAndSetType() {
        if (head != null && body != null) {
            this.setType(Type.COMPLETE);
        } else if (head == null && body != null) {
            this.setType(Type.CONSTRAINT);
        } else if (head != null) {
            this.setType(Type.FACT);
        }
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
        checkAndSetType();
        return this;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Rule)) {
            return false;
        }
        return Objects.equals(this.myType, ((Rule) other).myType)
                && Objects.equals(this.head, ((Rule) other).head)
                && Objects.equals(this.body, ((Rule) other).body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.myType, this.head, this.body);
    }

    public Type getType() {
        return myType;
    }

    private void setType(Type myType) {
        this.myType = myType;
    }
}