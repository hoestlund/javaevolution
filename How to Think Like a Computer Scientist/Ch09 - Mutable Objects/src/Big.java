import java.math.BigInteger;

//The first exercises are not programming challenges. Here are the solutions to the exercises given
//The expansion exercises from Appendix A is given in the class GraphicsExperiment
//end p121 (139)

public class Big {
    private static BigInteger factorial(int x){
        BigInteger result = BigInteger.valueOf(1);

        if(x==0){result =  BigInteger.valueOf(0);}

        else{
            while(x>1){
                result = result.multiply(BigInteger.valueOf(x));
                x--;
                factorial(x);
            }
        }

        return (result);

    }

    //print table of x amount of integers starting from 0
    //answers will around 15 not be correct
    public static void printFactorialTbl(int x){

        for(int i = 0; i<=x; i++){
            System.out.println("Num: " + i + " Factorial: " + factorial(i));
        }

    }

    public static BigInteger pow(int x, int n) {
        if (n == 0) return BigInteger.valueOf(1);
        // find x to the n/2 recursively
        BigInteger t = pow(x, n/2);
        // if n is even, the result is t squared
        // if n is odd, the result is t squared times x
        if (n%2 == 0) {
            return t.multiply(t); //value of long in BigInteger could not be applied
        } else {
            return t.multiply(t).multiply(BigInteger.valueOf(x));
        }
    }

    //The final exercise recommends reading Appendix A and do the exercises.
}
