//Importing the Java scanner function 
import java.util.Scanner;

//Class that matches the Java file name
public class Mileage {
	//Our main method
	public static void main(String[] args) {
	//Text welcoming the user to the program and stating what it does
	System.out.println("Welcome to the milage calculator! \n");
	//Our scanner which we named askMiles
	Scanner askMiles = new Scanner(System.in);
	//First input question for the user
	System.out.println("How many miles have you driven? : ");
	//Double declaration for the miles, also input the miles driven
	double miles = askMiles.nextDouble(); 
	//Returns the miles of the user that they inputed plus some sample text
	System.out.println("Here are your miles: " + miles);
	//Asking the user how many gallons they have exhausted 
	System.out.println("How many gallons have you used? : ");
	//Double declaration for the gallons and the input for it
	double gallons = askMiles.nextDouble();
	//Returns the gallons plus some sample text
	System.out.println("Here are your gallons: " + gallons);
	//The division of the miles and gallons to return the total mileage, also a double
	double divi = (miles / gallons); 
	//Return of the miles per gallon, plus sample text. 
	System.out.println("Here are your miles per gallon: " + divi);
	
	
	}
	
}
