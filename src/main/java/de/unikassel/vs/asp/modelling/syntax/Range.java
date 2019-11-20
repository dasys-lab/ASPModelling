package de.unikassel.vs.asp.modelling.syntax;

public class Range extends Constant {
    private int min;
    private int max;

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

    public void setMax(int max){
        if(this.min > this.max){
            throw new IllegalStateException("max < min");
        }else{
            this.max = max;
            this.generateName();
        }
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min){
        if(this.min > this.max){
            System.out.println("min > max -> ");
        }else{
            this.min = min;
            this.generateName();
        }
    }

    public void generateName() {
        super.setName("" + this.min + ".." + this.max);
    }

    @Override
    public void setName(String name) {
        System.err.println("The name of a Range can not be set manually");
    }
}
