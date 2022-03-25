package algorithms;

import java.util.Arrays;

public class Sorting {

    private final boolean DEBUGG = false;

    // constructor
    public Sorting() {
    };

    public void bubbleSort(int[] array) {
        // assume the array IS NOT sorted
        boolean isSorted = false;

        while (!isSorted) {
            if (DEBUGG)
                System.out.println("Before Sorting: " + Arrays.toString(array));

            isSorted = true;

            
            int lastUnsorted = array.length - 1;

            for (int i = 0; i < lastUnsorted; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                    isSorted = false;
                }

            }

            
            lastUnsorted--;
            if (DEBUGG) {
                System.out.println("After Sorting: " + Arrays.toString(array));
                System.out.println();
                System.out.println();
            }

        }

    }

    private void swap(int[] array, int i, int j) {
        // array[i] = 6 , array[j] = 5;

        if (DEBUGG) {System.out.println("Before Swaping: " + Arrays.toString(array));}
        
        int temp = array[i]; // 6
        array[i] = array[j]; // array[i] = 5
        array[j] = temp; // j = 6

        if (DEBUGG){ System.out.println("After Swapping: " + Arrays.toString(array));}

    }
}
