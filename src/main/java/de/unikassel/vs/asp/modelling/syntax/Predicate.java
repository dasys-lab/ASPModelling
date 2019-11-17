package de.unikassel.vs.asp.modelling.syntax;

public class Predicate {
    private String name;
    private String variable;

    private Head head;
    private Body body;

    public Rule withVariableAsRule(String variable) {
        this.variable = variable;
        return getHead().getRule();
    }

    public Body withVariableAsBody(String variable) {
        this.variable = variable;
        return getBody();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Head getHead() {
        return this.head;
    }


    public void setBody(Body body) {
        this.body = body;
    }

    public Body getBody() {
        return this.body;
    }

    public String getVariable() {
        return this.variable;
    }
}