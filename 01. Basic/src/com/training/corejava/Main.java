package com.training.corejava;

// The most important Java has is called its .java file
// To run any java application you need JVM(Java Virtual Machine)
// When we compile this .java file using compiler we get .class file
// This .class file is also called as ByteCode
// This ByteCode goes to JVM to get the Output

public class Main {

    // Code runs on JVM (Java Virtual Machine)
    // JVM accepts java application
    // // JVM asks you for the function or method

    // Default method is called "main" method
    //Execution of a code on JVM it needs a "main" method
    // Methods are there to work and it will give some output
    // main method want some parameters it will ask for "String array"
    // Since all methods return something therefore this main method will return a null value
    // So we write void
    // In Object- Oriented Programming methods are of two types: 1. Static 2. Non-Static
    // Static belongs to class
    //Non-Static belongs to object
    // This main method is accessible from everywhere so specify "public"

    // Java says everything should be in class
    // Its a convention that your file name should be same as class name that is "Main"

    public static void main(String[] args) {

        // Hello is a string since it is not "keyword" put it under double quotes
        // print is a "method"
        // This method belong to some "object" since you cannot find methods in global space
        // Methods are found in particular objects
        // We will find print method inside "out" object
        // out object is a in-build or pre-build object
        // It is saved inside a class called "System"

        //Conclusion
        // System is a class in which you have object called as out
        // In this out object you have method called print

        float num1 = 6.4f;
        float num2 = 5.4f;

        double num3 = 7.8;
        double num4 = 1.3;

        float add = num1 + num2;
        double addDouble = num3 + num4;
        char c = 'A';

        System.out.println("The addition of " + num1 + " and " + num2 + " is: " + add);
        System.out.println("The addition of " + num3 + " and " + num4 + " is: " + addDouble);
        System.out.println("The Character is: "+ c);
        System.out.println("The ASCII code for Character A is: "+ (int)c);
        System.out.println("The Character according to integer 67 is: "+(char)67);
    }
}
