package com.training.corejava;

import static java.lang.Math.sqrt;
// Single Inheritance
class A{
	int x , y;
}

class B extends  A{
	public void root(int a){
		super.x = a;
		System.out.println(sqrt(a));
	}
	public void area(int p, int r){
		x = p;
		y = r;
		System.out.println("Area is "+(x*y));
	}
public class Main {

}
    public static void main(String[] args) {
	A ob = new A();
	B ob1 = new B();
	ob.x = 11;
	ob.y = 33;
	ob1.area(5,6);
        ob1.root(36);

    }
}
