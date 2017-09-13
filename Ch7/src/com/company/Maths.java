package com.company;

public class Maths {

    //A formula to iteratively work out the square root of a number is given by
    //the equation x1 = (x0 + a/x0)/2
    public static double sqrRoot(double a){
        double x = a/2;; //A suitable initial guess for x is half of a

        for(int i=0;i<6;i++){//After 6 loops accuracy is more than satisfactory
            x = ((x + a/x)/2);
        }

        return x;
    }
}
