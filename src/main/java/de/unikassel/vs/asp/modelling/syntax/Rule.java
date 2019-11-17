package de.unikassel.vs.asp.modelling.syntax;

public class Rule {
    private Body body;
    private Head head;

    public Body getBody() {
        return this.body;
    }

    public Body addBody() {
        this.body = new Body();
        return this.body;
    }

    public Head getHead() {
        return this.head;
    }

    public Head addHead() {
        this.head = new Head();
        this.head.setRule(this);
        return this.head;
    }
}