package Classes;
import java.util.Scanner;

public class MathClass {
    public static void main(String[] args) { 
        double x;
        double y;
        double h; 

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter side x: ");
        x = scanner.nextDouble(); 
        
        System.out.println("enter side y: ");
        y = scanner.nextDouble(); 

        // Finding the hypotenuse
        h = Math.sqrt((x * x) + (y * y));
        System.out.println("the Hypotenuse is " + h); 

        scanner.close(); 
        
        

        //Abs, min, max, sqrt, round, ceil(rounds up), floor(rounds down)
    }    
}
