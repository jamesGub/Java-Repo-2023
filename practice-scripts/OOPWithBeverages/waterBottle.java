package OOPWithBeverages;

public class waterBottle {
    String color = "Black";
    String brand = "Hydro Flask";
    boolean full = true;
    double price = 59.99; 

    // Methods
    void drink() { 
        System.out.println("You drank some water, you feel refreshed.");

    }
    void spill() { 
        System.out.println("You spilt some water on the floor, you should clean it up.");
    }

}
        // object = an instance of a class that may contain attributes and methods.
        // example: (phone, desk, computer, water bottle)
        // Water Bottle: String color: black, boolean Full: True, int Size: 1 pint
        // Methods: Drink() ("You drank the water") Spill() ("You spill the water") Refill() ("You refill your water"), repeat previous two methods
        // Separate files to stay organized, one for defining the classes, another for main methods. 