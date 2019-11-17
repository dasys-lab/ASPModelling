package de.unikassel.vs.asp_modelling.syntax;

import java.util.ArrayList;

public class Head {

    private Rule myRule;
    private ArrayList<Predicate> predicates = new ArrayList<>();

    public Predicate withPredicate(String predicateName) {
        Predicate predicate = new Predicate();
        predicate.setHead(this);
        predicate.setName(predicateName);
        predicates.add(predicate);
        return predicate;
    }

    public void setRule(Rule rule){
        this.myRule = rule;
    }

    public Rule getMyRule(){
        return this.myRule;
    }

    public ArrayList<Predicate> getPredicates(){
        return this.predicates;
    }
}