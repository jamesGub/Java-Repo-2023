import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner; 

public class FileToArray {
    public static void main(String[] args) {
        try { 
            Scanner scanner = new Scanner(new File("friends.txt")); 
            int[] arr = new int[99]; 
            int i = 0;
            while (scanner.hasNextInt() && i < arr.length) { 
                arr[i] = scanner.nextInt();
                i++;
            }
            scanner.close();
            printArray(arr); 
         } catch (FileNotFoundException e) { 
            System.out.println("File not found: " + e.getMessage()); 
         }
    }    

    public static void printArray(int[] arr) { 
        for (int i = 0; i < arr.length; i++) { 
            System.out.print(arr[i] + " "); 
        }
        System.out.println(); 
    }
}


