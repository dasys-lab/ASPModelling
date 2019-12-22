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

    private ArrayList<Rule> rules = new ArrayList<>();

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

        // Add all rules and facts
        VelocityContext c = new VelocityContext();
        c.put("rules", rules);
        c.put("Fact", Type.FACT);
        c.put("Constraint", Type.CONSTRAINT);

        // Load the template
        Template t = ve.getTemplate("./src/main/resources/templates/ASP.vm");

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
        LinkedHashSet<ConditionalLiteral> conditionalLiterals = new LinkedHashSet<>();


        for (Rule rule : this.rules) {
            ArrayList<PredicateTerm> predicateTerms = new ArrayList<>();
            if (rule.getHead() != null) {
                predicateTerms.addAll(rule.getHead().getPredicateTerms());
            }
            if (rule.getBody() != null) {
                predicateTerms.addAll(rule.getBody().getPredicateTerms());
            }

            for (PredicateTerm predicateTerm : predicateTerms) {
                sortPredicateTerm(predicateTerm,
                        constants, ranges, variables, predicates, choices, conditionalLiterals);
            }
        }

        // Create and initialize the template engine
        VelocityEngine ve = new VelocityEngine();
        ve.init();

        // Add all rules and facts
        VelocityContext c = new VelocityContext();
        c.put("rules", rules);

        c.put("constants", constants);
        c.put("ranges", ranges);
        c.put("variables", variables);

        c.put("predicates", predicates);
        c.put("choices", choices);
        c.put("conditionalLiterals", conditionalLiterals);

        c.put("AspGenerator", AspGenerator.class);


        // Load the template
        Template t = ve.getTemplate("./src/main/resources/templates/Java.vm");

        // Create the Java-program
        StringWriter w = new StringWriter();
        t.merge(c, w);

        return w.toString().trim();
    }

    private void sortPredicateTerm(PredicateTerm predicateTerm, LinkedHashSet<Constant> constants,
                                   LinkedHashSet<Range> ranges, LinkedHashSet<Variable> variables,
                                   LinkedHashSet<Predicate> predicates, LinkedHashSet<Choice> choices,
                                   LinkedHashSet<ConditionalLiteral> conditionalLiterals) {
        if (predicateTerm instanceof Predicate) {
            for (Element element : ((Predicate) predicateTerm).getElements()) {
                sortElement(element, constants, ranges, variables);
            }
            predicates.add((Predicate) predicateTerm);
        } else if (predicateTerm instanceof Choice) {
            for (PredicateTerm innerPredicateTerm : ((Choice) predicateTerm).getPredicates()) {
                sortPredicateTerm(innerPredicateTerm,
                        constants, ranges, variables, predicates, choices, conditionalLiterals);
            }
        } else if (predicateTerm instanceof ConditionalLiteral) {
            sortPredicateTerm(((ConditionalLiteral) predicateTerm).getConditional(),
                    constants, ranges, variables, predicates, choices, conditionalLiterals);
            for (PredicateTerm innerPredicateTerm : ((ConditionalLiteral) predicateTerm).getConditions()) {
                sortPredicateTerm(innerPredicateTerm,
                        constants, ranges, variables, predicates, choices, conditionalLiterals);
            }
        } else {
            throw new IllegalStateException("Unknown predicate term of type: "
                    + predicateTerm.getClass().getSimpleName());
        }
    }

    private void sortElement(Element element, LinkedHashSet<Constant> constants,
                             LinkedHashSet<Range> ranges, LinkedHashSet<Variable> variables) {
        if (element instanceof Range) { // Range before Constant , because Range extends Constant
            ranges.add((Range) element);
        } else if (element instanceof Constant) {
            constants.add((Constant) element);
        } else if (element instanceof Variable) {
            variables.add((Variable) element);
        } else {
            throw new IllegalStateException("Unknown element of type: " + element.getClass().getSimpleName());
        }
    }

    /**
     * Create a name for a Java-variable to store objects created according to the given object.
     *
     * @param aspObject The object to be stored in a Java-variable.
     * @return The name of the Java-variable.
     */
    public static String createJavaCodeName(Object aspObject) {
        return aspObject.getClass().getSimpleName().toLowerCase()
                + ("" + aspObject.hashCode()).replace("-", "Negative");
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AspGenerator)) {
            return false;
        }
        return Objects.equals(this.rules, ((AspGenerator) other).rules);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.rules);
    }
}