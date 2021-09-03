package com.training.corejava;

import java.util.Scanner;
//Declaring Class as a Member to the Function
class Square{
    int x;
    public void square(int a){
        Square ob = new Square();
        ob.x = a;
        System.out.println("Squared value is "+ ob.x* ob.x);
    }
}
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        int a = sc.nextInt();
        Square obj = new Square();
        obj.square(a);
    }
}
