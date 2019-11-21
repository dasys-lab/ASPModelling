package de.unikassel.vs.asp.modelling.syntax;

public class ChoicesWithBoundary extends Choices {
    private int lowerBoundary = -1;
    private int higherBoundary = -1;


    public int getHigherBoundary() {
        return higherBoundary;
    }

    public void setHigherBoundary(int higherBoundary) {
        this.higherBoundary = higherBoundary;
    }

    public int getLowerBoundary() {
        return lowerBoundary;
    }

    public void setLowerBoundary(int lowerBoundary) {
        this.lowerBoundary = lowerBoundary;
    }

    @Override
    public String getName() {
        return (lowerBoundary >= 0 ? lowerBoundary : "")
                + super.getName()
                + (higherBoundary >= 0 ? higherBoundary : "");
    }
}
