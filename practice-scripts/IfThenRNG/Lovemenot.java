package IfThenRNG;
import java.util.Scanner; 

public class Lovemenot {
    public static void main(String[] args) { 
        Scanner lovereader = new Scanner(System.in); 
        System.out.println("Do you want to ask out Ana? ");
        String result = lovereader.nextLine(); 
 

        if (result == "yes") { 
            System.out.println("That is too bad, you are going out with cat girl instead");
        }
        else { 
            System.out.println("Good, now go do your Java ++"); 
        }
        lovereader.close();
    }
    
}
