package de.unikassel.vs.asp.modelling.syntax;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

/**
 * Defines the right part of the binary {@code :-} ("if") operator.
 */
public class Body {

    private ArrayList<Predicate> predicates = new ArrayList<>();

    /**
     * Standard getter.
     *
     * @return The body's terms.
     */
    public ArrayList<Predicate> getPredicates() {
        return this.predicates;
    }


    /**
     * Adds the given predicates to this body's predicate terms.
     *
     * @param predicates The predicates that are to be added.
     * @return The body the method was called on.
     */
    public Body withPredicates(Predicate... predicates) {
        return this.withPredicates(Arrays.asList(predicates));
    }

    /**
     * Adds the given predicates to this body's predicate terms.
     *
     * @param predicates The predicates that are to be added.
     * @return The body the method was called on.
     */
    public Body withPredicates(Collection<Predicate> predicates) {
        this.predicates.addAll(predicates);
        return this;
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof Body) {
            int i = 0;
            boolean bodysEqual = true;
            for (PredicateTerm p : this.predicates) {
                if (!(p.equals(((Body) other).getPredicates().get(i)))) {
                    bodysEqual = false;
                    break;
                }
                i++;
            }
            return bodysEqual;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.predicates.hashCode());
    }
}