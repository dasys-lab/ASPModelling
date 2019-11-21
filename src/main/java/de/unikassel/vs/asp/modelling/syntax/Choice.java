package de.unikassel.vs.asp.modelling.syntax;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;

public class Choice extends PredicateTerm {

    private Bound lowerBound;
    private Bound upperBound;

    private List<Predicate> predicates;

    public Choice() {
        predicates = new ArrayList<Predicate>();
    }

    /**
     * Standard getter.
     *
     * @return lower bound as optional (empty if no bound)
     */
    public OptionalInt getLowerBound() {
        return lowerBound == null ? OptionalInt.empty() : OptionalInt.of(lowerBound.value);
    }

    /**
     * Set a lower bound for this Choice.
     *
     * @param bound the bound to set
     * @return this
     */
    public Choice withLowerBound(int bound) {
        this.lowerBound = new Bound(bound);
        return this;
    }

    /**
     * Remove the lower bound for this Choice.
     *
     * @return this
     */
    public Choice withoutLowerBound() {
        this.lowerBound = null;
        return this;
    }

    /**
     * Standard getter.
     *
     * @return upper bound as optional (empty if no bound)
     */
    public OptionalInt getUpperBound() {
        return upperBound == null ? OptionalInt.empty() : OptionalInt.of(upperBound.value);
    }

    /**
     * Set a upper bound for this Choice.
     *
     * @param bound the bound to set
     * @return this
     */
    public Choice withUpperBound(int bound) {
        this.upperBound = new Bound(bound);
        return this;
    }

    /**
     * Remove the upper bound for this Choice.
     *
     * @return this
     */
    public Choice withoutUpperBound() {
        this.upperBound = null;
        return this;
    }

    /**
     * Choice with an exact value.
     *
     * Sets both bounds.
     *
     * @param exact the exact value to be matched
     * @return this
     */
    public Choice withExact(int exact) {
        return this.withLowerBound(exact).withUpperBound(exact);
    }

    public List<Predicate> getPredicates() {
        return predicates;
    }

    public void addPredicate(Predicate term) {
        this.predicates.add(term);
    }

    @Override
    public String getName() {
        return "{"
                + String.join("; ", predicates.stream().map(Predicate::getName).toArray(String[]::new))
                + "}";
    }

    private static class Bound {

        private final int value;

        private Bound(int value) {
            this.value = value;
        }
    }
}
