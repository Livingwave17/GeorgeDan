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
public class Year {
    private Integer current = 2018;
    
    public void newYear(){
        this.current+=1;
    }

    public Integer getCurrent() {
        return current;
    }
}
