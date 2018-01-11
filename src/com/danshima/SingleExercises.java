package com.danshima;

import static java.lang.Math.sqrt;

public class SingleExercises {
    /**this runs in O(sqrt n) time.
     * Check if a number is a prime number
     * @param n
     * @return
     */
    boolean isPrime(int n){
        //the loop starts when x = 2 and end when x * x = n. it stops when x = the square root of n
        for(int x = 2; x <= sqrt(n); x++){
            if(n % x == 0){
                return false;
            }
        }
        return true;
    }

    /**recursion from n to n-1 to n-2 down to 1. it takes O(n) time
     *
     * @param n
     * @return
     */
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

    /**determine if a ASCII string has all unique characters.     *
     * @param string
     * @return
     */
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

    /**check if two strings have identical character counts
    iterate through the code and count how many times each character appears, and then compare the two arrays
    **/
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

    /**replace all spaces in a string with '%20'
    *edit the string starting from the end. we use two scans. first scan counts the number of spaces.
    *the second scan, done in reverse order, edits the string. the space is replaced with %20
     **/
    void replaceSpaces(char[] str, int trueLength){
        int spaceCount = 0, index, i = 0;
        for(i = 0; i < trueLength; i++){
            if(str[i] == ' '){
                spaceCount++;
            }
        }
        index = trueLength + spaceCount * 2;
        if(trueLength < str.length) str[trueLength] = '\0'; //end array
        for(i = trueLength - 1; i >= 0; i--){
            if(str[i] == ' '){
                str[index - 1] = '0';
                str[index - 2] = '2';
                str[index - 3] = '%';
                index = index - 3;
            }else{
                str[index - 1] = str[i];
                index--;
            }
        }
    }

    /**
     * Find the kth to to last element of a linked list
     * this method recurses through the linked list. when it hits the end, the method passes back a counter set to 0.
     * each parent call adds 1 to the counter, so when it equals k, it reaches the kth to last element
     */
    int printKthToLast(Node head, int k){
        if(head == null){
            return 0;
        }
        int index = printKthToLast(head.next, k) + 1;
        if(index == k){
            System.out.println(k + "th to last node is " + head.data);
        }
        return index;
    }



}
