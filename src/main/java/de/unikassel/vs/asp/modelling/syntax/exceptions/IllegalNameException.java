package de.unikassel.vs.asp.modelling.syntax.exceptions;

/**
 * Defines an exception for illegal names, as could be given to constants, predicates or variables.
 */
public abstract class IllegalNameException extends RuntimeException {
    private final String illegalName;

    /**
     * Standard constructor.
     *
     * @param illegalName The illegal name.
     */
    IllegalNameException(String illegalName) {
        this.illegalName = illegalName;
    }

    /**
     * Standard exception message override.
     *
     * @return The exception message.
     */
    @Override
    public String getMessage() {
        return "\"" + illegalName + "\" is not a legal name";
    }
}