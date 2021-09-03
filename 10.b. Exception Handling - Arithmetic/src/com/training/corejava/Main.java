package com.training.corejava;

public class Main {

    public static void main(String[] args) {
        try{
            int a = args.length;
            System.out.println(a);
            int b = 49/a;
            int c[] = {1};
            c[42] = 99;
            System.out.println(c[42]);

        } catch (ArithmeticException e) {
            e.printStackTrace();

        }catch (Exception e){
            System.out.println("Exception is: " + e);
        }
        System.out.println("After catch block");
    }

    }
