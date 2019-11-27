package de.unikassel.vs.asp.modelling.syntax.exceptions;

public abstract class IllegalNameException extends RuntimeException {
    private final String illegalName;

    IllegalNameException(String illegalName) {
        this.illegalName = illegalName;
    }

    @Override
    public String getMessage() {
        return "\"" + illegalName + "\" is not a legal name";
    }
}