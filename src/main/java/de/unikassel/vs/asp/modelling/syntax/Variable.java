package de.unikassel.vs.asp.modelling.syntax;

import java.util.ArrayList;
import java.util.List;

public class Variable {
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

    public void setName(String name) {
        this.name = name;
    }
}
