package de.unikassel.vs.asp.modelling.syntax.exceptions;

public class IllegalChoiceBoundaryException extends RuntimeException {
    public IllegalChoiceBoundaryException(int lowerBound, int upperBound) {
        super("bounds of " + lowerBound + " and " + upperBound + " are not legal");
    }
}
