package de.unikassel.vs.asp.modelling.syntax;

public class Predicate {
    private Body body;
    private Head head;
    private String name;
    private String variable;

    public Body getBody() {
        return this.body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public Head getHead() {
        return this.head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVariable() {
        return this.variable;
    }

    public Body withVariableAsBody(String variable) {
        this.variable = variable;
        return getBody();
    }

    public Rule withVariableAsRule(String variable) {
        this.variable = variable;
        return getHead().getRule();
    }
}