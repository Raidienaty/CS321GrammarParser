package nerdalert;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try
        {
            File fileObj = new File("calculator-antlr/src/main/java/nerdalert/input.txt");
            Scanner scannerIN = new Scanner(fileObj);

            while (scannerIN.hasNextLine())
            {
                String line = scannerIN.nextLine();

                System.out.println( line );
            }

            scannerIN.close();

        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}
