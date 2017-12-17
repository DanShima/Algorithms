package com.danshima;

public class Main {

    public static void main(String[] args) {
    BinarySearch binarySearch = new BinarySearch();
    int[] a = {8, 12, 3, 24, 71, 10, 1};
    System.out.println(binarySearch.binarySearch(a, 7));
    SwapFunction swapFunction = new SwapFunction();
    System.out.println(swapFunction.testSwap());
    MinimumArray minimumArray = new MinimumArray();
    int[] array = {18, 6, 66, 44, 9, 22, 14};
    System.out.println(minimumArray.indexOfMinimum(array, 3));

    }


}
