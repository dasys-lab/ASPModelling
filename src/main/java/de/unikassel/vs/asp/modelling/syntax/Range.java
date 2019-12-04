package de.unikassel.vs.asp.modelling.syntax;

import java.util.Objects;

/**
 * Defines a range of numbers/constants.
 */
public class Range extends Constant {
    private int min;
    private int max;

    /**
     * Standard getter.
     *
     * @return The value at which the range ends.
     */
    public int getMax() {
        return max;
    }

    /**
     * Sets the range's end.
     *
     * @param max The value at which the range should end.
     * @return The range this method is called on.
     */
    public Range withMax(int max) {
        this.max = max;
        return this;
    }

    /**
     * Standard getter.
     *
     * @return The value at which the range starts.
     */
    public int getMin() {
        return min;
    }

    /**
     * Sets the range's start.
     *
     * @param min The value at which the range should start.
     * @return The range this method is called on.
     */
    public Range withMin(int min) {
        this.min = min;
        return this;
    }

    /**
     * Standard getter override.
     *
     * @return The range's name.
     */
    @Override
    public String getName() {
        return "" + this.min + ".." + this.max;
    }

    /**
     * Throws an {@link UnsupportedOperationException} as a range's name cannot be set manually..
     *
     * @param name The name that is (not) to be set.
     * @return Nothing.
     * @throws UnsupportedOperationException Because the name cannot be set.
     */
    @Override
    public Constant withName(String name) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("The name of a range cannot be set manually");
    }

    @Override
    public boolean equals(Object other) {
        if(other instanceof Range) {
            return (Objects.equals(this.getMin(), ((Range) other).getMin())) &&(Objects.equals(this.getMax(), ((Range) other).getMax()));
        }
        return false;
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.min, this.max);
    }
}
