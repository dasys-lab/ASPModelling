package de.unikassel.vs.asp.modelling;

import static de.unikassel.vs.asp.modelling.Examples.getFlyingBirds;

public class Main {

    /**
     * Writes an ASP program to the console.
     *
     * @param args Arguments that influence the program's execution flow..
     */
    public static void main(String[] args) {
        AspGenerator gen = new AspGenerator()
                .withRules(getFlyingBirds());
        System.out.println("ASP: \n" + gen);
        System.out.println();
        System.out.println("Java: \n" + gen.toJavaString());
    }
}