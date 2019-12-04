package de.unikassel.vs.asp.modelling.syntax;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

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
     * Adds the given constants to the constants of this fact.
     *
     * @param constants The constants that are to be set.
     * @return The fact on which this method was invoked.
     */
    public Fact withConstants(Constant... constants) {
        return this.withConstants(Arrays.asList(constants));
    }

    /**
     * Adds the given constants to the constants of this fact.
     *
     * @param constants The constants that are to be set.
     * @return The fact on which this method was invoked.
     */
    public Fact withConstants(Collection<Constant> constants) {
        this.constants.addAll(constants);
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
     * Sets the fact's name.
     *
     * @param name The fact's name that is to be set.
     * @return The fact on which this method was invoked.
     */
    public Fact withName(String name) {
        this.name = name;
        return this;
    }
}