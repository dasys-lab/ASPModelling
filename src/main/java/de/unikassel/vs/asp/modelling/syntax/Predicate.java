package de.unikassel.vs.asp.modelling.syntax;

import de.unikassel.vs.asp.modelling.syntax.exceptions.IllegalPredicateNameException;
import de.unikassel.vs.asp.modelling.syntax.exceptions.IllegalVariableException;

import java.util.*;

/**
 * Defines a predicate, i.e. a condition that is or should be given for a constant or a variable.
 */
public class Predicate extends PredicateTerm {

    private static final String LEGAL_PREDICATE_NAMES
            = "[a-z]\\w*"; // Start with lowercase letter, than any letter, number or _

    private boolean withFalse = false;
    private boolean withNot = false;
    private String name;
    private ArrayList<Element> elements = new ArrayList<>();

    /**
     * Standard checker.
     *
     * @return The predicate's falseness indicator.
     */
    public boolean isWithFalse() {
        return withFalse;
    }

    /**
     * Standard setter for "true".
     *
     * @return the predicate on which the method was called on.
     */
    public Predicate withFalse() {
        this.withFalse = true;
        return this;
    }

    /**
     * Standard setter.
     *
     * @param isFalse The falseness indicator that is to be set.
     * @return the predicate on which the method was called on.
     */
    public Predicate withFalse(boolean isFalse) {
        this.withFalse = isFalse;
        return this;
    }

    /**
     * Standard checker.
     *
     * @return The predicate's "not" indicator.
     */
    public boolean isWithNot() {
        return withNot;
    }

    /**
     * Standard setter for "true".
     *
     * @return the predicate on which the method was called on.
     */
    public Predicate withNot() {
        this.withNot = true;
        return this;
    }

    /**
     * Standard setter.
     *
     * @param withNot The "not" indicator that is to be set.
     * @return the predicate on which the method was called on.
     */
    public Predicate withNot(boolean withNot) {
        this.withNot = withNot;
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
    public Predicate withElements(Collection<Element> elements) {
        this.elements.addAll(elements);
        return this;
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof Predicate) {
            int i = 0;
            boolean elementsEqual = true;
            for (Element e : this.elements) {
                if (!(e.equals(((Predicate) other).getElements().get(i)))) {
                    elementsEqual = false;
                    break;
                }
                i++;
            }
            return Objects.equals(this.getName(), ((Predicate) other).getName()) && Objects.equals(!this.isWithFalse(),
                    !((Predicate) other).isWithFalse()) && elementsEqual;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getName(), !this.isWithFalse(), this.elements.hashCode());
    }
}