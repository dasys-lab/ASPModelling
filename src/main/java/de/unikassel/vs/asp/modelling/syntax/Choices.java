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
}
