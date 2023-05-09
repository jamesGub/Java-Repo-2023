import java.util.Random;

public class everything { 
    public static void main(String[] args) { 
        int[] randomNums = new int[100]; 
        Random random = new Random(); 

        for (int i = 0; i < randomNums.length; i++) { 
            randomNums[i] = random.nextInt(1000) + 1;
        }

        for (int i = 0; i < randomNums.length; i++) { 
            System.out.print(randomNums[i] + " ");
        }
    }
}