package de.unikassel.vs.asp.modelling.syntax;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * Defines the right part of the binary {@code :-} ("if") operator.
 */
public class Body {

    private ArrayList<PredicateTerm> predicateTerms = new ArrayList<>();

    /**
     * Standard getter.
     *
     * @return The body's terms.
     */
    public ArrayList<PredicateTerm> getPredicateTerms() {
        return this.predicateTerms;
    }


    /**
     * Adds the given predicate terms to this body's predicate terms.
     *
     * @param predicates The predicate terms that are to be added.
     * @return The body the method was called on.
     */
    public Body withPredicates(PredicateTerm... predicates) {
        return this.withPredicates(Arrays.asList(predicates));
    }

    /**
     * Adds the given predicate terms to this body's predicate terms.
     *
     * @param predicates The predicate terms that are to be added.
     * @return The body the method was called on.
     */
    private Body withPredicates(Collection<PredicateTerm> predicates) {
        this.predicateTerms.addAll(predicates);
        return this;
    }
}