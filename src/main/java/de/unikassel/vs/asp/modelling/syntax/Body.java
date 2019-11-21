package de.unikassel.vs.asp.modelling.syntax;

import java.util.ArrayList;

/**
 * Defines the right part of the binary {@code :-} ("if") operator.
 */
public class Body {

    private ArrayList<Term> terms = new ArrayList<>();
    private Rule rule;

    /**
     * Standard getter.
     *
     * @return The body's terms.
     */
    public ArrayList<Term> getTerms() {
        return this.terms;
    }

    /**
     * Adds a predicate to the body's list of predicates.
     *
     * @param predicateName The name of the predicate that is to be added.
     * @return The predicate that was created in this method.
     */
    public Predicate withPredicate(String predicateName) {
        Predicate predicate = new Predicate();
        predicate.setName(predicateName);
        predicate.setTrue(true);
        predicate.setBody(this);
        terms.add(predicate);
        return predicate;
    }

    /**
     * Adds a predicate with 'not' to the body's list of predicates.
     *
     * @param predicateName  The name of the predicate that is to be added.
     * @return  The predicate that was created in this method.
     */
    public Predicate withPredicateNot(String predicateName) {
        Predicate predicate = new Predicate();
        predicate.setName(predicateName);
        predicate.setTrue(false);
        predicate.setBody(this);
        terms.add(predicate);
        return predicate;
    }
}