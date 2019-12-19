package de.unikassel.vs.asp.modelling;

import de.unikassel.vs.asp.modelling.antlr.*;
import de.unikassel.vs.asp.modelling.syntax.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
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
    public void testChoiceGeneration(){

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
}
