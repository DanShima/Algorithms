package com.danshima;

public class SwapFunction {
    public void swap(int[] array, int firstIndex, int secondIndex){
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
        System.out.println(array);
    }

    public int testSwap(){
        int[] testArray = {1, 2, 4};
        swap(testArray, 0, 1);
        return testArray[0];
    }
}
