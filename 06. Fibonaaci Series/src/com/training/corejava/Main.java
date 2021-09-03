package com.training.corejava;

public class Main {

    static int fib(int n){
        if(n <= 1){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {

        System.out.println("The last digit of fibonacci Series of 10 is "+ fib(10));
    }
}
