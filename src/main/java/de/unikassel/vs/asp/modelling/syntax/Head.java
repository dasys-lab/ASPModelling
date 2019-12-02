package de.unikassel.vs.asp.modelling.syntax;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * Defines the left part of the binary {@code :-} ("if") operator.
 */
public class Head {

    private ArrayList<PredicateTerm> predicateTerms = new ArrayList<>();
    private Rule rule;

    /**
     * Standard getter.
     *
     * @return The head's terms.
     */
    public ArrayList<PredicateTerm> getPredicateTerms() {
        return this.predicateTerms;
    }

    /**
     * Adds the given predicate terms to this head's predicate terms.
     *
     * @param predicates The predicate terms that are to be added.
     * @return The head the method was called on.
     */
    public Head withPredicates(PredicateTerm... predicates) {
        return this.withPredicates(Arrays.asList(predicates));
    }

    /**
     * Adds the given predicate terms to this head's predicate terms.
     *
     * @param predicates The predicate terms that are to be added.
     * @return The head the method was called on.
     */
    private Head withPredicates(Collection<PredicateTerm> predicates) {
        this.predicateTerms.addAll(predicates);
        return this;
    }

    /**
     * Standard getter.
     *
     * @return The head's rule.
     */
    public Rule getRule() {
        return this.rule;
    }

    /**
     * Standard setter.
     *
     * @param rule The head's rule that is to be set.
     */
    public void setRule(Rule rule) {
        this.rule = rule;
    }
}