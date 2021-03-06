package de.unikassel.vs.asp.modelling.syntax;

import java.util.*;

/**
 * Defines a set of arbitrary subsets.
 */
public class Choice extends PredicateTerm {

    private Bound lowerBound;
    private Bound upperBound;

    private List<PredicateTerm> predicates;

    /**
     * Initializes the internal predicateTerms list.
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
                : (lowerBound != null && lowerBound.value == upperBound.value) ? " = " + upperBound.value
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
     * @return The choice's predicateTerms.
     */
    public List<PredicateTerm> getPredicates() {
        return predicates;
    }

    /**
     * Add the given predicateTerms to this choice's predicates.
     *
     * @param predicates The predicateTerms that are to be added.
     * @return The choice this method was called on.
     */
    public Choice withPredicates(PredicateTerm... predicates) {
        return this.withPredicates(Arrays.asList(predicates));
    }

    /**
     * Add the given predicateTerms to this choice's predicateTerms.
     *
     * @param predicates The predicateTerms that are to be added.
     * @return The choice this method was called on.
     */
    public Choice withPredicates(Collection<PredicateTerm> predicates) {
        this.predicates.addAll(predicates);
        return this;
    }

    private static class Bound {

        private final int value;

        private Bound(int value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Bound)) {
                return false;
            }
            return this.value == ((Bound) other).value;
        }

        @Override
        public int hashCode() {
            return Objects.hash(this.value);
        }
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Choice)) {
            return false;
        }
        return Objects.equals(this.predicates, ((Choice) other).predicates)
                && Objects.equals(this.lowerBound, ((Choice) other).lowerBound)
                && Objects.equals(this.upperBound, ((Choice) other).upperBound);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.predicates, this.upperBound, this.lowerBound);
    }
}
