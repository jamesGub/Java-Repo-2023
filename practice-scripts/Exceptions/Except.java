package Exceptions;
import java.util.Scanner;

public class Except { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a dividend: ");
        int dividend = sc.nextInt(); 
        System.out.println("Enter a divisor: ");
        int divisor = sc.nextInt(); 

        try { 
            int quotient = dividend / divisor;
            System.out.println("Quotient = " + quotient); 
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e); 
            // Exception caught: java.lang.ArithmeticException: / by zero
        }
        sc.close(); 
     }
}