package de.unikassel.vs.asp.modelling.syntax;

import java.util.ArrayList;

public abstract class RuleComponent {

    public abstract RuleComponent withPredicates(PredicateTerm... currentPredicate);

    public abstract ArrayList<PredicateTerm> getPredicateTerms();
}
