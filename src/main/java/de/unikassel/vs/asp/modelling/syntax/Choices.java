package de.unikassel.vs.asp.modelling.syntax;

import java.util.ArrayList;
import java.util.List;

public class Choices extends Term {
    private List<Predicate> terms;

    public Choices() {
        terms = new ArrayList<Predicate>();
    }

    public List<Predicate> getTerms() {
        return terms;
    }

    public void addTerms(Predicate term) {
        this.terms.add(term);
    }

    @Override
    public String getName() {
        String name = "{";
        for(Predicate p : terms){
            name = name + p.getName() +";";
        }
        name.substring(0, name.length()-2);
        name = name + "}";
        return name;
    }
}
