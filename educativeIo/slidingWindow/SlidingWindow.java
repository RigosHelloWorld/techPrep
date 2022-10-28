package educativeIo.slidingWindow;

import java.util.HashMap;
import java.util.Map;

public final class SlidingWindow {
    
    private SlidingWindow(){};

    public static double[] average_of_k_elements_using_bruteForce(int[] arr, int K) {
        double[] averages = new double[arr.length-K +1]; 
        for(int i =0; i <= (arr.length - K); i++) {
            double sum = 0;
            for(int j =i; j < i+K; j++) {
                sum += arr[j];
            }
            averages[i] = (sum/K);
        }
        return averages;
    }

    public static double[] average_of_k_elements_using_SlidingWindow(int[] arr, int K ) {
        double[] averages = new double[arr.length-K +1];

        int windowStart = 0;
        double sum = 0;
        for(int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            sum += arr[windowEnd];
            if((windowEnd - windowStart + 1) == K) {
                averages[windowStart] = (sum/K);
                sum -= arr[windowStart];
                windowStart++;
            }
        } 
        return averages;
    }

    public static int max_sum_of_subArray_of_sizeK(int[] arr, int k) {

        if(k > arr.length)return 0;

        int max = Integer.MIN_VALUE;
        int currentSum = 0;
        int windowStart = 0;

        for(int windowEnd = 0; windowEnd < arr.length; windowEnd ++) {
            currentSum += arr[windowEnd];

            if((windowEnd - windowStart + 1 ) == k) {
                //System.out.print(currentSum + ",");
                max = Math.max(max, currentSum);
                currentSum -= arr[windowStart];
                windowStart++;
            }
        }
        return max;
    }

    /**
     * Problem Statement
     * Given an array of positive integers and a number ‘S,’ find the length of the smallest contiguous subarray 
     * whose sum is greater than or equal to ‘k’.
     * Return 0 if no such subarray exists
     * 
     * @param arr Integer array
     * @param k target in the array
     * @return size of the smallest subArray
     */
    public static int smallest_subArray_with_greatest_sum(int[] arr, int k) {
        int min = Integer.MAX_VALUE;
        int result = 0;
        int windowStart = 0;

        for(int windowEnd = 0; windowEnd < arr.length ; windowEnd++) {
            result += arr[windowEnd];

            while(result >= k ) {
                min = Math.min(min, windowEnd - windowStart + 1);
                result -= arr[windowStart];
                windowStart++;
            }
        }
        return min == Integer.MAX_VALUE? 0 : min;
    }

    public static int longest_subString_k_distinct_characters(String s, int k) {
        int max = Integer.MIN_VALUE;
        int windowStart = 0;
        Map<Character,Integer> map = new HashMap<>();
        
        for(int windowEnd = 0; windowEnd < s.length(); windowEnd++) {
            char rightChar = s.charAt(windowEnd);
            map.put(rightChar, map.getOrDefault(rightChar,0) + 1);

            while(map.size() > k) {
                char leftChar = s.charAt(windowStart);
                map.put(leftChar, map.get(leftChar) -1);
                if(map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }
                windowStart++;
            }
            max = Math.max(max, windowEnd - windowStart +1);
        }
        return max;
    }
}
