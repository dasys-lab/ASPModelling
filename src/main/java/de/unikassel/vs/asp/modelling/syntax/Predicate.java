package de.unikassel.vs.asp.modelling.syntax;

import de.unikassel.vs.asp.modelling.syntax.exceptions.IllegalPredicateNameException;

/**
 * Defines a predicate, i.e. a condition that is or should be given for a constant or a variable.
 */
public class Predicate extends PredicateTerm {

    private static final String LEGAL_PREDICATE_NAMES
            = "-?[a-z]\\w*"; // Maybe start with -, than lowercase letter, than any letter, number or _

    private Body body;
    private Head head;
    private boolean isTrue = true;
    private String name;
    private Variable[] variables;

    /**
     * Standard getter.
     *
     * @return The predicate's body.
     */
    public Body getBody() {
        return this.body;
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
     * @return The predicate's head.
     */
    public Head getHead() {
        return this.head;
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
     * Standard checker.
     *
     * @return The predicate's truthiness.
     */
    public boolean isTrue() {
        return isTrue;
    }

    /**
     * Standard setter.
     *
     * @param value The truthiness that is to be set.
     */
    public void setTrue(boolean value) {
        isTrue = value;
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
        if (!name.matches(LEGAL_PREDICATE_NAMES)) {
            throw new IllegalPredicateNameException(name);
        }
        this.name = name;
    }

    /**
     * Standard getter.
     *
     * @return The predicate's variables.
     */
    public Variable[] getVariables() {
        return this.variables;
    }

    /**
     * Sets the predicate's variable.
     *
     * @param variables The predicate's variables that are to be set.
     * @return The predicate's body.
     */
    public Body withVariableAsBody(Variable... variables) {
        this.variables = new Variable[variables.length];
        int position = 0;
        for (Variable variable: variables) {
            this.variables[position++] = variable;
        }
        return getBody();
    }

    /**
     * Sets the predicate's variables.
     *
     * @param variables The predicate's variables that are to be set.
     * @return The predicate head's rule.
     */
    public Rule withVariableAsRule(Variable... variables) {
        this.variables = new Variable[variables.length];
        int position = 0;
        for (Variable variable: variables) {
            this.variables[position++] = variable;
        }
        return getHead().getRule();
    }
}