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

    /**
     * computes the Nth Fibonacci number. it takes O(2 to the power of n)     *
     * @param n
     * @return
     */
    int fib(int n){
        if(n <= 0) return 0;
        else if(n ==1) return 1;
        return fib(n -1) + fib(n - 2);
    }

    //print all Fibonacci numbers from 0 to n.
    void allFib(int n){
        for(int i = 0; i < n; i++){
            System.out.println(i + ": " + fib(i));
        }
    }

    /**
     *  print the powers of 2 from 1 through n (inclusive)
     *divide n by 2 untill we get down to the base case (1). the runtime is O(log n).
     */
    int powersOf2(int n){
        if(n < 1) {
            return 0;
        }else if(n == 1){
            System.out.println(1);
            return 1;
        } else {
            int previous = powersOf2(n / 2);
            int current = previous * 2;
            System.out.println(current);
            return current;
        }

    }

    //determine if a ASCII string has all unique characters.
    boolean isUniqueChars(String string){
        if(string.length() > 128) return false;
        boolean[] char_set = new boolean[128];
        for(int i = 0; i < string.length(); i++){
            int value = string.charAt(i);
            if(char_set[value]){ //already found this char in string
                return false;
            }
            char_set[value] = true;
        }
        return true;
    }

    //check if two strings have identical character counts
    boolean permutation(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        int[] letters = new int[128];
        char[] s_array = s.toCharArray();
        for(char c : s_array){
            //count number of each char in s
            letters[c]++;
        }
        for(int i = 0; i < t.length(); i++){
            int c = t.charAt(i);
            letters[c]--;
            if(letters[c] < 0){
                return false;
            }
        }
        return true;
    }




}
