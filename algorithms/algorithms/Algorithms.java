package algorithms;

import java.util.List;
import java.util.ArrayList;

public class Algorithms {

    private List<List<Integer>> list;

    // constructor
    public Algorithms() {
        list = new ArrayList<>();
    };

    // {11,12,13,14} window size = 2;
    // {11,12} , {12,13}, {13,14}

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

           //{1 , 2 , 3, 4, }

           sum+= array[windowEnd];
           nums.add(array[windowEnd]);
           System.out.println(nums.toString());

           if(sum > target){
               sum -= array[windowStart];
               nums.remove(0);
               windowStart++;
           }

           if(sum == target){
           }

        }

        return count;
    }

}
