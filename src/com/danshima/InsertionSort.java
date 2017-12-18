package com.danshima;

/**
 * Insertion sort inserts the next element at the correct position.
 * the elements from array[0] to array[rightIndex] are sorted in ascending order
 *
 */

public class InsertionSort {
    public static void insert(int[] array, int rightIndex, int value){
        int i;
        for(i = rightIndex; i >= 0 && array[i] > value; i--){
            //stop when it finds an item that is <= value, or when it reaches the beginning of the array
            array[i + 1] = array[i];
        }
        array[i + 1] = value;
    }
}
