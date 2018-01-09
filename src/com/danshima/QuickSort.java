package com.danshima;

/**
 * In quick sort, we pick a random element and partition the array,
 * such that all numbers that are less than the partitioning element
 * come before all elements that are greater than it.
 */

public class QuickSort {

    /* low  --> Starting index,  high  --> Ending index */
    public static void quickSort(int[] array, int low, int high)
    {
        if (low < high)
        {
        /* pi is partitioning index, arr[p] is now
           at right place */
            int pi = partition(array, low, high);
            //recursively sort elements before and after partition
            quickSort(array, low, pi - 1);  // Before pi
            quickSort(array, pi + 1, high); // After pi
        }
    }

    public static int partition(int[] arr, int low, int high)
    {
        int pivot = arr[high];
       int i = (low-1); // index of smaller element
        for (int current =low; current <high; current++)
        {
            if (arr[current] <= pivot)
            {

                i++;

                // swap arr[i] and arr[current]

               int temp = arr[i];
               arr[i] = arr[current];
               arr[current] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)

       int temp = arr[i+1];
       arr[i+1] = arr[high];
       arr[high] = temp;

        return i+1;
    }

   /* public static void swap(int[] array, int firstIndex, int secondIndex){
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }*/

}
