package com.danshima;

/**
 * Insertion sort inserts the next element at the correct position.
 * the elements from array[0] to array[rightIndex] are sorted in ascending order
 *
 */

public class InsertionSort {
    //Fix the insert function to correctly insert the given value into the array.
    public static void insert(int[] array, int rightIndex, int value){
        int i;
        for(i = rightIndex; i >= 0 && array[i] > value; i--){
            //stop when it finds an item that is <= value, or when it reaches the beginning of the array
            array[i + 1] = array[i];
        }
        array[i + 1] = value;
    }

    /**
     * Insertion sort loops over items in the array, inserting each new item into the subarray before the new item.
     *  Write insertion sort, making use of the insert function above
     */
    public static void insertionSort(int[] array){
        for(int i = 1; i < array.length; i++){
            insert(array, i - 1, array[i]);
        }

    }


}
