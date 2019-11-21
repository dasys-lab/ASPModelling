package de.unikassel.vs.asp.modelling.syntax;

import java.util.ArrayList;
import java.util.List;

public class Choice extends PredicateTerm {
    private List<Predicate> predicates;

    public Choice() {
        predicates = new ArrayList<Predicate>();
    }

    public List<Predicate> getPredicates() {
        return predicates;
    }

    public void addPredicate(Predicate term) {
        this.predicates.add(term);
    }

    @Override
    public String getName() {
        return "{"
                + String.join("; ", predicates.stream().map(Predicate::getName).toArray(String[]::new))
                + "}";
    }
}
