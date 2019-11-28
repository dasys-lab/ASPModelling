package de.unikassel.vs.asp.modelling.syntax;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Defines a fact, i.e. a {@link Rule} without a body.
 */
public class Fact {

    private ArrayList<Constant> constants = new ArrayList<>();
    private String name;

    /**
     * Standard getter.
     *
     * @return The fact's constants.
     */
    public ArrayList<Constant> getConstants() {
        return this.constants;
    }

    /**
     * Sets the fact's constant.
     *
     * @param constants The constants that are to be set.
     * @return The fact on which this method was invoked.
     */
    public Fact withConstant(Constant... constants) {
        Collections.addAll(this.constants, constants);
        return this;
    }

    /**
     * Standard getter.
     *
     * @return The fact's name.
     */
    public String getName() {
        return name;
    }

    /**
     * Standard setter.
     *
     * @param name The fact's name that is to be set.
     */
    public void setName(String name) {
        this.name = name;
    }
}