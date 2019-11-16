package main;

public class Rule {
    private Head head;
    private Body body;

    public Head addHead() {
        this.head = new Head();
        this.head.setRule(this);
        return this.head;
    }

    public Body addBody() {
        this.body = new Body();
        return this.body;
    }

    public Head getHead() {
        return this.head;
    }

    public Body getBody() {
        return this.body;
    }
}