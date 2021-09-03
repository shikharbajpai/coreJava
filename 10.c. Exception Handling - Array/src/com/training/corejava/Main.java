package com.training.corejava;

public class Main {

    public static void main(String[] args) {
	try{
	    int a[] = {1,2,3,4,5,6,7,8,9,0};
	    int c = a[0]/a[11];
	    System.out.println(c);

    } catch (ArrayIndexOutOfBoundsException e) {
        e.printStackTrace();
    }
    }
}
