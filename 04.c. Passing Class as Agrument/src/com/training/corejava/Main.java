package com.training.corejava;

// Class as an argument
 class SquaringValues{
     int x,r;
     public SquaringValues square(SquaringValues sq){
sq.r = sq.x * sq.x;
return sq;
     }
}
public class Main {

    public static void main(String[] args) {
        //Creating Object of Class SquaringValues
        SquaringValues sv = new SquaringValues();
        SquaringValues sqv = new SquaringValues();
        SquaringValues result;

        sv.x = 16;
        result = sqv.square(sv);
        System.out.println(result.r);

    }
}
