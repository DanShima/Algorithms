package com.danshima;

public class ReverseArray {
    //runs O(n) time
    void reverse(int[] array){
        for(int i = 0; i < array.length/2; i++){
            int other = array.length - i - 1;
            int temp = array[i];
            array[i] = array[other];
            array[other] = temp;
        }
    }
}
