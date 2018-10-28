/*
 * CreateAndWriteFile main class for CreateAndWritingFiles
 */
package exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Turbotwins2018
 */
public class CreateAndWriteFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PrintWriter writer;
        try {
            writer = new PrintWriter("I am a string that makes no sense");
            writer.println("The first line");
            writer.println("The second line");
            writer.close();
        } catch(IOException ex) {
            ex.getMessage();
        }
    }
}
