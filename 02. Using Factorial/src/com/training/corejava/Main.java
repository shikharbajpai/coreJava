package com.training.corejava;

class Factorial{
    //Initializing variables
    int x;
    int result;
    //Initializing method with no return value but contains a parameter
    public void input(int a){
        x = a;
    }
    //Initializing method with return but no parameter
    public int process(){
        int fact = 1;
        for(int i=x; i>=1; i--){
            fact = fact * i;
        }
        result = fact;
        return  fact;

    }
    //Initializing method with no return and no parameter
    public void output(){
        System.out.println("Factorial of the number is: " + result);
    }

        }
public class Main {

    public static void main(String[] args) {

 //Initializing object of class Factorial
        Factorial ob = new Factorial();
        ob.input(5);
        ob.process();
        ob.output();
    }
}
