package de.unikassel.vs.asp.modelling.antlr;

import de.unikassel.vs.asp.modelling.AspGenerator;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;


public class AstToJavaGenerator {


    /**
     * Generates a Java object structure from an ASP string.
     *
     * @param aspString The ASP string to parse.
     * @return A Java object structure representation of the input string.
     */
    public AspGenerator generateJavaObjectsFromAspString(String aspString) {
        CharStream stringStream = CharStreams.fromString(aspString);
        ASPCore2Lexer lexer = new ASPCore2Lexer(stringStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ASPCore2Parser parser = new ASPCore2Parser(tokens);
        ParseTree tree = parser.program();
        AspVisitor aspVisitor = new AspVisitor();

        return aspVisitor.visit(tree);
    }
}