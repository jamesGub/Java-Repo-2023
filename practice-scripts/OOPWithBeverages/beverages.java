package OOPWithBeverages;
import java.util.Scanner;

public class beverages {
    public static void main(String[] args) { 
        
        Scanner order = new Scanner(System.in); 
        
        //Creating the object with all the properties, has all the characteristics and methods. 
        waterBottle myWaterBottle = new waterBottle(); 
        coffeeCup myCoffeeCup = new coffeeCup(); 

        System.out.println("There are drinks in your kitchen.\n");

        System.out.println("The kind of water bottle is: \n" + myWaterBottle.brand);
        System.out.println("The color of the water bottle is: \n" + myWaterBottle.color);
        System.out.println("The water bottle is full? \n" + myWaterBottle.full);

        
        if(myWaterBottle.full == true ) { 
            myWaterBottle.drink();
            myWaterBottle.spill();
        }
        else {
            System.out.println("You don't have any water!\n");
        }

        System.out.println("Do you want some coffee? Yes or No: \n");
        String answer = order.nextLine(); 

        if (answer.equalsIgnoreCase("Yes")) { 
            System.out.println("The brew of your cup of coffee is: \n" + myCoffeeCup.brew);
            System.out.println("The color of your coffee cup is: \n" + myCoffeeCup.color);
            // Order logic
            System.out.println("Do you want milk or sugar? Yes or No: \n");
            String response = order.next();
            if (response.equalsIgnoreCase("Yes")) { 
                myCoffeeCup.milkOrSugar = true;
                System.out.println("You put in some milk and sugar.\n");
                System.out.println("Do you want decaf or caffeinated? Yes or No: \n");
                String caf = order.next(); 
                if (caf.equalsIgnoreCase("Yes")) { 
                    myCoffeeCup.caffeine = true; 
                    System.out.println("Your coffee is caffeinated, yummy.\n");
                    myCoffeeCup.drink();
                    System.out.println("Do you want more coffee? Y or N: \n");
                    String fill = order.next();
                    if (fill.equalsIgnoreCase("Yes")) { 
                        myCoffeeCup.refill(); 
                        myCoffeeCup.spill();
                    } else { 
                        System.out.println("You did not refill your coffee.\n");
                    }
                } else { 
                    myCoffeeCup.caffeine = false;
                    System.out.println("You did not want caffeinated coffee.\n");
                }
            } else { 
                myCoffeeCup.milkOrSugar = false; 
                System.out.println("You did not put in milk and sugar.\n");
            }
        } else { 
            myCoffeeCup.noCoffee();
        }
        order.close();
    }
}

