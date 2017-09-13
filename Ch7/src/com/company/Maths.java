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



    //Multiple table - complete the generalized table on p85; printMultiples, Pr

    public static void printMultTable(int i){
        for(int line = 1; line<=i;line++){//want to send j with value 1 for first loop
            printMultiples(i,line);
        }

    }

    //think about how the amount of multiples printed mathches up to the line position
    //maybe think if the initilization are correct and if so many parameters are needed

    private static void printMultiples(int i, int line){ //declared as private as it should only be used within the class
        System.out.println(line*i + "\t"); //was thinking about having this here as the table always has minimum of one collumn

        while(line<i){ //need a loop - for? which prints every extra multiple up to the line number
            line++;
            System.outprint(multipleValue + "\t");
        }
    }
}
