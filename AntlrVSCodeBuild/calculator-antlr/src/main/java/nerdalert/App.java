package nerdalert;

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

import parser.*;

public class App 
{
    public static void main( String[] args )
    {
        try
        {
            CharStream inputCharStream = CharStreams.fromFileName("calculator-antlr/src/main/java/nerdalert/input.txt");
            
            Lexer lexer = new CalculatorLexer(inputCharStream);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            CalculatorParser parser = new CalculatorParser(tokens);
            ParseTree parseTree = parser.start();

            Listener listener = new Listener();
            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(listener, parseTree);

            System.out.print(listener.getResult() + "\n");

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
