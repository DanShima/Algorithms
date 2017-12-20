package com.danshima;

/**
 * During the Mergesort process the objects of the collection are divided into two collections. To split a collection,
 * Mergesort will take the middle of the collection and split the collection into its left and its right part.
 */

public class MergeSort {
    /**
     * Recursively sort the subarray array[low...high]
     * @param array the array to be sorted
     * @param low the smallest element index low
     * @param high the largest element index high
     */
   public static void mergeSort(int[] array, int low, int high){
       // check if low is smaller than high, if not then the array is sorted
        if(low < high){
            // Get the index of the element which is in the middle
            int middle = (low + high) / 2;
            // Sort the left side of the array
            mergeSort(array, low, middle);
            // Sort the right side of the array
            mergeSort(array, middle+1, high);
            //then combine the two arrays
            merge(array, low, middle, high);
        }
    }

    /**
     * merge sorted sub arrays array[low-middle] and array[middle + 1 ..high]
     * @param array
     * @param low
     * @param middle
     * @param high
     */
    public static void merge(int[] array, int low, int middle, int high){
        int[] helper = new int[array.length];
        //copy both parts into the helper array
        for (int i = low; i <= high; i++) {
            helper[i] = array[i];
        }

        int helperLeft = low;
        int helperRight = middle+1;
        int current = low;
        // Copy the smallest values from either the left or the right side back
        // to the original array
        while (helperLeft <= middle && helperRight <=high) {
            if(helper[helperLeft] <= helper[helperRight]){
                array[current] = helper[helperLeft];
                helperLeft++;

            }else{
                array[current] = helper[helperRight];
                helperRight++;
            }
            current ++;
        }

        //copy the rest of the left side of the array into the target array
        int remaining = middle - helperLeft;
        for (int i = 0; i <= remaining; i++) {
            array[current+i] = helper[helperLeft+ i];
        }
    }
}
