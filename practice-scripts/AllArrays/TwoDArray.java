package AllArrays;

public class TwoDArray {
    public static void main(String[] args) { 
        //2D Array - An array of arrays
        String[][] cars = new String[3][3]; 

        // (0, 0)
        cars[0][0] = "Camaro";
        cars[0][1] = "Corvette";
        cars[0][2] = "Silverado";
        cars[1][0] = "Mustang"; 
        cars[1][1] = "Ranger";
        cars[1][2] = "Tesla"; 
        cars[2][0] = "F-150";
        cars[2][1] = "Lamborghini"; 
        cars[2][2] = "Truck lol";

        /* Alt-method
        String[][] cars = {
                    {"Camaro", "Corvette", "Silverado"},
                    {"Mustang", "Ranger","F-150"},
                    {"Ferrari", "Lambo", "Tesla"}
                    }; 
         */


        // Nested loop to access the elements
        for(int i = 0; i < cars.length; i++) { 
            System.out.println();
            for(int j = 0; j < cars[i].length; j++) {
                System.out.println(cars[i][j]+" "); 
            }
        }
    }
}
