package com.training.corejava;

import java.util.Scanner;

// Returning class as a member to the function
class Square{
    int x,r;
    public Square sq(){
        Square ob = new Square();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        ob.x = sc.nextInt();
        ob.r = ob.x * ob.x;
        return  ob;
    }
}
public class Main {

    public static void main(String[] args) {
	Square ob1 = new Square();
	Square ob2;
	ob2 = ob1.sq();
	System.out.println("The Squared value is " + ob2.r);
    }
}
