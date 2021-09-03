package com.training.corejava;
//Constructor
 class demo{
     int x, y;
      // Calling Constructor
     demo(int x , int y){
         System.out.println("This is a parameterized Constructor " + (x + y));
         this.x = x;
         this.y = y;
         System.out.println(this.x);
         System.out.println(this.y);
     }

   demo(float x , int y){
        System.out.println("This is a parameterized Constructor " + (x + y));
    }

     demo(){
         System.out.println("This is a default Constructor");
     }
}
public class Main {

    public static void main(String[] args) {

        demo ob = new demo(2,54);
        demo ob1 = new demo(23.4f, 8);
        demo ob2 = new demo();
        System.out.println(ob.x);
        System.out.println(ob.y);



    }
}
