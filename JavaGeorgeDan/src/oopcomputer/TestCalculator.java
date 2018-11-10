/*
 * Testare Calculator
 */
package oopcomputer;

/**
 *
 * @author Turbotwins2018
 */
public class TestCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creaza un calculator
        Carcasa calculator = new Carcasa();
        //Apasam pe butoane pana apare un operator
        calculator.buton1.apasa();
        calculator.buton2.apasa();
        calculator.buton3.apasa();
        calculator.butonPlus.apasa();
        calculator.buton3.apasa();
        calculator.buton2.apasa();
        calculator.buton1.apasa();
        //Apasam pe butoane pana apare un operator 
        calculator.butonEgal.apasa();
        // Apasam butoane pana apare =
        // afisam rezultatul
    }
    
}