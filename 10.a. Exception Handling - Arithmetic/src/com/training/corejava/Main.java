package com.training.corejava;
//Exception Handling
//1.Default Exception: Exception
//2. Arithmetical Exception: ArithmeticException
//3. ArrayIndexOutofBoundException
//4. Null value to class: NullPointerException
//5. InterruptedException

public class Main {

    public static void main(String[] args) {
	try{
	    int a = 5;
	    int c = a/0;
                System.out.println("Result is: "+ c);

    } catch (Exception e) {
        e.printStackTrace();
    }
    }
}
