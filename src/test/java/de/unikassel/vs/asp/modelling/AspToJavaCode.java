package de.unikassel.vs.asp.modelling;

import de.unikassel.vs.asp.modelling.antlr.ASPCore2Lexer;
import de.unikassel.vs.asp.modelling.antlr.ASPCore2Parser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class AspToJavaCode {

    @Test
    public void testGenerateJavaObjectsFromAst() {
        final String aspString = "fromEddy(X) :- edge(eddy, X).";

        CharStream stringStream = CharStreams.fromString(aspString);

        ASPCore2Lexer lexer = new ASPCore2Lexer(stringStream);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        ASPCore2Parser parser = new ASPCore2Parser(tokens);

        ParseTree tree = parser.statement();

        ParseTreeWalker walker = new ParseTreeWalker();

        System.out.println(tree.toStringTree(parser));

    }
}
