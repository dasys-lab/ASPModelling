package main;

import java.util.ArrayList;

public class Body {

    private Rule myRule;

    private ArrayList<Predicate> predicates= new ArrayList<>();

    public Predicate withPredicate(String predicateName) {
        Predicate predicate = new Predicate();
        predicate.setName(predicateName);
        predicate.setBody(this);
        predicates.add(predicate);
        return predicate;
    }

    public ArrayList<Predicate> getPredicates(){
        return this.predicates;
    }
}