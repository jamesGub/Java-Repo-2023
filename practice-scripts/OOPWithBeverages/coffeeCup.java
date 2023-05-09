package OOPWithBeverages;
    // Built in object, coffee cup. 
    public class coffeeCup { 
        String brew = "Dark roast";
        boolean milkOrSugar;
        boolean caffeine = false;
        String color = "Black";
        int size = 12;
        
        void drink() { 
            System.out.println("You drank some coffee, you feel perked up and focused.");
        }
        void refill() { 
            System.out.println("You filled up your coffee, nice!\n");
        }
        void spill() { 
            System.out.println("You spilt your coffee! Watch out, it's hot!");
        }
        void noCoffee() { 
            System.out.println("You did not order any coffee.");
        }
    }

