package de.unikassel.vs.asp.modelling.syntax;

/**
 * Defines an abstract superclass for the classes {@link Constant} and {@link Variable}.
 */
public abstract class Element {

    public abstract Element withName(String name);

    public abstract String getName();
}
