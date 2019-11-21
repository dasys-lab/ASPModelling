package de.unikassel.vs.asp.modelling.syntax;

import de.unikassel.vs.asp.modelling.syntax.exceptions.IllegaleConstantNameException;

public class Constant {

    private static final String LEGAL_CONSTANT_NAMES
            = "[a-z]\\w*"    // start with lowercase letter, than any letter, number or _
            + "|([1-9]\\d*|0)"        // or any number without leading zeros
            + "|(\"(.*)\")";            // or any String in "s

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.matches(LEGAL_CONSTANT_NAMES)) {
            throw new IllegaleConstantNameException(name);
        }
        this.name = name;
    }
}
