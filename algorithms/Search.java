import javax.sound.midi.MidiEvent;

public class Search {

    public Search() {
    }

    public boolean linearSearchNums(int[] array, int target) {

        // time complexity = O(n)
        boolean isFound = false;
        for (int n : array) {
            if (n == target)
                return true;
        }
        return isFound;
    }

    /**
     * BINARY SEARCH ALGORITHM: only works if the array is SORTED;
     * 
     * Search the array by splitting it in half
     * 
     * half = start + ((end - start ) / 2)
     * 
     */
    public boolean binarySearchNum(int[] array, int target) {
        boolean isFound = false;
        if (target == array[array.length / 2])
            return true;

        int indexRight = (array.length / 2) + 1;
        int indexLeft = (array.length / 2) - 1;

        while (!isFound || indexRight < array.length || indexLeft > 0) {
            if (binarySearchRight(array, target, indexRight)) {
                return true;
            }
            if (binarySearchLeft(array, target, indexLeft)) {
                return true;
            }
            indexRight = (array.length - indexRight) / 2 + 1;
            indexLeft = (array.length - indexLeft) / 2 - 1;

        }

        return isFound;
    }

    private boolean binarySearchRight(int[] array, int target, int index) {
        return (array[index] == target);
    }

    private boolean binarySearchLeft(int[] array, int target, int index) {

        return (array[index] == target);
    }

    public boolean recursiveBinarySearch(int[] array, int target) {
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
            return binarySearch(array, start, middle -1 , target);

    }

}
