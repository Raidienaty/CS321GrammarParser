package nerdalert;

import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

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

    private CommonTokenStream getTokensFromText(String txt){
        CharStream stream = CharStreams.fromString(txt);
        Lexer lexer = new LanguageLexer(stream);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        tokens.fill();
        return tokens;    
    }
    /**
     * Rigorous Test :-)
     */
    @Test
    @DisplayName("Basic Lexer Tests")
    public void tokenTest() throws IOException
    {
        CommonTokenStream tokens = getTokensFromText("var = 1;");

        assertEquals(tokens.size(), 5);
    }
}
