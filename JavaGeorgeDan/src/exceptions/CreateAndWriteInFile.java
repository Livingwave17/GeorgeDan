/*
 * Creates a file and writes something in it
 */
package exceptions;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Turbotwins2018
 */
public class CreateAndWriteInFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        File written = new File("D:\\Koding\\Scoala Informala\\JavaDevelopment\\Teme\\written.txt");
        try {
            written.createNewFile();
            try{
            FileWriter theAmanuensis = new FileWriter(written);
            theAmanuensis.write("I am the Amanuensis!");
                try {
                    theAmanuensis.close();
                } catch (IOException E) {
                    System.out.println("Couldn't close FileWriter: " + E.getMessage());
                }
            } catch (IOException e) {
                System.out.println("Write Failed: " + e.getMessage());
            }
        } catch (IOException ex) {
            Logger.getLogger(CreateAndWriteInFile.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
    }
    
}
