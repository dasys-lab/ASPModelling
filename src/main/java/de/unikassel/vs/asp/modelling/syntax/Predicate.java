package de.unikassel.vs.asp.modelling.syntax;

import de.unikassel.vs.asp.modelling.syntax.exceptions.IllegalPredicateNameException;

import java.util.*;

/**
 * Defines a predicate, i.e. a condition that is or should be given for a constant or a variable.
 */
public class Predicate extends PredicateTerm {

    private static final String LEGAL_PREDICATE_NAMES
            = "-?[a-z]\\w*"; // Maybe start with -, than lowercase letter, than any letter, number or _

    private boolean isTrue = true;
    private String name;
    private ArrayList<Element> elements = new ArrayList<>();

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
     * @param isTrue The truthiness that is to be set.
     * @return the predicate on which the method was called on.
     */
    public Predicate withTrue(boolean isTrue) {
        this.isTrue = isTrue;
        return this;
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
     * Sets the predicate's name.
     *
     * @param name The predicate's name that is to be set.
     * @return the predicate on which the method was called on.
     */
    public Predicate withName(String name) {
        if (!name.matches(LEGAL_PREDICATE_NAMES)) {
            throw new IllegalPredicateNameException(name);
        }
        this.name = name;
        return this;
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
     * Adds the given elements to the predicate's elements.
     *
     * @param elements The predicate's elements that are to be set.
     * @return The predicate this method was called on.
     */
    public Predicate withElements(Element... elements) {
        return this.withElements(Arrays.asList(elements));
    }

    /**
     * Adds the given elements to the predicate's elements.
     *
     * @param elements The predicate's elements that are to be set.
     * @return The predicate this method was called on.
     */
    private <T> Predicate withElements(Collection<Element> elements) {
        this.elements.addAll(elements);
        return this;
    }
}