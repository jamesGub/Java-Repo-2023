
import java.util.Scanner;
public class NestedLoops {
    public static void main(String[] args) { 
        // nested loops are loops inside of another loop
        Scanner scanner = new Scanner(System.in);
        int rows;
        int columns;
        String symbol = ""; 

        System.out.println("Enter number of rows: "); 
        rows = scanner.nextInt();
        System.out.println("Enter your number of columns: ");
        columns = scanner.nextInt();
        System.out.println("Enter symbol to use: "); 
        symbol = scanner.next(); 

        // Outer for loop in charge of the rows
        for(int i = 1; i <= rows; i++) {
            System.out.println();  // Move down to the next line
            // Nested loop in charge of the columns
            for(int j = 1; j <= columns; j++) { 
                System.out.print(symbol);
            }
        }
        scanner.close();
    }
}
