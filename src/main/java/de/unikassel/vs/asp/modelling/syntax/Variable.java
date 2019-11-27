package de.unikassel.vs.asp.modelling.syntax;

import de.unikassel.vs.asp.modelling.syntax.exceptions.IllegalVariableNameException;

import java.util.ArrayList;
import java.util.List;

public class Variable {

    private static final String LEGAL_VARIABLE_NAMES
            = "([A-Z]\\w*)"; // start with uppercase letter than any letter, number or _

    private String name;
    private List<Constant> constantsOutOfValueRange = new ArrayList<>();

    /**
     * Standard getter.
     *
     * @return The variable's constants that are out of value range.
     */
    public List<Constant> getConstantsOutOfValueRange() {
        return constantsOutOfValueRange;
    }

    /**
     * Standard setter.
     *
     * @param constantsOutOfValueRange The constants that are out of value range which are to be set.
     */
    public void setConstantsOutOfValueRange(List<Constant> constantsOutOfValueRange) {
        this.constantsOutOfValueRange = constantsOutOfValueRange;
    }

    /**
     * Standard getter.
     *
     * @return The variable's name.
     */
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
