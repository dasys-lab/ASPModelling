package de.unikassel.vs.asp.modelling.syntax;
/**
 * Defines an abstract superclass for the classes {@link Constant} and {@link Variable}.
 */
public abstract class Element {

    public abstract void setName(String name);

    public abstract String getName();
}
