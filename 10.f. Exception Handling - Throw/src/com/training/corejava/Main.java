package com.training.corejava;
/* Throw: It is mostly used for creating user defined exception.
          Which can catch inside try block
*/
public class Main {
    public static void vote(int age) {

        if (age > 18) {
            throw new ArithmeticException("You can Vote");
        } else {
            System.out.println("You cannot Vote");
        }
    }
    public static void main(String[] args) {
	try{
	    vote(40);
    } catch (Exception e) {
        e.printStackTrace();
    }
    }
}
