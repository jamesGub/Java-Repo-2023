package IfThenRNG;
import java.util.Scanner; 

public class OrdinaryDays {
    public static void main(String[] args) { 
        // switch = statement that allows a variable to be tested for equality against a list of values
        Scanner reader = new Scanner(System.in); 
        System.out.println("Enter your favorite day of the week! ");
        String day = reader.nextLine(); 
        switch(day) { 
            case "Sunday": System.out.println("It is Sunday, the day of the lord");
            break;
            case "Monday": System.out.println("It is Monday, the day of the dread");
            break;
            case "Tuesday": System.out.println("It is Tuesday, the day of mediocrity");
            break;
            case "Wednesday": System.out.println("It is Wednesday, the day of the halfway ");
            break;
            case "Thursday": System.out.println("It is Thursday, the day of the penultimate");
            break;
            case "Friday": System.out.println("It is Friday, the day of the end");
            break;
            case "Saturday": System.out.println("It is Saturday, the day of relaxation");
            break;
            default: System.out.println("That is not a day of the week!"); 
        }
        reader.close(); 
    }
}
