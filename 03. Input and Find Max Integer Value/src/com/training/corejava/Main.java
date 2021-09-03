package com.training.corejava;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

	Scanner sc = new Scanner(System.in);
	int a[] = new int[10];
	System.out.println("Enter 10 Integers");
	for(int i = 0; i < 10; i++){
	    a[i] = sc.nextInt();
    }
	int max = a[0];
	for(int j = 0; j < 10; j++){
	    if(a[j] > max){
	        max = a[j];
        }
    }
	System.out.println("The Maximum Element is "+ max);
    }
}
