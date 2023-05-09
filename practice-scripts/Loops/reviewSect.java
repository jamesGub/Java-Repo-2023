

public class reviewSect {
   public static void main(String[] args) { 
   int index = 0;
   int[] nums = new int[21]; 
   
   for (int i = 0; i <= 100; i += 5) { 
        nums[index] = i;
        index++;
   }

   int newDex = 1;
   while (newDex < nums.length) { 
    System.out.println(nums[newDex]);
    newDex += 2;
   }
}
}
