package main;

public class Main {

    public static void main(String[] args){

        ASPGenerator gen = new ASPGenerator();

        gen.createFact("eagle").withConstant("eddy");
        gen.createFact("penguin").withConstant("tux");

        gen.createRule().addHead().withPredicate("fly").withVariable("X")
                .addBody().withPredicate("bird").withVariables("X").withPredicate("not -fly").withVariables("X");

        System.out.println(gen.getASPProgram());

    }
}