package nerdalert;

import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStreams;

import parser.*;


/**
 * Unit test for simple App.
 */
public class AppTest 
{

    /**
     * Rigorous Test :-)
     */
    @Test
    @DisplayName("Testing that testing runs")
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void setVariable() throws IOException
    {
        CharStream inputCharStream = CharStreams.fromFileName("language-parser/src/test/java/nerdalert/varTest.dcf");
        Lexer lexer = new LanguageLexer(inputCharStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LanguageParser parser = new LanguageParser(tokens);
        ParseTree parseTree = parser.start();
    
        EvalVisitor visitor = new EvalVisitor();
    
        assertTrue(visitor.visit(parseTree) == "1");
    }
}
