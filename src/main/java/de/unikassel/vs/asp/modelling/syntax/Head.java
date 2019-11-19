package de.unikassel.vs.asp.modelling.syntax;

import java.util.ArrayList;

/**
 * Defines the left part of the binary {@code :-} ("if") operator.
 */
public class Head {

    private Rule rule;
    private ArrayList<Predicate> predicates = new ArrayList<>();

    /**
     * Adds a predicate to the head's list of predicates.
     *
     * @param predicateName The name of the predicate that is to be added.
     * @return The predicate that was created in this method.
     */
    public Predicate withPredicate(String predicateName) {
        Predicate predicate = new Predicate();
        predicate.setHead(this);
        predicate.setName(predicateName);
        predicates.add(predicate);
        return predicate;
    }

    /**
     * Standard setter.
     *
     * @param rule The head's rule that is to be set.
     */
    public void setRule(Rule rule) {
        this.rule = rule;
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
     * Standard getter.
     *
     * @return The head's predicates.
     */
    public ArrayList<Predicate> getPredicates() {
        return this.predicates;
    }
}