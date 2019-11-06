package main;

public class Predicate {
    private String name;
    private String variable;

    private Head myHead;
    private Body myBody;

    public Rule withVariable(String variable){
        this.variable = variable;
        return getMyHead().getMyRule();
    }

    public Body withVariables(String variable){
        this.variable = variable;
        return getMyBody();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHead(Head head){
        this.myHead = head;
    }

    public Head getMyHead(){
        return this.myHead;
    }


    public void setBody(Body body) {
        this.myBody = body;
    }

    public Body getMyBody(){
        return this.myBody;
    }

    public String getVariable(){
        return this.variable;
    }
}