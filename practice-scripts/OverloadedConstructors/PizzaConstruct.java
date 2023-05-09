package OverloadedConstructors;
public class PizzaConstruct {
    
    String bread;
    String sauce;
    String cheese;
    String topping; 
    int slices; 
    
    // Same name as the class, parenthesis, curly brackets
    PizzaConstruct(String bread, String sauce, String cheese, String topping, int slices) { 
        this.bread = bread; 
        this.sauce = sauce; 
        this.cheese = cheese;
        this.topping = topping;
        this.slices = slices;
    
        //Constructors overloaded will have different parameters, if I want a cheese pizza instead of one with toppings. 
        
    }

    PizzaConstruct(String bread, String sauce, String cheese, int slices) { 
        this.bread = bread; 
        this.sauce = sauce; 
        this.cheese = cheese;
        this.slices = slices;
    }

    PizzaConstruct(String bread, String sauce, int slices) { 
        this.bread = bread; 
        this.sauce = sauce; 
        this.slices = slices;
    }

    PizzaConstruct(String bread) { 
        this.bread = bread; 
    }
}
