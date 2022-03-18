package algorithms;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


public class Algorithms {

    private List<List<Integer>> list;
    //constructor
    public Algorithms(){
        list = new ArrayList<>();
    };



    // {11,12,13,14}        window size = 2;
    // {11,12} , {12,13}, {13,14}

    public void slidingWindow(int[] array, int windowSize){

        List<Integer> nums = new ArrayList<>();
     
         int windowStart =0;

         for(int windowEnd =0; windowEnd< array.length; windowEnd++ ){

            nums.add(array[windowEnd]);

            if(windowEnd - windowStart +1== windowSize){
                System.out.println(nums.toString());
                nums.remove(0);
                windowStart++;
            }
         
         }
        
    }





    // divide and conquer
    public static void maxCrossArray(int[] array, int startPos) {
        int maxRight = array[startPos];
        int maxLeft = array[startPos - 1];

        int[] pos = new int[2];

        // get the right sum
        int currentNum = array[startPos];
        for (int i = startPos + 1; i < array.length; i++) {
            if (array[i] + maxRight > maxRight) {
                maxRight = array[i] + maxRight;
                pos[1] = i;
            } else
                break;
        }

        for (int i = startPos - 2; i > 0; i--) {
            if (array[i] + maxLeft > maxLeft) {
                maxLeft = array[i] + maxLeft;
                pos[0] = i;
            } else
                break;
        }

        System.out.println(pos[0]);
        System.out.println(pos[1]);

    }

    private static int findSumMaxSubarrayOfSizeK(int[] a, int k) {
        if (k == 0 || a.length == 0) {
            return 0;
        }

        int maxSum = Integer.MIN_VALUE;
        int windowStart = 0;
        int windowSum = 0;

        for (int windowEnd = 0; windowEnd < a.length; windowEnd++) {
            windowSum += a[windowEnd]; // Add the next element to the window

            if (windowEnd - windowStart + 1 == k) { // When we hit the window size. Update maximum sum, and slide the
                                                    // window
                maxSum = Math.max(maxSum, windowSum);
                windowSum -= a[windowStart]; // Subtract the element going out of the window
                windowStart++; // Slide the window
            }
        }

        return maxSum;
    }

}
