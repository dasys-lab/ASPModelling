package de.unikassel.vs.asp.modelling.syntax;

import java.util.ArrayList;

/**
 * Defines the right part of the binary {@code :-} ("if") operator.
 */
public class Body {

    private Rule myRule;

    private ArrayList<Predicate> predicates = new ArrayList<>();

    /**
     * Adds a predicate to the body's list of predicates.
     *
     * @param predicateName The name of the predicate that is to be added.
     * @return The predicate that was created in this method.
     */
    public Predicate withPredicate(String predicateName) {
        Predicate predicate = new Predicate();
        predicate.setName(predicateName);
        predicate.setBody(this);
        predicates.add(predicate);
        return predicate;
    }

    /**
     * Standard getter.
     *
     * @return The body's predicates.
     */
    public ArrayList<Predicate> getPredicates() {
        return this.predicates;
    }
}