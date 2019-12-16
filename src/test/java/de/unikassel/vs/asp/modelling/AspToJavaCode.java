package de.unikassel.vs.asp.modelling;

import com.ibm.icu.impl.Assert;
import de.unikassel.vs.asp.modelling.antlr.ASPCore2Lexer;
import de.unikassel.vs.asp.modelling.antlr.ASPCore2Parser;
import de.unikassel.vs.asp.modelling.antlr.AstToJavaGenerator;
import de.unikassel.vs.asp.modelling.antlr.EvalVisitor;
import de.unikassel.vs.asp.modelling.syntax.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AspToJavaCode {

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

        AstToJavaGenerator toJavaGenerator = new AstToJavaGenerator();

        // System.out.println(tree.toStringTree(parser));

        AspGenerator gen = toJavaGenerator.startTraversing(parser, tree);
        Assertions.assertEquals(gen, testGen);
        Assertions.assertEquals(gen.toString(), testString);
    }
}
