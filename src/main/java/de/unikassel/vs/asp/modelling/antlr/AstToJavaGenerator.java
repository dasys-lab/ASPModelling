package de.unikassel.vs.asp.modelling.antlr;

import java.util.Arrays;
import java.util.List;
import de.unikassel.vs.asp.modelling.AspGenerator;
import de.unikassel.vs.asp.modelling.syntax.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.Trees;


public class AstToJavaGenerator {


    public AspGenerator generateJavaObjectsFromAspString(String aspString) {
        CharStream stringStream = CharStreams.fromString(aspString);

        ASPCore2Lexer lexer = new ASPCore2Lexer(stringStream);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        ASPCore2Parser parser = new ASPCore2Parser(tokens);

        ParseTree tree = parser.statements();

        ASPVisitor aspVisitor = new ASPVisitor();

        return aspVisitor.visit(tree);
    }
}