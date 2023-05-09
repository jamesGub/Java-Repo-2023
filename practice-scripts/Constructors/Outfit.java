package Constructors;
public class Outfit {
    
    String shirt;
    boolean hat;
    String shoes;
   
    Outfit(String shirt, boolean hat, String shoes) { 
        this.shirt = shirt;
        this.hat = hat;
        this.shoes = shoes;
    }

    void tryOn() { 
        System.out.println(this.shirt + " is getting worn!");
    }
    void returned() { 
        System.out.println(this.shirt + " is getting returned.");;
    }
}
    // creating the constructor with parameters
    // to instantiate the object, we need to send the constructor some values. 
    // send the values
    // Need to assign values to the object, use the "this" keyword
    // Constructors allow us to make objects with varying attributes