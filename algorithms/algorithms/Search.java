package algorithms;

public class Search {

    // constructor
    public Search() {
    }

    public boolean linearSearch(int[] array, int target) {

        // time complexity = O(n)
        for (int n : array) {
            if (n == target)
                return true;
        }
        return false;
    }

    /**
     * BINARY SEARCH ALGORITHM: only works if the array is SORTED;
     * 
     * Search the array by splitting it in half
     * 
     * half = start + ((end - start ) / 2)
     * 
     */

    public boolean recursiveBinarySearch(int[] array, int target) {
        if (array.length == 0)
            return false;
        return binarySearch(array, 0, array.length - 1, target);
    }

    private boolean binarySearch(int[] array, int start, int end, int target) {

        if (start > end)
            return false;
        int middle = start + ((end - start) / 2);

        if (array[middle] == target)
            return true;
        // middle = 5 target = 9
        else if (array[middle] < target) {
            return binarySearch(array, middle + 1, end, target);
        } else
            return binarySearch(array, start, middle - 1, target);

    }

    public boolean binarySearchLinearly(int[] array, int target) {
        // check to see there is atleast one element in the array
        if (array.length == 0)
            return false;

        // starting point in the array index 0
        int start = 0;
        // last index in array (index -1)
        int end = array.length - 1;

        while (start <= end) { // while we havent reached the end
            // first get the middle index
            int middle = start + ((end - start) / 2);
            // check if the target is at the middle index
            if (array[middle] == target)
                return true;

            // array = { 1,2,3,4,5,6} target = 6

            if (array[middle] < target) {
                start = middle + 1;
            } else
                end = middle - 1;
        }
        return false;
    }


}
