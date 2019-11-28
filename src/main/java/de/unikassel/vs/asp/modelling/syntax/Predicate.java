package de.unikassel.vs.asp.modelling.syntax;

import de.unikassel.vs.asp.modelling.syntax.exceptions.IllegalPredicateNameException;

import java.util.ArrayList;
import java.util.Collections;

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
    private ArrayList<Element> elements = new ArrayList<>();

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
     * @return The predicate's elements.
     */
    public ArrayList<Element> getElements() {
        return this.elements;
    }

    /**
     * Sets the predicate's variables.
     *
     * @param elements The predicate's elements that are to be set.
     * @return The predicate head's rule.
     */
    public Rule withElementsAsRule(Element... elements) {
        Collections.addAll(this.elements, elements);
        return getHead().getRule();
    }

    /**
     * Sets the predicate's variable.
     *
     * @param elements The predicate's elements that are to be set.
     * @return The predicate's body.
     */
    public Body withElementsAsBody(Element... elements) {
        Collections.addAll(this.elements, elements);
        return getBody();
    }
}