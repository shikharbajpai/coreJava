package com.training.corejava;
//Abstract  Class

interface A{
    void first();
}

interface B extends A{
    void second();
}

class C implements B{
// Class C must be declared abstract or implements abstract method "second()" in B

    @Override
    public void first() {
        System.out.println("This is the first Function");
    }

    @Override
    public void second() {
System.out.println("This is the second Function");
    }
}

class D extends C implements A{
    public  void first(){
        System.out.println("This is the first interface in D class");
    }

}
public class Main {

    public static void main(String[] args) {
	A ob = new C();
	B ob1 = new C();
	D ob2 = new D();

	ob.first();
	ob1.second();
	ob2.first();
	ob2.second();
    }
}
