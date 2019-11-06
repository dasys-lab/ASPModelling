package main;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;

import java.io.StringWriter;
import java.util.ArrayList;

public class ASPGenerator {

    ArrayList<Fact> facts = new ArrayList<>();
    ArrayList<Rule> rules = new ArrayList<>();

    public Fact createFact(String factName) {
        Fact fact = new Fact();
        fact.setName(factName);
        facts.add(fact);
        return fact;
    }

    public Rule createRule() {
        Rule rule = new Rule();
        rules.add(rule);
        return rule;
    }

    public String getASPProgram() {
        // Create and initialize the template engine
        VelocityEngine ve = new VelocityEngine();
        ve.init();

        // Load the template
        Template t = ve.getTemplate("./src/main/resources/ASP.vm");

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