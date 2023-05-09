package ArrayofObjects;

public class MainAoO {
    public static void main(String[] args) { 
        /* 
        int[] numbers = new int[3];
        char[] characters = new char[4]; 
        String[] strings = new String[5];
        */

        // We now have an array that holds the objects for us
        // Alt: Restaurant[] dishes = new Restaurant[4];

        Restaurant dish1 = new Restaurant("Escargot");
        Restaurant dish2 = new Restaurant("Viande du Boeuf");
        Restaurant dish3 = new Restaurant("Fillet Mignon");
        Restaurant dish4 = new Restaurant("Baguette");

        Restaurant[] dishes = {dish1, dish2, dish3, dish4};

        /* Alt:
        dishes[0] = dish1;
        dishes[1] = dish2;
        dishes[2] = dish3;
        dishes[3] = dish4;
        */

        // This will print the name since we passed that variable.
        System.out.println(dishes[0].name);
        System.out.println(dishes[1].name);
        System.out.println(dishes[2].name);
        System.out.println(dishes[3].name);
    }
}
