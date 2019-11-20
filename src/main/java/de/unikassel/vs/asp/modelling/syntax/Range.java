package de.unikassel.vs.asp.modelling.syntax;

public class Range extends Constant {
    private final int min;
    private final int max;

    public Range(int min, int max){
        if(min <= max){
            this.min = min;
            this.max = max;
            this.generateName();
        }else {
            throw new IllegalStateException("min > max");
        }
    }

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }

    public void generateName() {
        super.setName("" + this.min + ".." + this.max);
    }

    @Override
    public void setName(String name) {
        System.err.println("The name of a Range can not be set manually");
    }
}
