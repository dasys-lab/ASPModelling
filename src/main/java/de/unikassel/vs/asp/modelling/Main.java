package de.unikassel.vs.asp.modelling;

import de.unikassel.vs.asp.modelling.syntax.Constant;
import de.unikassel.vs.asp.modelling.syntax.Variable;

public class Main {

    /**
     * Writes an ASP program to the console.
     *
     * @param args Arguments that influence the program's execution flow..
     */
    public static void main(String[] args) {

        AspGenerator gen = new AspGenerator();

        Constant eddy = new Constant();
        eddy.setName("eddy");

        Constant tux = new Constant();
        eddy.setName("tux");

        gen.createFact("eagle").withConstant(eddy);
        gen.createFact("penguin").withConstant(tux);

        Variable v1 = new Variable();
        v1.setName("X");
        gen.createRule().addHead().withPredicate("fly").withVariableAsRule(v1)
                .addBody().withPredicate("bird").withVariableAsBody(v1)
                .withPredicate("not -fly").withVariableAsBody(v1);

        System.out.println(gen);

    }
}