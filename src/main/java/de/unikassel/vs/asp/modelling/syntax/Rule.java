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
        } else if (head != null && body == null) {
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
        if (other instanceof Rule) {
            return Objects.equals(this.getBody(), ((Rule) other).getBody()) && Objects.equals(this.getHead(),
                    ((Rule) other).getHead());
        }
        return false;
    }

    @Override
    public int hashCode() {
        if (myType.equals(Type.COMPLETE)) {
            return Objects.hash(this.body.hashCode(), this.head.hashCode());
        } else if (myType.equals(Type.FACT)) {
            return Objects.hash(this.head.hashCode());
        } else {
            return Objects.hash(this.body.hashCode());
        }
    }

    public Type getType() {
        return myType;
    }

    public void setType(Type myType) {
        this.myType = myType;
    }
}