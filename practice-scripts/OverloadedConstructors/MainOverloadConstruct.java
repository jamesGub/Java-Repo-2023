package OverloadedConstructors;
public class MainOverloadConstruct {
    public static void main(String[] args) { 
        // Overloaded Constructor - Multiple constructors within a class with the same name
        //                          but different parameters. 

        // Create a pizza object
        PizzaConstruct pizza = new PizzaConstruct("Thin crust", "Marinara", 8); 

        System.out.println("Here are the ingredients of your pizza: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);
        System.out.println(pizza.slices);
        
    }   
    
 }
