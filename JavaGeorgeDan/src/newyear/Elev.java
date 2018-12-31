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
public class Elev extends Thread{
    
    private EliteMentor eliteMentor = new EliteMentor(this);
    private Urare urare = new Urare();
    private Year year = new Year();

    public EliteMentor getEliteMentor() {
        return eliteMentor;
    }
    
    
    public void send(){
        this.urare.setText("Happy New Year !!!");
        this.eliteMentor.setUrareAnNou(this.urare.getText());
        System.out.println(this.eliteMentor.getUrareAnNou());
    }

    public Year getYear() {
        return year;
    }
    
    @Override
    public void run(){
        this.send();
    }
    
}
