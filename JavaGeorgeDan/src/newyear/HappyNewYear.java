/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newyear;

import scena.*;

/**
 *
 * @author Turbotwins2018
 */
public class HappyNewYear {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Elev George = new Elev();
        EliteMentor GAP = George.getEliteMentor();
        
        if (George.getYear().getCurrent() == 2019) {
            George.run();
        } else {
            George.getYear().newYear();
            George.run();
        }
    }
    
}
