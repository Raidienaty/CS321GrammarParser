package nerdalert;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.TokenSource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        /*
        //File fileObj = new File("calculator-antlr/src/main/java/nerdalert/input.txt");
        //Scanner scannerIN = new Scanner(fileObj);

        while (scannerIN.hasNextLine())
        {
            String line = scannerIN.nextLine();

            System.out.println( line );
        }

        scannerIN.close();*/

        try
        {
            CharStream inputCharStream = new ANTLRFileStream("calculator-antlr/src/main/java/nerdalert/input.txt");
            //TokenSource tokenSource = new ShapePlacerLexer(inputCharStream);


        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
