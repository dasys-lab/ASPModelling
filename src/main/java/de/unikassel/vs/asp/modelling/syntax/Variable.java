package de.unikassel.vs.asp.modelling.syntax;

import de.unikassel.vs.asp.modelling.syntax.exceptions.IllegalVariableNameException;

import java.util.ArrayList;
import java.util.List;

public class Variable {

    private static final String LEGAL_VARIABLE_NAMES
            = "([A-Z]\\w*)"; // start with uppercase letter than any letter, number or _

    private String name;
    private List<Constant> constantsOutOfValueRange = new ArrayList<>();

    public List<Constant> getConstantsOutOfValueRange() {
        return constantsOutOfValueRange;
    }

    public void setConstantsOutOfValueRange(List<Constant> constantsOutOfValueRange) {
        this.constantsOutOfValueRange = constantsOutOfValueRange;
    }

    public String getName() {
        return name;
    }

    /**
     * Standard setter, which validates the input.
     *
     * @param name The variable's name that is to be set.
     */
    public void setName(String name) {
        if (!name.matches(LEGAL_VARIABLE_NAMES)) {
            throw new IllegalVariableNameException(name);
        }
        this.name = name;
    }
}
