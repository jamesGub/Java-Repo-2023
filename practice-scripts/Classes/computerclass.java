package Classes;
public class computerclass { 
    
    
    
    /*Fields - variables that hold data for each object of the class. They represent the 
    state of the object. For example, we have a class called "computer class", we could define fields 
    for the brand, parts, peripherals, etc for the computer.*/ 
    //
    String brand;
    String parts;
    String peripherals;
    String specs; 
    String color;


public void powerOn() {
    System.out.println("Turning on your " + color + brand + " computer with " + parts + peripherals + " and " + specs + ".");
    //Code to turn on the computer
}

public void turnOff() { 
    System.out.println("Turning off your " + color + brand + " computer with " + parts + peripherals + " and " + specs + ".");
}

    
}