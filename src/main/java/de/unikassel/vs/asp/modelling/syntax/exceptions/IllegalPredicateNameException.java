package de.unikassel.vs.asp.modelling.syntax.exceptions;

/**
 * Defines an exception for illegal predicate names.
 */
public class IllegalPredicateNameException extends IllegalNameException {

    /**
     * Standard constructor.
     *
     * @param illegalName The illegal name.
     */
    public IllegalPredicateNameException(String illegalName) {
        super(illegalName);
    }
}
