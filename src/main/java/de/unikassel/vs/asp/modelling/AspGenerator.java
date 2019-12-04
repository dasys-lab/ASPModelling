package de.unikassel.vs.asp.modelling;

import de.unikassel.vs.asp.modelling.syntax.*;

import java.io.StringWriter;
import java.util.*;

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

    /**
     * Convert the program to a Java-sourcecode-string.
     *
     * @return A string that contains Java-code creating an aspGenerator equal to this one.
     */
    public String toJavaString() {
        LinkedHashSet<Constant> constants = new LinkedHashSet<>();
        LinkedHashSet<Range> ranges = new LinkedHashSet<>();
        LinkedHashSet<Variable> variables = new LinkedHashSet<>();

        LinkedHashSet<Predicate> predicates = new LinkedHashSet<>();
        LinkedHashSet<Choice> choices = new LinkedHashSet<>();

        for (Fact fact : this.facts) {
            for (Constant constant : fact.getConstants()) {
                if (constant instanceof Range) {
                    ranges.add((Range) constant);
                } else {
                    constants.add(constant);
                }
            }
        }
        for (Rule rule : this.rules) {
            ArrayList<PredicateTerm> predicateTerms = new ArrayList<>();
            if (rule.getHead() != null) {
                predicateTerms.addAll(rule.getHead().getPredicateTerms());
            }
            if (rule.getBody() != null) {
                predicateTerms.addAll(rule.getBody().getPredicateTerms());
            }

            for (PredicateTerm predicateTerm : predicateTerms) {

                LinkedHashSet<Element> elements = new LinkedHashSet<>();

                if (predicateTerm instanceof Predicate) {
                    elements.addAll(((Predicate) predicateTerm).getElements());
                    predicates.add((Predicate) predicateTerm);
                } else if (predicateTerm instanceof Choice) {
                    for (Predicate predicate : ((Choice) predicateTerm).getPredicates()) {
                        elements.addAll(predicate.getElements());
                        choices.add((Choice) predicateTerm);
                        predicates.addAll(((Choice) predicateTerm).getPredicates());
                    }
                } else {
                    throw new RuntimeException("Unknown type of predicate: "
                            + predicateTerm.getClass().getSimpleName());
                }

                for (Element element : elements) {
                    if (element instanceof Range) {
                        ranges.add((Range) element);
                    } else if (element instanceof Constant) {
                        constants.add((Constant) element);
                    } else if (element instanceof Variable) {
                        variables.add((Variable) element);
                    } else {
                        throw new RuntimeException("Unknown type of element: " + element.getClass().getSimpleName());
                    }
                }
            }
        }

        // Create and initialize the template engine
        VelocityEngine ve = new VelocityEngine();
        ve.init();

        // Add all rules and facts
        VelocityContext c = new VelocityContext();
        c.put("facts", facts);
        c.put("rules", rules);

        c.put("constants", constants);
        c.put("ranges", ranges);
        c.put("variables", variables);

        c.put("predicates", predicates);
        c.put("choices", choices);

        c.put("AspGenerator", AspGenerator.class);


        // Load the template
        Template t = ve.getTemplate("./src/main/resources/templates/Java.vm");

        // Create the Java-program
        StringWriter w = new StringWriter();
        t.merge(c, w);

        return w.toString().trim();
    }

    /**
     * Create a name for a Java-variable to store objects created according to the given object.
     *
     * @param aspObject The object to be stored in a Java-variable.
     * @return The name of the Java-variable.
     */
    public static String createJavaCodeName(Object aspObject) {
        // TODO: Be a bit smarter about this
        return aspObject.getClass().getSimpleName().toLowerCase() + aspObject.hashCode();
    }
}