package com.danshima;

public class SequentialSearch {
    public boolean sequentialSearch(int[]array, int guess){
        for(int i : array){
            if(i == guess){
                return true;
            }
        }
        return false;
    }


}
