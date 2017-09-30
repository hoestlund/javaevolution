public class Big {
    private static int factorial(int x){
        int result = 1; //in order to not times by 0

        if(x==0){result =  0;}

        else{
            while(x>1){
                result = result * x;
                x--;
                factorial(x);
            }
        }

        return result;

    }

    //print table of x amount of integers starting from 0
    //answers will around 15 not be correct
    public static void printFactorialTbl(int x){

        for(int i = 0; i<=x; i++){
            System.out.println("Num: " + i + " Factorial: " + factorial(i));
        }

    }
}
