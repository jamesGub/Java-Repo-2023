package Constructors;
public class ConstructorDemo {
    public static void main(String[] args) { 
        
        // Different objects with different attributes
        Outfit outfit = new Outfit("Cardigan", true, "Boots"); 
        Outfit outfit2 = new Outfit("Tank top", false, "Sandals"); 

        // System.out.println(outfit2.shoes);
        outfit2.tryOn();
        outfit.returned(); 
        // Each object is using a different method. 
    }
}
