package com.danshima;

public class Recursion {
    public static int iterativeFactorial(int n){
        int result = 1;
        for(int i = 1; i <= n; i++){
            result *= i;
        }
        return result;
    }

    /**
     * A recursive solution would involve the function calling itself
     *  write a recursive function that returns the value of n!.
     *  if n is zero, then factorial should just return the value 1.
     */
    public static int recursiveFactorial(int n){
        //base case:
        if(n == 0){
            return 1;
        }
        //recursive case:
        return n * recursiveFactorial(n -1);
    }
}
