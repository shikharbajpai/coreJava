package com.training.corejava;
/*Finally Block: It identifies whether exceptional classes are properly defined or not.
It executes by default whether whether exception is there in the block or not.
*/

public class Main {

    public static void main(String[] args) {
	try{
	    int a[] = {1,3,4,5,6,7,80};
	    int c;
	    c = a[3]/a[8];

    } catch (Exception e) {
        e.printStackTrace();
        System.out.println("Exception is: "+ e);
    }finally {
	    System.out.println("Finally Block always executes");
    }
    }
}
