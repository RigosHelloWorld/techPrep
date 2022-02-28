

public class Leetcode1920 {
  
  public static int[] buildArray(int[] nums) {
    int [] myArray = new int[nums.length];
    
    for(int i =0; i < nums.length; i++){
        int element = nums[i];
        
        myArray[i] = nums[element];
    }
    
    return myArray;
}

}