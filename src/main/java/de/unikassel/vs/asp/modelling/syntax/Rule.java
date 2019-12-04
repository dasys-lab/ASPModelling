package de.unikassel.vs.asp.modelling.syntax;

import java.util.Objects;

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

    @Override
    public boolean equals(Object other) {
        if(other instanceof Rule) {
            return Objects.equals(this.getBody(), ((Rule) other).getBody()) && Objects.equals(this.getHead(), ((Rule) other).getHead()) ;
        }
        return false;
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.body.hashCode(), this.head.hashCode());
    }
}