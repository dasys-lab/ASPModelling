package de.unikassel.vs.asp.modelling.syntax;

import java.util.ArrayList;

public class Body {
    private ArrayList<Predicate> predicates = new ArrayList<>();
    private Rule rule;

    public ArrayList<Predicate> getPredicates() {
        return this.predicates;
    }

    public Predicate withPredicate(String predicateName) {
        Predicate predicate = new Predicate();
        predicate.setName(predicateName);
        predicate.setBody(this);
        predicates.add(predicate);
        return predicate;
    }
}