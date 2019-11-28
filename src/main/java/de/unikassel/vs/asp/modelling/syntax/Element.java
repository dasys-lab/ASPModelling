package de.unikassel.vs.asp.modelling.syntax;
/**
 * Defines an abstract superclass for the classes {@link Constant} and {@link Variable} with the purpose
 * to allow a {@link Predicate} object to hold several {@link Constant}s or {@link Variable}s in arbitrary order
 */
public abstract class Element {

    public abstract void setName(String name);

    public abstract String getName();
}
