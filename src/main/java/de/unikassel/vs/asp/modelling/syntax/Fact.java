package de.unikassel.vs.asp.modelling.syntax;

public class Fact {
    private String constant;
    private String name;

    public String getConstant() {
        return this.constant;
    }

    public Fact withConstant(String constant) {
        this.constant = constant;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}