import java.util.Scanner;
import java.util.ArrayList;

public class ExampleProgram {
    //Class-level fields
    private static int numIterations = 0;

    //Constructor
    public ExampleProgram() { 
        System.out.println("Creating new ExampleProgram instance..."); 

    }


//Main method
public static void main(String[] args) { 
    Scanner input = new Scanner(System.in); 
    ArrayList<Integer> numsList = new ArrayList<Integer>(); 

    System.out.println("Welcome to the Example Program! Demonstrating a bit of everything is this program's purpose."); 

    //Prompting the user for input and add numbers to an ArrayList 
    System.out.print("How many numbers do you want to enter? ");
    int numInputs = input.nextInt();
    for (int i = 0; i < numInputs; i++) { 
        System.out.println("Enter number " + (i+1) + ": ");
        int num = input.nextInt();
        numsList.add(num); 
    }
//Calculate the sum of numbers in Arraylist
int sum = 0; 
for (int num : numsList) { 
    sum += num;
}
//Call a method to print the sum
printSum(sum);
//Call a method to modify a class-level field
incrementIterations();

//Create a new ExampleProgram instance and call a method on it
ExampleProgram example = new ExampleProgram(); 
example.sayHi(); 

input.close(); 
}


//Method ot print the sum
private static void printSum(int sum) { 
    System.out.println("The sum of the numbers is: " + sum); 
}

//Method to increment the class-level field
private static void incrementIterations() { 
    numIterations++; 
    System.out.println("Number of iterations: " + numIterations);
}

private void sayHi() { 
    System.out.println("Hello from ExampleProgram!");
}

/*
 * This program includes:

    Class-level fields: numIterations
    Constructor: ExampleProgram
    Main method: main
    Scanner for user input: input
    ArrayList data structure: numsList
    For loop for iterating over user input: for (int i = 0; i < numInputs; i++)
    Enhanced for loop for iterating over ArrayList: for (int num : numsList)
    Method to print the sum: printSum
    Method to increment the class-level field: incrementIterations
    Method to print a message: sayHello
 */


} 