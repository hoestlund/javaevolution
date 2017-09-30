import java.math.BigInteger;

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
}
