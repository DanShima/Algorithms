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
    public static boolean binarySearch(int[] array, int guess){
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

    public static int binarySearchRecursive(int[]a, int guess, int low, int high){
        if(low > high) return -1; //error
        int middle = (low + high)/2;
        if(a[middle] < guess) {
            return binarySearchRecursive(a, guess, middle + 1, high);
        } else if(a[middle] > guess){
            return binarySearchRecursive(a, guess, low, middle - 1);
        } else {
            return middle;
        }
    }

    public static void main(String[] args) {
        int[] a = {8, 12, 3, 24, 71, 10, 1};
        System.out.println(BinarySearch.binarySearch(a, 24));
        System.out.println(binarySearchRecursive(a, 24, 1, a.length - 1));
    }

}
