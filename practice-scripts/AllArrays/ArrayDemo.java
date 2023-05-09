package AllArrays;
public class ArrayDemo {
    public static void main(String[] args) { 
        // array - used to store multiple values in a single variable
        // Have to be the same data type in the array
        
        // Assign a total of 3 elements to our cars and give values later
        String[] cars = new String[3]; 

        cars[0] = "Camaro";
        cars[1] = "Corvette";
        cars[2] = "Tesla"; 

        System.out.println(cars[2]);

        // Use a for loop to iterate through an array
        for(int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);  

        }


    }
}
