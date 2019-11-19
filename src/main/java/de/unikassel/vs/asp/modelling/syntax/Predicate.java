package de.unikassel.vs.asp.modelling.syntax;

/**
 * Defines a predicate, i,e, a condition that is or should be given for a constant or a variable.
 */
public class Predicate {
    private String name;
    private String variable;

    private Head head;
    private Body body;

    /**
     * Sets the predicate's variable.
     *
     * @param variable The predicate's variable that is to be set.
     * @return The predicate head's rule.
     */
    public Rule withVariableAsRule(String variable) {
        this.variable = variable;
        return getHead().getRule();
    }

    /**
     * Sets the predicate's variable.
     *
     * @param variable The predicate's variable that is to be set.
     * @return The predicate's body.
     */
    public Body withVariableAsBody(String variable) {
        this.variable = variable;
        return getBody();
    }

    /**
     * Standard getter.
     *
     * @return The predicate's name.
     */
    public String getName() {
        return name;
    }

    /**
     * Standard setter.
     *
     * @param name The predicate's name that is to be set.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Standard setter.
     *
     * @param head The predicate's head that is to be set.
     */
    public void setHead(Head head) {
        this.head = head;
    }

    /**
     * Standard getter.
     *
     * @return The predicate's head.
     */
    public Head getHead() {
        return this.head;
    }

    /**
     * Standard setter.
     *
     * @param body The predicate's body that is to be set.
     */
    public void setBody(Body body) {
        this.body = body;
    }

    /**
     * Standard getter.
     *
     * @return The predicate's body.
     */
    public Body getBody() {
        return this.body;
    }

    /**
     * Standard getter.
     *
     * @return The predicate's variable.
     */
    public String getVariable() {
        return this.variable;
    }
}