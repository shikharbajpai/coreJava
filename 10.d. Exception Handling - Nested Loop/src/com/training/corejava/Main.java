package com.training.corejava;

public class Main {

    public static void main(String[] args) {

        try{
            try{
                int a[] = {1,6,7,5,3,8,9,0};
                int c = a[5]/0;
                System.out.println("Result is: "+ c);

            } catch (ArrayIndexOutOfBoundsException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Exception is: " + e);
        }
    }
}
