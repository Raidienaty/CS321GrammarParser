package nerdalert;

import parser.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.TokenSource;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.CharStreams;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
        CharStream inputCharStream = CharStreams.fromFileName("print-parser/src/main/java/nerdalert/input.txt");
            
        Lexer lexer = new PrinterLexer(inputCharStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PrinterParser parser = new PrinterParser(tokens);
        ParseTree parseTree = parser.start();

        Listener listener = new Listener();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener, parseTree);

        System.out.println(listener.getResult());
    }
}
