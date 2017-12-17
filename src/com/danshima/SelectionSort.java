package com.danshima;

public class SelectionSort {
    /**
     * Selection sort loops over positions in the array.
     * For each position, it finds the index of the minimum value in the subarray starting at that position.
     * Then it swaps the values at the position and at the minimum index.
     * @param array
     */
    public static void selectionSort(int[] array){
        int minIndex;
        for(int i = 0; i < array.length; i++){
            minIndex = indexOfMinimum(array, i);
            SwapFunction.swap(array, i, minIndex);
        }

    }
    /**
     *return the index of the smallest value that occurs with index startIndex or greater.
     * if this smallest value occurs more than once in this range, then return the index of the leftmost occurence
     * within this range
     */
    public static int indexOfMinimum(int[] array, int startIndex){
        // Set initial values for minValue and minIndex,
        // based on the leftmost entry in the subarray:
        int minValue = array[startIndex];
        int minIndex = startIndex;
        //loop over items starting with startIndex
        //update minValue and minIndex as needed
        for(int i = minIndex + 1; i < array.length; i++){
            if(array[i]< array[minIndex]){
                minIndex = i;
                minValue = array[i]; }
            }
        return minIndex;
        }

}

