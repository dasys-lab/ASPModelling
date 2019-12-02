package de.unikassel.vs.asp.modelling;

import de.unikassel.vs.asp.modelling.syntax.Fact;
import de.unikassel.vs.asp.modelling.syntax.Rule;
import java.io.StringWriter;
import java.util.ArrayList;
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
     * Creates a fact for the program.
     *
     * @param factName The name of the fact that is to be created.
     * @return The fact that was created in this method.
     */
    public Fact createFact(String factName) {
        Fact fact = new Fact();
        fact.withName(factName);
        facts.add(fact);
        return fact;
    }

    /**
     * Creates a rule for the program.
     *
     * @return The rule that was created in this method.
     */
    public Rule createRule() {
        Rule rule = new Rule();
        rules.add(rule);
        return rule;
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