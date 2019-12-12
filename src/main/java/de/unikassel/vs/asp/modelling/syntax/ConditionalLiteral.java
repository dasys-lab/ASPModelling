package de.unikassel.vs.asp.modelling.syntax;

import java.util.*;

/**
 * Defines a conditional predicate, that depends on any number of conditions.
 */
public class ConditionalLiteral extends PredicateTerm {
    private Predicate conditional;
    private List<Predicate> conditions = new ArrayList<>();

    /**
     * Standard getter.
     *
     * @return The conditional, that depends on the conditions.
     */
    public Predicate getConditional() {
        return conditional;
    }

    /**
     * Set the conditional.
     *
     * @param conditional The predicate to be used as the conditional.
     * @return The conditional literal this method was called on.
     */
    public ConditionalLiteral withConditional(Predicate conditional) {
        this.conditional = conditional;
        return this;
    }

    /**
     * Standard getter.
     *
     * @return The list of all conditions.
     */
    public List<Predicate> getConditions() {
        return conditions;
    }

    /**
     * Add the given predicates to the conditions.
     *
     * @param conditions The predicates to be added.
     * @return  The conditional literal this method was called on.
     */
    public ConditionalLiteral withConditions(Predicate... conditions) {
        return this.withConditions(Arrays.asList(conditions));
    }

    /**
     * Add the given predicates to the conditions.
     *
     * @param conditions The predicates to be added.
     * @return  The conditional literal this method was called on.
     */
    public ConditionalLiteral withConditions(Collection<Predicate> conditions) {
        this.conditions.addAll(conditions);
        return this;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConditionalLiteral)) {
            return false;
        }
        return Objects.equals(this.conditional, ((ConditionalLiteral) other).conditional)
                && Objects.equals(this.conditions, ((ConditionalLiteral) other).conditions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.conditional, this.conditions);
    }
}
