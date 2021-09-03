package com.training.corejava;
//Single Inheritance

import static java.lang.Math.sqrt;

class A{
    int x, y;
    static int z;

    //Parametrized Constructor
    A(int l, int b, int h){
        System.out.println("Volume is "+(l*b*h));
        x = l;
        y = b;
        z = h;
    }
    A(int u, int v){
        x = u;
        y = v;
    }

    public void display(){
        System.out.println("The value of z is: "+ z);
    }
}

class B extends A{

//Since there is no default constructor available in superClass A
        B(int p, int q, int r){
        super(p,q,r);
    }
    public void root(int a){
        super.x = a;
        System.out.println(sqrt(a));
    }
    public void area(int p, int r){
        x = p;
        y = r;
        System.out.println("Area is " + (x*y));
    }

}
public class Main {

    public static void main(String[] args) {
	A ob = new A(1,2,3);
	A ob1 = new A(4,5);
	B ob2 = new B(6,7,8);

	ob.display();
	ob1.display();
	ob2.x = 81;
	ob2.area(4,8);
	ob2.root(64);

    }
}
