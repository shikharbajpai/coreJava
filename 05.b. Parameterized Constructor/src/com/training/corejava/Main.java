package com.training.corejava;

class Student{
    int id;
    String name;

    //Creating Parameterized Constructor
    Student(int i, String n){
        id = i;
        name = n;
    }

    public void display(){
        System.out.println("Name of Student: " + name);
        System.out.println("Id of Student: " + id);
    }
}
public class Main {

    public static void main(String[] args) {
        //Creating Objects and Passing Values
	Student st1 = new Student(123,"Shikhar");
	Student st2 = new Student(122, "Akash");

	//Calling method to display the value of object
        st1.display();
        st2.display();
    }
}
