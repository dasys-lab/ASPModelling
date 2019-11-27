package de.unikassel.vs.asp.modelling.syntax;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;

/**
 * Defines a set of arbitrary subsets.
 */
public class Choice extends PredicateTerm {

    private Bound lowerBound;
    private Bound upperBound;

    private List<Predicate> predicates;

    /**
     * Initializes the internal predicate list.
     */
    public Choice() {
        predicates = new ArrayList<>();
    }

    /**
     * Standard getter.
     *
     * @return Lower bound as optional (empty if no bound).
     */
    public OptionalInt getLowerBound() {
        return lowerBound == null ? OptionalInt.empty() : OptionalInt.of(lowerBound.value);
    }

    /**
     * Get the lower bound as string for usage within a template.
     *
     * @return String representation of the choice's lower bound.
     */
    public String getLowerBoundString() {
        return lowerBound == null
                || (upperBound != null && lowerBound.value == upperBound.value) // In case both are equal use = at end
                ? "" : "" + lowerBound.value;
    }

    /**
     * Set a lower bound.
     *
     * @param bound The lower bound that is to be set.
     * @return The choice on which this method was invoked.
     */
    public Choice withLowerBound(int bound) {
        this.lowerBound = new Bound(bound);
        return this;
    }

    /**
     * Remove the lower bound.
     *
     * @return The choice on which this method was invoked.
     */
    public Choice withoutLowerBound() {
        this.lowerBound = null;
        return this;
    }

    /**
     * Standard getter.
     *
     * @return Upper bound as optional (empty if no bound).
     */
    public OptionalInt getUpperBound() {
        return upperBound == null ? OptionalInt.empty() : OptionalInt.of(upperBound.value);
    }

    /**
     * Get the upper bound as string for usage within a template.
     *
     * @return String representation of the choice's upper bound.
     */
    public String getUpperBoundString() {
        return upperBound == null ? ""
                : (lowerBound != null && lowerBound.value == upperBound.value) ?  " = " + upperBound.value
                : "" + upperBound.value;
    }

    /**
     * Set an upper bound.
     *
     * @param bound the bound to set
     * @return The choice on which this method was invoked.
     */
    public Choice withUpperBound(int bound) {
        this.upperBound = new Bound(bound);
        return this;
    }

    /**
     * Remove the upper bound.
     *
     * @return The choice on which this method was invoked.
     */
    public Choice withoutUpperBound() {
        this.upperBound = null;
        return this;
    }

    /**
     * Set an exact value.
     *
     * <p>Sets both bounds.
     *
     * @param exact The exact value that is to be set.
     * @return The choice on which this method was invoked.
     */
    public Choice withExact(int exact) {
        return this.withLowerBound(exact).withUpperBound(exact);
    }

    /**
     * Standard getter.
     *
     * @return The choice's predicates.
     */
    public List<Predicate> getPredicates() {
        return predicates;
    }

    /**
     * Standard adder.
     *
     * @param predicate The predicate that is to be added.
     */
    public void addPredicate(Predicate predicate) {
        this.predicates.add(predicate);
    }

    private static class Bound {

        private final int value;

        private Bound(int value) {
            this.value = value;
        }
    }
}
