package MethodstoStringetc;

public class Zoo {
    
    String animal1 = "monkey";
    String animal2 = "gorilla";
    String animal3 = "lion";
    String animal4 = "penguin";
    String exhibit = "aquarium"; 
    boolean guests = true;
    int zones = 5;

    public String toString() { 
        
        return animal1 +"\n" + animal2 + "\n" + animal3 + "\n" + animal4 + "\n" + exhibit + "\n" + guests + "\n" + zones;
        // Return a string representation of the whole object. 
    }
}
