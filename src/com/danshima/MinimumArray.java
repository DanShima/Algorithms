package com.danshima;

/**
 *return the index of the smallest value that occurs with index startIndex or greater.
 * if this smallest value occurs more than once in this range, then return the index of the leftmost occurence
 * within this range
 */
public class MinimumArray {

    public int indexOfMinimum(int[] array, int startIndex){
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

