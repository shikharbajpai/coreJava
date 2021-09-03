package com.training.corejava;
//Use of InstanceOf() keyword

class A{
    A(){
      System.out.println("Base Class or Super Class");
    }
}

class B extends A{
    B(){
        System.out.println("Subclass");
    }
}
public class Main {

    public static void main(String[] args) {
	A ob = new A();
	B ob1 = new B();
	A ob2 = new B();

	System.out.println("Object ob is instance of class A: "+ (ob instanceof A));
	System.out.println("Object ob1 is instance of subclass B: "+ (ob1 instanceof B));
	System.out.println("Object ob2 is instance of subclass B: "+(ob2 instanceof B));
    }
}
