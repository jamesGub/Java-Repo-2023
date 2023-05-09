package MethodstoStringetc;


public class MaintoString { 
    public static void main(String[] args) { 
        Zoo zoo = new Zoo(); 
      
        // Explicit
        System.out.println(zoo.toString());
        // Implicit
        System.out.println(zoo);

    }
}


// toString() = special method that all objects inherit, 
//              that returns a string that "textually represents" an object.
//              can be used both implicitly and explicitly

// Returns the address of where the object is in memory.

// Override the toString method to display textually.