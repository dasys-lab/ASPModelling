package de.unikassel.vs.asp.modelling.syntax;

public class ChoicesWithBoundary extends Choices {
    private int lowerBoundary = -1;
    private int higherBoundary = -1;


    public int getHigherBoundary() {
        return higherBoundary;
    }

    public void setHigherBoundary(int higherBoundary) {
        if (higherBoundary <= getPredicates().size()) {
            this.higherBoundary = higherBoundary;
        } else {
            System.out.println("Boundary out of Range");
        }
    }

    public int getLowerBoundary() {
        return lowerBoundary;
    }

    public void setLowerBoundary(int lowerBoundary) {
        if (lowerBoundary >= 0) {
            this.lowerBoundary = lowerBoundary;
        } else {
            System.out.println("Boundary out of Range");
        }
    }

    @Override
    public String getName() {
        return (lowerBoundary >= 0 ? lowerBoundary : "")
                + super.getName()
                + (higherBoundary >= 0 ? higherBoundary : "");
    }
}
