package de.unikassel.vs.asp.modelling.syntax.exceptions;

/**
 * Defines an exception for illegal variable names.
 */
public class IllegalVariableNameException extends IllegalNameException {

    /**
     * Standard constructor.
     *
     * @param illegalName The illegal name.
     */
    public IllegalVariableNameException(String illegalName) {
        super(illegalName);
    }
}
