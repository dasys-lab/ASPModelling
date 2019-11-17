package de.unikassel.vs.asp.modelling;

public class Main {

    /**
     * Writes an ASP program to the console.
     *
     * @param args Arguments that influence the program's execution flow..
     */
    public static void main(String[] args) {

        AspGenerator gen = new AspGenerator();

        gen.createFact("eagle").withConstant("eddy");
        gen.createFact("penguin").withConstant("tux");

        gen.createRule().addHead().withPredicate("fly").withVariableAsRule("X")
                .addBody().withPredicate("bird").withVariableAsBody("X")
                .withPredicate("not -fly").withVariableAsBody("X");

        System.out.println(gen);

    }
}