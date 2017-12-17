package com.danshima;

/*
Let min = 0 and max = n-1.
Compute guess as the average of max and min, rounded down (so that it is an integer).
If array[middle] equals target, then stop. Return guess.
If the guess was too low ( array[middle] < target ), then set min = guess + 1.
Otherwise, the guess was too high. Set max = middle - 1.
Go back to step 2.
 */

public class BinarySearch {
    public boolean binarySearch(int[] array, int guess){
        if(array.length == 0){
            return false;
        }
        int min = 0;
        int max = array.length - 1;
        int middle;
        while(min <= max){
            middle = (max + min)/2;
            if(guess > array[middle]){
                min = middle + 1;
            }else if(guess < array[middle]) {
                max = middle - 1;
            } else {
                return true;
            }
        }
        return false;
    }

}
