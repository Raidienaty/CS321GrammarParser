package nerdalert;

import parser.*;

import java.io.IOException;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.CharStreams;

public class Main 
{
    public static void main( String[] args ) throws IOException
    {
        CharStream inputCharStream = CharStreams.fromFileName("language-parser/src/main/java/nerdalert/input.dcf");
            
        Lexer lexer = new LanguageLexer(inputCharStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LanguageParser parser = new LanguageParser(tokens);
        ParseTree parseTree = parser.start();

        Listener listener = new Listener();
        ParseTreeWalker walker = new ParseTreeWalker();
        
        walker.walk(listener, parseTree);
    }
}
