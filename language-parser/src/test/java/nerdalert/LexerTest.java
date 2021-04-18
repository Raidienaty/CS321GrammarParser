package nerdalert;

import java.io.IOException;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

import parser.*;


/**
 * Unit test for simple App.
 */
public class LexerTest 
{

    private List<Token> getTokensFromText(String txt){
        CharStream stream = CharStreams.fromString(txt);
        Lexer lexer = new LanguageLexer(stream);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        tokens.fill();
        return tokens.getTokens();    
    }

    @Test
    public void assignmentLexerTest() throws IOException
    {
        List<Token> tokens = getTokensFromText("var = 1;");

        assertEquals(tokens.size(), 5);
        assertEquals(LanguageLexer.VARIABLENAME, tokens.get(0).getType());
        assertEquals(LanguageLexer.ASSIGNMENT, tokens.get(1).getType());
        assertEquals(LanguageLexer.NUMBER, tokens.get(2).getType());
        assertEquals(LanguageLexer.SEMICOLON, tokens.get(3).getType());
        assertEquals(LanguageLexer.EOF, tokens.get(4).getType());
    }

    @Test
    public void printLexerTest() throws IOException
    {
        List<Token> tokens = getTokensFromText("print(\"A string literal\");");

        assertEquals(tokens.size(), 6);
        assertEquals(LanguageLexer.PRINT, tokens.get(0).getType());
        assertEquals(LanguageLexer.LPARENTHESIS, tokens.get(1).getType());
        assertEquals(LanguageLexer.STRING, tokens.get(2).getType());
        assertEquals(LanguageLexer.RPARENTHESIS, tokens.get(3).getType());
        assertEquals(LanguageLexer.SEMICOLON, tokens.get(4).getType());
        assertEquals(LanguageLexer.EOF, tokens.get(5).getType());

    }

    @Test
    public void additionLexerTest() throws IOException
    {
        List<Token> tokens = getTokensFromText("var = 1+2;");

        assertEquals(tokens.size(), 7);
        assertEquals(LanguageLexer.VARIABLENAME, tokens.get(0).getType());
        assertEquals(LanguageLexer.ASSIGNMENT, tokens.get(1).getType());
        assertEquals(LanguageLexer.NUMBER, tokens.get(2).getType());
        assertEquals(LanguageLexer.ADD, tokens.get(3).getType());
        assertEquals(LanguageLexer.NUMBER, tokens.get(4).getType());
        assertEquals(LanguageLexer.SEMICOLON, tokens.get(5).getType());
        assertEquals(LanguageLexer.EOF, tokens.get(6).getType());
    }

    @Test
    public void subtractionLexerTest() throws IOException
    {
        List<Token> tokens = getTokensFromText("var = 1-2;");

        assertEquals(tokens.size(), 7);
        assertEquals(LanguageLexer.VARIABLENAME, tokens.get(0).getType());
        assertEquals(LanguageLexer.ASSIGNMENT, tokens.get(1).getType());
        assertEquals(LanguageLexer.NUMBER, tokens.get(2).getType());
        assertEquals(LanguageLexer.SUBTRACT, tokens.get(3).getType());
        assertEquals(LanguageLexer.NUMBER, tokens.get(4).getType());
        assertEquals(LanguageLexer.SEMICOLON, tokens.get(5).getType());
        assertEquals(LanguageLexer.EOF, tokens.get(6).getType());
    }

    @Test
    public void multiplicationLexerTest() throws IOException
    {
        List<Token> tokens = getTokensFromText("var = 1*2;");

        assertEquals(tokens.size(), 7);
        assertEquals(LanguageLexer.VARIABLENAME, tokens.get(0).getType());
        assertEquals(LanguageLexer.ASSIGNMENT, tokens.get(1).getType());
        assertEquals(LanguageLexer.NUMBER, tokens.get(2).getType());
        assertEquals(LanguageLexer.MULTIPLY, tokens.get(3).getType());
        assertEquals(LanguageLexer.NUMBER, tokens.get(4).getType());
        assertEquals(LanguageLexer.SEMICOLON, tokens.get(5).getType());
        assertEquals(LanguageLexer.EOF, tokens.get(6).getType());
    }

    @Test
    public void divisionLexerTest() throws IOException
    {
        List<Token> tokens = getTokensFromText("var = 1/2;");

        assertEquals(tokens.size(), 7);
        assertEquals(LanguageLexer.VARIABLENAME, tokens.get(0).getType());
        assertEquals(LanguageLexer.ASSIGNMENT, tokens.get(1).getType());
        assertEquals(LanguageLexer.NUMBER, tokens.get(2).getType());
        assertEquals(LanguageLexer.DIVIDE, tokens.get(3).getType());
        assertEquals(LanguageLexer.NUMBER, tokens.get(4).getType());
        assertEquals(LanguageLexer.SEMICOLON, tokens.get(5).getType());
        assertEquals(LanguageLexer.EOF, tokens.get(6).getType());
    }

    @Test
    public void modulusLexerTest() throws IOException
    {
        List<Token> tokens = getTokensFromText("var = 1%2;");

        assertEquals(tokens.size(), 7);
        assertEquals(LanguageLexer.VARIABLENAME, tokens.get(0).getType());
        assertEquals(LanguageLexer.ASSIGNMENT, tokens.get(1).getType());
        assertEquals(LanguageLexer.NUMBER, tokens.get(2).getType());
        assertEquals(LanguageLexer.MODULUS, tokens.get(3).getType());
        assertEquals(LanguageLexer.NUMBER, tokens.get(4).getType());
        assertEquals(LanguageLexer.SEMICOLON, tokens.get(5).getType());
        assertEquals(LanguageLexer.EOF, tokens.get(6).getType());
    }

    @Test
    public void powerLexerTest() throws IOException
    {
        List<Token> tokens = getTokensFromText("var = 1^2;");

        assertEquals(tokens.size(), 7);
        assertEquals(LanguageLexer.VARIABLENAME, tokens.get(0).getType());
        assertEquals(LanguageLexer.ASSIGNMENT, tokens.get(1).getType());
        assertEquals(LanguageLexer.NUMBER, tokens.get(2).getType());
        assertEquals(LanguageLexer.POWER, tokens.get(3).getType());
        assertEquals(LanguageLexer.NUMBER, tokens.get(4).getType());
        assertEquals(LanguageLexer.SEMICOLON, tokens.get(5).getType());
        assertEquals(LanguageLexer.EOF, tokens.get(6).getType());
    }

    @Test
    public void ifLexerTest() throws IOException
    {
        List<Token> tokens = getTokensFromText("if(true){print(\"true\");}");

        assertEquals(tokens.size(), 12);
        assertEquals(LanguageLexer.IF, tokens.get(0).getType());
        assertEquals(LanguageLexer.LPARENTHESIS, tokens.get(1).getType());
        assertEquals(LanguageLexer.BOOL, tokens.get(2).getType());
        assertEquals(LanguageLexer.RPARENTHESIS, tokens.get(3).getType());
        assertEquals(LanguageLexer.LBRACE, tokens.get(4).getType());
        assertEquals(LanguageLexer.RBRACE, tokens.get(10).getType());
    }

    @Test
    public void elseLexerTest() throws IOException
    {
        List<Token> tokens = getTokensFromText("if(true){print(\"true\");}else{print(\"false\");}");

        assertEquals(LanguageLexer.ELSE, tokens.get(11).getType());
        assertEquals(LanguageLexer.LBRACE, tokens.get(12).getType());
        assertEquals(LanguageLexer.RBRACE, tokens.get(18).getType());

    }

    @Test
    public void elifLexerTest() throws IOException
    {
        List<Token> tokens = getTokensFromText("if(true){print(\"true\");}else if(false){print(\"false\");}");

        assertEquals(LanguageLexer.ELIF, tokens.get(11).getType());
        assertEquals(LanguageLexer.LPARENTHESIS, tokens.get(12).getType());
        assertEquals(LanguageLexer.BOOL, tokens.get(13).getType());
        assertEquals(LanguageLexer.RPARENTHESIS, tokens.get(14).getType());
        assertEquals(LanguageLexer.LBRACE, tokens.get(15).getType());
        assertEquals(LanguageLexer.RBRACE, tokens.get(21).getType());
    }

    @Test
    public void equalsLexerTest() throws IOException
    {
        List<Token> tokens = getTokensFromText("if(true == true){print(\"true\");}");

        assertEquals(LanguageLexer.EQUIVALENT, tokens.get(3).getType());
    }
    @Test
    public void notEqualLexerTest() throws IOException
    {
        List<Token> tokens = getTokensFromText("if(1 != 2){print(\"true\");}");

        assertEquals(LanguageLexer.NOTEQUIVALENT, tokens.get(3).getType());
    }

    @Test
    public void notLexerTest() throws IOException
    {
        List<Token> tokens = getTokensFromText("if(!true){print(\"true\");}");

        assertEquals(LanguageLexer.NOT, tokens.get(2).getType());
    }


    @Test
    public void strictlyLessThanLexerTest() throws IOException
    {
        List<Token> tokens = getTokensFromText("if(1 < 2){print(\"true\");}");

        assertEquals(LanguageLexer.LESSTHAN, tokens.get(3).getType());
    }

    @Test
    public void strictlyGreaterThanLexerTest() throws IOException
    {
        List<Token> tokens = getTokensFromText("if(1 > 2){print(\"true\");}");

        assertEquals(LanguageLexer.GREATERTHAN, tokens.get(3).getType());
    }

    @Test
    public void lessThanOrEqualLexerTest() throws IOException
    {
        List<Token> tokens = getTokensFromText("if(1 <= 2){print(\"true\");}");

        assertEquals(LanguageLexer.LESSTHANEQUALS, tokens.get(3).getType());
    }

    @Test
    public void greaterThanOrEqualLexerTest() throws IOException
    {
        List<Token> tokens = getTokensFromText("if(1 >= 2){print(\"true\");}");

        assertEquals(LanguageLexer.GREATERTHANEQUALS, tokens.get(3).getType());
    }

    @Test
    public void andLexerTest() throws IOException
    {
        List<Token> tokens = getTokensFromText("if(true && true){print(\"true\");}");

        assertEquals(LanguageLexer.AND, tokens.get(3).getType());
    }

    @Test
    public void orLexerTest() throws IOException
    {
        List<Token> tokens = getTokensFromText("if(true || false){print(\"true\");}");

        assertEquals(LanguageLexer.OR, tokens.get(3).getType());
    }
}
