package de.unikassel.vs.asp.modelling;

import de.unikassel.vs.asp.modelling.antlr.ASPCore2Lexer;
import de.unikassel.vs.asp.modelling.antlr.ASPCore2Parser;
import de.unikassel.vs.asp.modelling.antlr.ASPVisitor;
import de.unikassel.vs.asp.modelling.antlr.AstToJavaGenerator;
import de.unikassel.vs.asp.modelling.syntax.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AspToJavaCodeTest {

    @Test
    public void testGenerateJavaObjectsFromAst() {

        final AspGenerator testGen = new AspGenerator();

        testGen.withRules(new Rule()
                .withHead(new Head().withPredicates(new Predicate().withName("fromEddy")
                        .withElements(new Variable().withName("X"))))
                .withBody(new Body().withPredicates(new Predicate().withName("edge")
                        .withElements(new Constant().withName("eddy"), new Variable().withName("X")))));

        final String testString = "fromEddy(X) :- edge(eddy, X).";

        CharStream stringStream = CharStreams.fromString(testString);

        ASPCore2Lexer lexer = new ASPCore2Lexer(stringStream);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        ASPCore2Parser parser = new ASPCore2Parser(tokens);

        ParseTree tree = parser.statements();

        ASPVisitor aspVisitor = new ASPVisitor();
        AspGenerator gen = aspVisitor.visit(tree);
        Assertions.assertEquals(testGen, gen);
        Assertions.assertEquals(testString, gen.toString());
    }

    @Test
    public void testAspWithMoreSemantic(){

        final AspGenerator testGen = new AspGenerator();

        testGen.withRules(new Rule()
                .withHead(new Head().withPredicates(new Predicate().withName("fly")
                        .withElements(new Variable().withName("X"))))
                .withBody(new Body()
                    .withPredicates(new Predicate().withName("bird").withElements(new Variable().withName("X")))
                    .withPredicates(new Predicate().withName("fly").withFalse().withNot()
                        .withElements(new Variable().withName("X")))));

        String testString = "fly(X) :- bird(X), not -fly(X).";

        CharStream stringStream = CharStreams.fromString(testString);

        ASPCore2Lexer lexer = new ASPCore2Lexer(stringStream);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        ASPCore2Parser parser = new ASPCore2Parser(tokens);

        ParseTree tree = parser.statements();

        ASPVisitor aspVisitor = new ASPVisitor();
        AspGenerator gen = aspVisitor.visit(tree);
        Assertions.assertEquals(testGen, gen);
        Assertions.assertEquals(testString, gen.toString());
    }

    @Test
    public void testChoiceGeneration() {

        String testString = "{color(X)} = 1 :- node(X).";

        AspGenerator testGen = new AspGenerator();
        testGen.withRules(new Rule()
            .withHead(new Head()
                    .withPredicates(new Choice().withUpperBound(1).withLowerBound(1)
                            .withPredicates(new Predicate().withName("color")
                                    .withElements(new Variable().withName("X")))))
            .withBody(new Body()
                    .withPredicates(new Predicate().withName("node").withElements(new Variable().withName("X")))));

        CharStream stringStream = CharStreams.fromString(testString);

        ASPCore2Lexer lexer = new ASPCore2Lexer(stringStream);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        ASPCore2Parser parser = new ASPCore2Parser(tokens);

        ParseTree tree = parser.statements();

        ASPVisitor aspVisitor = new ASPVisitor();
        AspGenerator gen = aspVisitor.visit(tree);
        Assertions.assertEquals(testGen, gen);
        Assertions.assertEquals(testString, gen.toString());
    }

    @Test
    public void testConditionalLiteral(){
        final String testString = "a(X, Y) :- b(X, Y) : c(X, Y); d(X, Y).";

        Variable x = new Variable().withName("X");
        Variable y = new Variable().withName("Y");

        Predicate a = new Predicate().withName("a").withElements(x, y);
        Predicate b = new Predicate().withName("b").withElements(x, y);
        Predicate c = new Predicate().withName("c").withElements(x, y);
        Predicate d = new Predicate().withName("d").withElements(x, y);

        ConditionalLiteral conditionalLiteral = new ConditionalLiteral()
                .withConditional(b)
                .withConditions(c);

        Rule rule = new Rule()
                .withHead(new Head().withPredicates(a))
                .withBody(new Body().withPredicates(conditionalLiteral, d));

        AspGenerator testGen = new AspGenerator().withRules(rule);

        AstToJavaGenerator astToJavaGenerator = new AstToJavaGenerator();

        AspGenerator gen = astToJavaGenerator.generateJavaObjectsFromAspString(testString);

        System.out.println(gen.toString());
    }

    @Test
    public void travelingSalesman() {

        String testString = "{cycle(X, Y) : edge(X, Y)} = 1 :- node(X).\n" +
                            "{cycle(X, Y) : edge(X, Y)} = 1 :- node(Y).\n" +
                            "reached(Y) :- cycle(1, Y).\n" +
                            "reached(Y) :- cycle(X, Y), reached(X).\n" +
                            ":- node(Y), not reached(Y).\n" +
                            "node(1..6).\n" +
                            "cost(1, 2, 2).";

        Variable x = new Variable();
        x.withName("X");
        Variable y = new Variable();
        y.withName("Y");

        Constant one = new Constant();
        one.withName("1");

        Constant two = new Constant();
        two.withName("2");

        Rule rule1 = new Rule()
                .withHead(new Head()
                        .withPredicates(new Choice().withPredicates(new ConditionalLiteral()
                                .withConditional(new Predicate().withName("cycle").withElements(x, y))
                                .withConditions(new Predicate().withName("edge").withElements(x, y))).withLowerBound(1).withUpperBound(1)))
                .withBody(new Body().withPredicates(new Predicate().withName("node").withElements(x)));

        Rule rule2 = new Rule()
                .withHead(new Head()
                        .withPredicates(new Choice().withPredicates(new ConditionalLiteral()
                                .withConditional(new Predicate().withName("cycle").withElements(x, y))
                                .withConditions(new Predicate().withName("edge").withElements(x, y))).withLowerBound(1).withUpperBound(1)))
                .withBody(new Body().withPredicates(new Predicate().withName("node").withElements(y)));

        Rule rule3 = new Rule()
                .withHead(new Head().withPredicates(new Predicate().withName("reached").withElements(y)))
                .withBody(new Body().withPredicates(new Predicate().withName("cycle").withElements(one, y)));

        Rule rule4 = new Rule()
                .withHead(new Head().withPredicates(new Predicate().withName("reached").withElements(y)))
                .withBody(new Body().withPredicates(new Predicate().withName("cycle").withElements(x, y), new Predicate().withName("reached").withElements(x)));

        Rule rule5 = new Rule()
                .withBody(new Body().withPredicates(new Predicate().withName("node").withElements(y), new Predicate().withName("reached").withNot().withElements(y)));

        Rule rule6 = new Rule()
                .withHead(new Head().withPredicates(new Predicate().withName("node").withElements(new Range().withMin(1).withMax(6))));

        Rule rule7 = new Rule()
                .withHead(new Head().withPredicates(new Predicate().withName("cost").withElements(one, two, two)));

        AspGenerator testGen = new AspGenerator();
        testGen.withRules(rule1, rule2, rule3, rule4, rule5, rule6, rule7);

        AstToJavaGenerator astToJavaGenerator = new AstToJavaGenerator();

        AspGenerator gen = astToJavaGenerator.generateJavaObjectsFromAspString(testString);
        Assertions.assertEquals(testGen, gen);
        Assertions.assertEquals(testString, gen.toString());

    }
}
