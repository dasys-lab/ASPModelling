package de.unikassel.vs.asp.modelling.syntax.exceptions;

/**
 * Defines an exception for illegal constant names.
 */
public class IllegalConstantNameException extends IllegalNameException {

    /**
     * Standard constructor.
     *
     * @param illegalName The illegal name.
     */
    public IllegalConstantNameException(String illegalName) {
        super(illegalName);
    }
}
