package de.unikassel.vs.asp.modelling.antlr;

import de.unikassel.vs.asp.modelling.AspGenerator;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;


public class AstToJavaGenerator {


    public AspGenerator generateJavaObjectsFromAspString(String aspString) {
        CharStream stringStream = CharStreams.fromString(aspString);

        ASPCore2Lexer lexer = new ASPCore2Lexer(stringStream);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        ASPCore2Parser parser = new ASPCore2Parser(tokens);

        ParseTree tree = parser.program();

        ASPVisitor aspVisitor = new ASPVisitor();

        return aspVisitor.visit(tree);
    }
}