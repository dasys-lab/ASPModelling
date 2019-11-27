package de.unikassel.vs.asp.modelling.syntax;

/**
 * Defines a range of numbers/constants.
 */
public class Range extends Constant {
    private final int min;
    private final int max;

    /**
     * Standard constructor.
     *
     * @param min The value at which the range starts.
     * @param max The value at which the range ends.
     */
    public Range(int min, int max) {
        this.min = min;
        this.max = max;
    }

    /**
     * Standard getter.
     *
     * @return The value at which the range ends.
     */
    public int getMax() {
        return max;
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
     */
    @Override
    public void setName(String name) {
        throw new UnsupportedOperationException("The name of a range cannot be set manually");
    }
}
