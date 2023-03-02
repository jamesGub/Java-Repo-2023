import java.util.Scanner;

public class inductArrays {
   public static void main(String[] args) {
      int[] userList = new int[20];   // List of numElement integers specified by the user
      int numElements;                // Number of integers in user's list
      // Add more variables as needed
      
      Scanner numRead = new Scanner(System.in);


      numElements = scnr.nextInt();   
      
      
      for(int i = 0; i < numElements; i++) {
    	  userList[i] = scnr.nextInt();
      }
      
      
      for(int i = numElements - 1; i>=0;i--) {
    	  System.out.print(userList[i] + ",");
      }
      System.out.println();
      
   }
}
//results in numbers ordered from largest to smallest so long as they are in range
