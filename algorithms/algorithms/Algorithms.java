package algorithms;

import java.util.List;
import java.util.ArrayList;
public class Algorithms {


    // constructor
    public Algorithms() {
       
    };

    // {11,12,13,14} window size = 2;
    // {11,12} , {12,13}, {13,14}

    /**
     * 
     * function to demonstrate the sliding window algorithm takes an array and
     * prints a certain windowsize to the console
     * 
     * EX. {1,2,2,4} windowSize =2 {1,2} {2,2} {2,4}
     */
    public void slidingWindow(int[] array, int windowSize) {

        List<Integer> nums = new ArrayList<>();

        int windowStart = 0;

        for (int windowEnd = 0; windowEnd < array.length; windowEnd++) {

            nums.add(array[windowEnd]);

            if (windowEnd - windowStart + 1 == windowSize) {
                System.out.println(nums.toString());
                nums.remove(0);
                windowStart++;
            }

        }

    }

    public int findNumsAddToTarget(int[] array, int target) {

        List<Integer> nums = new ArrayList<>();
        if (array.length < 0)
            return 0;

        int windowStart = 0;
        int sum = 0;
        int count = 0;

        for (int windowEnd = 0; windowEnd < array.length; windowEnd++) {

            // int[] arr = {1, 2, 3, 4, -2, 2, 7, 8, 9};

            sum += array[windowEnd];
            nums.add(array[windowEnd]);

            if (sum > target) {
                sum -= array[windowStart];
                nums.remove(0);
                windowStart++;
            }

            if (sum == target) {
                System.out.println(nums.toString());

                count++;
            }

        }

        return count;
    }
//hello 
    public String reverseAStringUsingTwoPointers(String string){

        System.out.println("String: " + string);

        int start = 0;
        int end = string.length()-1;
        
        char[] cArray = string.toCharArray();


        while(start < end){
            char temp = cArray[start];
            cArray[start] = cArray[end];
            cArray[end] = temp;
            start++;
            end--;
        }

    


        return new String(cArray);
    }

}
