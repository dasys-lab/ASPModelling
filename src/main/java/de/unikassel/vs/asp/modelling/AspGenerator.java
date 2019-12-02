package de.unikassel.vs.asp.modelling;

import de.unikassel.vs.asp.modelling.syntax.Fact;
import de.unikassel.vs.asp.modelling.syntax.Rule;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;


/**
 * A builder for an ASP program, including file output functionality.
 */
public class AspGenerator {

    private ArrayList<Fact> facts = new ArrayList<>();
    private ArrayList<Rule> rules = new ArrayList<>();

    /**
     * Add the given facts to this ASP generator's facts.
     *
     * @param facts The facts to be added.
     * @return The ASP generator this method was called on.
     */
    public AspGenerator withFacts(Fact... facts) {
        return this.withFacts(Arrays.asList(facts));
    }

    /**
     * Add the given facts to this ASP generator's facts.
     *
     * @param facts The facts to be added.
     * @return The ASP generator this method was called on.
     */
    public AspGenerator withFacts(Collection<Fact> facts) {
        this.facts.addAll(facts);
        return this;
    }

    /**
     * Add the given rules to this ASP generator's rules.
     *
     * @param rules The rules to be added.
     * @return The ASP generator this method was called on.
     */
    public AspGenerator withRules(Rule... rules) {
        return this.withRules(Arrays.asList(rules));
    }

    /**
     * Add the given rules to this ASP generator's rules.
     *
     * @param rules The rules to be added.
     * @return The ASP generator this method was called on.
     */
    public AspGenerator withRules(Collection<Rule> rules) {
        this.rules.addAll(rules);
        return this;
    }

    /**
     * Converts the program to a string.
     *
     * @return The ASP program as a string.
     */
    @Override
    public String toString() {
        // Create and initialize the template engine
        VelocityEngine ve = new VelocityEngine();
        ve.init();

        // Load the template
        Template t = ve.getTemplate("./src/main/resources/templates/ASP.vm");

        // Add all rules and facts
        VelocityContext c = new VelocityContext();
        c.put("facts", facts);
        c.put("rules", rules);

        // Create the ASP-program
        StringWriter w = new StringWriter();
        t.merge(c, w);

        return w.toString().trim();
    }
}