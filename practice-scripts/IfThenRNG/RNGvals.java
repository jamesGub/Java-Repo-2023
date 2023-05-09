package IfThenRNG;
import java.util.Random; 
import java.util.Scanner;

public class RNGvals {
    public static void main(String[] args) { 
        
        // Using random class like the scanner 
        Random random = new Random(); 

        Scanner scanner = new Scanner(System.in);

        System.out.println("You are playing a game! Press q or Q to quit"); 
        String response = scanner.next(); 

        if(!response.equals("q") && !response.equals("Q")) { 
            System.out.println("Welcome to the game, you come face to face with a large monster!"); 
        

        // Limit the size of the randomness, add one so we don't start at zero
        int x = random.nextInt(20) + 1;
        
        //boolean killState;   
        
        System.out.println(x); 
        
        if(x <= 12) { 
            System.out.println("You hit for " + x + " damage...that wasn't very much\n"); 
           // killState = false;
            System.out.println("The enemy is still standing...\n");
            
            
        }
        else if (x >= 13 && x <= 17) { 
            System.out.println("You hit for " + x + " damage! Not bad. \n");
          //  killState = false; 
            System.out.println("The enemy is still standing...\n");
            }
            
        
        else { 
            System.out.println("Critical hit!\n");
            System.out.println("The enemy has been defeated!\n"); 
            
        }
    }
        else {
            System.out.println("You quit the game"); 
         }

        scanner.close(); 
    }    
}
