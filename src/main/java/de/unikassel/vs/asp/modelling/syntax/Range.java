package de.unikassel.vs.asp.modelling.syntax;

public class Range extends Constant {
    private int min, max;
    private String name;

    public Range(int min, int max){
        if(min <= max){
            this.min = min;
            this.max = max;
            this.generateName();
        }else {
            System.out.println("min ist größer als max");
        }
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max){
        if(this.min > this.max){
            System.out.println("min ist größer als max");
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
            System.out.println("min ist größer als max");
        }else{
            this.min = min;
            this.generateName();
        }
    }

    public void generateName() {
        this.name = this.min +".."+this.max;
    }

    @Override
    public void setName(String name) {
        System.out.println("Wie verbiete ich die Funktion für ein Objekt, was einem anderen erbt, wo sie drin ist?");
    }
}
