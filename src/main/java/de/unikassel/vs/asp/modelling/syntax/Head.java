package de.unikassel.vs.asp.modelling.syntax;

import java.util.ArrayList;

public class Head {

    private Rule rule;
    private ArrayList<Predicate> predicates = new ArrayList<>();

    public Predicate withPredicate(String predicateName) {
        Predicate predicate = new Predicate();
        predicate.setHead(this);
        predicate.setName(predicateName);
        predicates.add(predicate);
        return predicate;
    }

    public void setRule(Rule rule) {
        this.rule = rule;
    }

    public Rule getRule() {
        return this.rule;
    }

    public ArrayList<Predicate> getPredicates() {
        return this.predicates;
    }
}