package de.unikassel.vs.asp_modelling;

public class Main {

    public static void main(String[] args){

        ASPGenerator gen = new ASPGenerator();

        gen.createFact("eagle").withConstant("eddy");
        gen.createFact("penguin").withConstant("tux");

        gen.createRule().addHead().withPredicate("fly").withVariableAsRule("X")
                .addBody().withPredicate("bird").withVariableAsBody("X").withPredicate("not -fly").withVariableAsBody("X");

        System.out.println(gen.getASPProgram());

    }
}