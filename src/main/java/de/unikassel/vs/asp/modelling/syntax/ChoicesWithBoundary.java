package de.unikassel.vs.asp.modelling.syntax;

import java.util.ArrayList;
import java.util.List;

public class ChoicesWithBoundary extends Term{
    private List<Predicate> predicates;
    private int lowerBoundary=-1;
    private int higherBoundary=-1;

    public ChoicesWithBoundary() {
        predicates = new ArrayList<Predicate>();
    }

    public List<Predicate> getPredicates() {
        return predicates;
    }

    public void addPredicates(Predicate term) {
        this.predicates.add(term);
    }

    public int getHigherBoundary() {
        return higherBoundary;
    }

    public void setHigherBoundary(int higherBoundary) {
        if(higherBoundary<= predicates.size()) {
            this.higherBoundary = higherBoundary;
        }else{
            System.out.println("Boundary out of Range");
        }
    }
    public int getLowerBoundary() {
        return lowerBoundary;
    }

    public void setLowerBoundary(int lowerBoundary) {
        if(lowerBoundary >= 0){
            this.lowerBoundary = lowerBoundary;
        }else {
            System.out.println("Boundary out of Range");
        }
    }


}
