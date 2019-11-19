package de.unikassel.vs.asp.modelling.syntax;

/**
 * Defines a fact, i.e. a {@link Rule} without a body.
 */
public class Fact {

    String constant;
    String name;

    /**
     * Standard getter.
     *
     * @return The fact's constant.
     */
    public String getConstant() {
        return this.constant;
    }

    /**
     * Sets the fact's constant.
     *
     * @param constant The constant that is to be set.
     * @return The fact on which this method was invoked.
     */
    public Fact withConstant(String constant) {
        this.constant = constant;
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