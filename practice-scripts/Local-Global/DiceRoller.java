import java.util.Random;

public class DiceRoller {
    
    // Global variables in the class.
    Random random;
    int number;

    DiceRoller(){ 
        random = new Random();
        roll();
    }

    void roll() { 
        number = random.nextInt(6)+1;
        System.out.println(number);

    }
}

// Roll method does not have access to the DiceRoller method.
// Declare as parameters or global variables