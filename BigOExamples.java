import java.util.*;

class BigOExamples {


    //private constructor so class can't be instatiated 
    private BigOExamples() {
    };

    public static int count_the_ones(List<int[]> list) {

        int num_ones = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int num : list.get(i)) {
                if (num == 1)
                    num_ones++;
            }
        }

        return num_ones;
    }

    public static List<String> mark_inventory(final String[] clothing_items) {

        int num_sizes = 5;

        List<String> clothing_options = new ArrayList<>();

        /**
         * BigO Notation:
         * 
         * In this example we have two loops the first loop iterates through the array
         * (N) times with N being the size of our clothing_items
         * 
         * The secound loop iterates whatever value num_sizes is.
         * 
         * IN OUR choosen example num_sizes =5
         * 
         * This never changes and means the inner loop iterates 5 times for every N
         * Strings
         * 
         * so this means
         * 
         * O(5N) = O(N)
         * 
         * 
         */

        for (int i = 0; i < clothing_items.length; i++) {

            for (int j = 0; j < num_sizes; j++) {
                clothing_options.add(clothing_items[i] + " Size " + (j + 1));
            }
        }

        return clothing_options;

    }

    public static double average_celsius(int[] fahrenheit_readings) {

        double[] celsius_readings = new double[fahrenheit_readings.length];

        int index = 0;

        /**
         * BigO Notation: In this example we have two loops: The first loop iterates
         * through (N) elements in our fahrenheit array it then converts each element
         * into celsius and stores it in our celsius_readings array
         * 
         * The celsius array will always be as big as our fahrenheit array (N)
         * 
         * In the secound loop we are iterating over the celsius array and adding each
         * element
         * 
         * ALTHOUGH we have two loops the secound loop is located OUTSIDE of the first
         * one
         * 
         * This means we have N+N = 2N = O(2N) = O(N)
         * 
         * 
         */
        for (int num : fahrenheit_readings) {
            celsius_readings[index] = (num - 32) / 1.8;
            index++;
        }

        double sum = 0;
        for (double num : celsius_readings) {
            sum += num;
        }

        return sum / celsius_readings.length;
    }

    public static List<String> wordBuilder(String characters[]) {

        List<String> list = new ArrayList<>();

        /**
         * BigO Notation: We determined that N data elements is the string of characters
         * that we passed into the function The first loop iterates through the array N
         * times (N) being the size of the array The inner loop iterates again through N
         * elements
         * 
         * Worse Case: O(n^2)
         */
        for (int i = 0; i < characters.length; i++) {
            for (int j = 0; j < characters.length; j++) {
                if (j != i) {
                    list.add(characters[i] + characters[j]);
                }
            }
        }

        return list;
    }

    public static double average_of_evan_num(int nums[]) {

        int sum = 0;
        int count_of_evan_nums = 0;

        /**
         * BigO notation: we loop through n elements with n being the size of the array
         * if the number is evan then we perform 2 additional steps for a total of 3
         * steps 3N outside the loop we have initiaze two variables and perform an
         * opertation
         * 
         * WORSE CASE: O(3N+3)-->> since BigO notation ignores constants WORSE CASE:
         * O(N)
         */
        for (int num : nums) {
            if (num % 2 == 0) {
                sum = sum + num;
                count_of_evan_nums++;
            }
        }

        return sum / count_of_evan_nums;
    }

}