package com.danshima;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] a = {8, 12, 3, 24, 71, 10, 1};
        System.out.println(BinarySearch.binarySearch(a, 7));

        System.out.println(SwapFunction.testSwap());

        int[] array = {18, 6, 66, 44, 9, 22, 14};
        System.out.println(SelectionSort.indexOfMinimum(array, 3));

        int[] array1 = {22, 11, 99, 88, 9, 7, 42};
        SelectionSort.selectionSort(array1);
        System.out.println("Array after sorting: " + Arrays.toString(array1));

        InsertionSort.insertionSort(array);
        System.out.println(Arrays.toString(array));

        System.out.println(Recursion.iterativeFactorial(5));
        System.out.println("The value of 4! is " + Recursion.recursiveFactorial(4));

        System.out.println(Palindrome.isPalindrome("rotor"));
        System.out.println(Palindrome.isPal("roto"));

        System.out.println(Recursion.recursivePower(3, 4));
        Recursion.solveTowerOfHanoi(3, "A", "B", "C");

        MergeSort.mergeSort(array1, 0, array1.length -1);
        System.out.println(Arrays.toString(array1));


    }


}
