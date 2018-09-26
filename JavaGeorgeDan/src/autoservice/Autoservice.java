/*
 * Java Autoservice
 */
package autoservice;

import autoservice.Car.Color;

/**
 *
 * @author Turbotwins2018
 */
public class Autoservice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Car Papuc = new Car("Dacia papuc", (short) 130, Color.WHITE);
        Car Pantof = new Car ("Dacia pantof", (short) 122, Color.GRAY);
        Car Shoshon = new Car ("Dacia Shoshon", (short) 143, Color.BLACK);
        Papuc.setSalePrice(1000);
        Papuc.setRentPrice(20);
        Pantof.setSalePrice(2000);
        Pantof.setRentPrice(40);
        Shoshon.setSalePrice(1500);
        Shoshon.setRentPrice(30);
        
        displayAutoservice(Papuc, Pantof, Shoshon);
        
        Papuc.increaseSpeed((short)(Papuc.getSpeed()+10));
        Pantof.decreaseSpeed((short)(Pantof.getSpeed()-10));
        Shoshon.setRentPrice((short)(Shoshon.getDailyRentPrice()+15));
        Shoshon.setSalePrice((short)Shoshon.getSalePrice()+1200);
        
        displayAutoservice(Papuc, Pantof, Shoshon);
    }
    
        public static void displayAutoservice(Car car1, Car car2, Car car3) {
          System.out.println("Car name: " + car1.getName());
          System.out.println("Car speed: " + car1.getSpeed());
          System.out.println("Car color: " + car1.getColor());
          System.out.println("Car sale price: " + car1.getSalePrice());
          System.out.println("Car rent price: " + car1.getDailyRentPrice());
          
          System.out.println("Car name: " + car2.getName());
          System.out.println("Car speed: " + car2.getSpeed());
          System.out.println("Car color: " + car2.getColor());
          System.out.println("Car sale price: " + car2.getSalePrice());
          System.out.println("Car rent price: " + car2.getDailyRentPrice());
          
          System.out.println("Car name: " + car3.getName());
          System.out.println("Car speed: " + car3.getSpeed());
          System.out.println("Car color: " + car3.getColor());
          System.out.println("Car sale price: " + car3.getSalePrice());
          System.out.println("Car rent price: " + car3.getDailyRentPrice());
        }
}
