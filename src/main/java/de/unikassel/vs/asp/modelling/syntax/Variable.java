package de.unikassel.vs.asp.modelling.syntax;

import de.unikassel.vs.asp.modelling.syntax.exceptions.IllegalVariableNameException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

public class Variable extends Element {

    private static final String LEGAL_VARIABLE_NAMES
            = "([A-Z]\\w*)"; // start with uppercase letter than any letter, number or _

    public static String getLegalVariableNames() {
        return LEGAL_VARIABLE_NAMES;
    }

    private String name;
    private ArrayList<Constant> constantsOutOfValueRange = new ArrayList<>();

    /**
     * Standard getter.
     *
     * @return The variable's constants that are out of value range.
     */
    public ArrayList<Constant> getConstantsOutOfValueRange() {
        return constantsOutOfValueRange;
    }

    /**
     * Adds the given constants to the out of value range.
     *
     * @param constantsOutOfValueRange The constants that are out of value range which are to be set.
     * @return The variable this method was called on.
     */
    public Variable withConstantsOutOfValueRange(Constant... constantsOutOfValueRange) {
        return this.withConstantsOutOfValueRange(Arrays.asList(constantsOutOfValueRange));
    }

    /**
     * Adds the given constants to the out of value range.
     *
     * @param constantsOutOfValueRange The constants that are out of value range which are to be set.
     * @return The variable this method was called on.
     */
    public Variable withConstantsOutOfValueRange(Collection<Constant> constantsOutOfValueRange) {
        this.constantsOutOfValueRange.addAll(constantsOutOfValueRange);
        return this;
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
     * Sets the variable's name.
     *
     * @param name The variable's name that is to be set.
     * @return The variable this method was called on.
     */
    public Variable withName(String name) {
        if (!name.matches(LEGAL_VARIABLE_NAMES)) {
            throw new IllegalVariableNameException(name);
        }
        this.name = name;
        return this;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Variable)) {
            return false;
        }
        return Objects.equals(this.name, ((Variable) other).name)
                && Objects.equals(this.constantsOutOfValueRange, ((Variable) other).constantsOutOfValueRange);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.constantsOutOfValueRange);
    }
}
