package com.danshima;

import static java.lang.Math.sqrt;

public class SingleExercises {
    //this runs in O(sqrt n) time.
    boolean isPrime(int n){
        //the loop starts when x = 2 and end when x * x = n. it stops when x = the square root of n
        for(int x = 2; x <= sqrt(n); x++){
            if(n % x == 0){
                return false;
            }
        }
        return true;
    }

    //recursion from n to n-1 to n-2 down to 1. it takes O(n) time
    int factorial(int n){
        if(n < 0){
            return -1;
        } else if(n == 0){
            return 1;
        } else{
            return n * factorial(n -1);
        }
    }
}
