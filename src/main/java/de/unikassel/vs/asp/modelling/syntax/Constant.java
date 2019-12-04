package de.unikassel.vs.asp.modelling.syntax;

import de.unikassel.vs.asp.modelling.syntax.exceptions.IllegalConstantNameException;

import java.util.Objects;

public class Constant extends Element {

    private static final String LEGAL_CONSTANT_NAMES
            = "[a-z]\\w*"    // start with lowercase letter, than any letter, number or _
            + "|([1-9]\\d*|0)"        // or any number without leading zeros
            + "|(\"(.*)\")";            // or any String in "s

    private String name;

    /**
     * Standard getter.
     *
     * @return The constant's name.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the constant's name.
     *
     * @param name The constant's name that is to be set.
     * @return The Constant this method was called on.
     */
    public Constant withName(String name) {
        if (!name.matches(LEGAL_CONSTANT_NAMES)) {
            throw new IllegalConstantNameException(name);
        }
        this.name = name;
        return this;
    }

    @Override
    public boolean equals(Object other) {
        if(other instanceof Constant) {
            return Objects.equals(this.getName(), ((Constant) other).getName());
        }
        return false;
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.name);
    }
}
