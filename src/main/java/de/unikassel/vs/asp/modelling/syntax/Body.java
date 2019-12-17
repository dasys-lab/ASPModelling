package de.unikassel.vs.asp.modelling.syntax;

import org.antlr.v4.runtime.RuleContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

/**
 * Defines the right part of the binary {@code :-} ("if") operator.
 */
public class Body extends RuleComponent {

    private ArrayList<PredicateTerm> predicateTerms = new ArrayList<>();

    /**
     * Standard getter.
     *
     * @return The body's terms.
     */
    @Override
    public ArrayList<PredicateTerm> getPredicateTerms() {
        return this.predicateTerms;
    }


    /**
     * Adds the given predicates to this body's predicate terms.
     *
     * @param predicates The predicates that are to be added.
     * @return The body the method was called on.
     */
    @Override
    public Body withPredicates(PredicateTerm... predicates) {
        return this.withPredicates(Arrays.asList(predicates));
    }

    /**
     * Adds the given predicates to this body's predicate terms.
     *
     * @param predicates The predicates that are to be added.
     * @return The body the method was called on.
     */
    public Body withPredicates(Collection<PredicateTerm> predicates) {
        this.predicateTerms.addAll(predicates);
        return this;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Body)) {
            return false;
        }
        return Objects.equals(this.predicateTerms, ((Body) other).predicateTerms);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.predicateTerms);
    }
}