package de.unikassel.vs.asp.modelling.syntax;

public class Range extends Constant {
    private final int min;
    private final int max;

    public Range(int min, int max){
        this.min = min;
        this.max = max;
    }

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }

    @Override
    public String getName() {
        return "" + this.min + ".." + this.max;
    }

    @Override
    public void setName(String name) {
        throw new UnsupportedOperationException("The name of a Range can not be set manually");
    }
}
