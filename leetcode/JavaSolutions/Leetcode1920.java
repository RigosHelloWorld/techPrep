
package leetcode.javaSolutions;

public class Leetcode1920 {
  

  public static String problemStatement(){

    return "Given a zero-based permutation nums (0-indexed), " +
    " build an array ans of the same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length"  + 
    "and return it A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive)";
  }

  public static int[] buildArray(int[] nums) {
    int [] myArray = new int[nums.length];
    
    for(int i =0; i < nums.length; i++){
        int element = nums[i];
        
        myArray[i] = nums[element];
    }
    
    return myArray;
}

}