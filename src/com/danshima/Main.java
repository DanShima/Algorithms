package com.danshima;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
    BinarySearch binarySearch = new BinarySearch();
    int[] a = {8, 12, 3, 24, 71, 10, 1};
    System.out.println(binarySearch.binarySearch(a, 7));
    SwapFunction swapFunction = new SwapFunction();
    System.out.println(swapFunction.testSwap());
    SelectionSort minimumArray = new SelectionSort();
    int[] array = {18, 6, 66, 44, 9, 22, 14};
    System.out.println(minimumArray.indexOfMinimum(array, 3));
    int[] array1 = {22, 11, 99, 88, 9, 7, 42};
    minimumArray.selectionSort(array1);
    System.out.println("Array after sorting: " + Arrays.toString(array1));

    }


}
