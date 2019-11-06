package main;

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
        StringBuilder sb = new StringBuilder();

        for(Fact fact: facts){
            sb.append(fact.getName()).append("(").append(fact.getConstant()).append(").\n");
        }

        for(Rule rule: rules){
            Predicate firstHeadPredicate = rule.getHead().getPredicates().get(0);
            sb.append(firstHeadPredicate.getName()).append("(")
                    .append(firstHeadPredicate.getVariable()).append(")");
            sb.append(" :- ");

            for(int i = 0; i < rule.getBody().getPredicates().size() - 1; ++i){
                Predicate currentPredicate = rule.getBody().getPredicates().get(i);
                sb.append(currentPredicate.getName()).append("(")
                        .append(currentPredicate.getVariable()).append("), ");
            }
            int lastIndexOfPredicates = rule.getBody().getPredicates().size() - 1;
            Predicate lastPredicate = rule.getBody().getPredicates().get(lastIndexOfPredicates);
            sb.append(lastPredicate.getName()).append("(")
                    .append(lastPredicate.getVariable()).append(").\n");
        }
        return sb.toString();
    }
}