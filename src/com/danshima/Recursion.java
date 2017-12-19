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
    /**
     * Write a recursive function power(x, n) that returns the value of x^n.
     *(assume that n is an integer)
     */
    public static int recursivePower(int base, int powerRaised){
        System.out.println("Computing " + base + " raised to power " + powerRaised + ".");
        if(powerRaised != 0)
            return (base * recursivePower(base, powerRaised - 1));
        else
            return 1;
    }

    /**
     * a recursive function that will solve Hanoi for any positive number of disks.
     * @param n the number of discs in the puzzle
     * @param start the name of the starting pole
     * @param middle the middle pole
     * @param end the third, last pole
     */
    public static void solveTowerOfHanoi(int n, String start, String middle, String end) {
        //base case
        if(n == 0){
            System.out.println("No disks to move");
        }
        // base case, when n = 1, move the disc from start to end pole
        if (n == 1) {
            System.out.println(start + " -> " + end);
        } else {
            //recursive case with 3 steps
            //step 1: move (n-1) discs from start pole to the middle pole
            //step 2: move the last disc from start pole to end pole
            //step 3: move the (n-1) discs from middle pole to end pole
            solveTowerOfHanoi(n - 1, start, end, middle);
            System.out.println(start + " -> " + end);
            solveTowerOfHanoi(n - 1, middle, start, end);
        }

    }


}
