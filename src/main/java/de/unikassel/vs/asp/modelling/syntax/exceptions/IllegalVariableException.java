package de.unikassel.vs.asp.modelling.syntax.exceptions;

/**
 * Defines an exception for variables in facts.
 */
public class IllegalVariableException extends RuntimeException {

    /**
     * Standard exception message override.
     *
     * @return The exception message.
     */
    @Override
    public String getMessage() {
        return "Variables are not allowed in facts.";
    }
}
