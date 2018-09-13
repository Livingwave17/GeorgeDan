/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author Turbotwins2018
 */
public class ExecutorCalcule {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here 
    
        Calculator unCalculator = new Calculator();
        
        System.out.println("Introduceti primul numar");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        
        System.out.println("Introduceti al doilea numar");
        Scanner sk = new Scanner(System.in);
        int y = sk.nextInt();
        
        int iesireAdunare = unCalculator.aduna(i, y);
        System.out.println(iesireAdunare);
        
        int iesireScadere = unCalculator.scade(i, y);
        System.out.println(iesireScadere);
        
        int iesireInmultire = unCalculator.inmulteste(i, y);
        System.out.println(iesireInmultire);
        
        int iesireImpartire = unCalculator.imparte(i, y);
        System.out.println(iesireImpartire);
}
}