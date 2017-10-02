public class Rational {
    int numerator, denominator;

    public Rational(){
        this.numerator = 0;
        this.denominator = 1;
    }

    public Rational(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void printRational (Rational obj){
        if(obj.denominator == 1){
            System.out.println(obj.numerator);
        }

        else if(obj.numerator%obj.denominator == 0){ // Better dimplifications are found in the reduce method
            System.out.println(numerator/denominator);
        }

        else{System.out.println(obj.numerator + "/" + obj.denominator);}
    }

    //This should change the sign of the Rational object
    //Standard is to have the numerator as negative when the overall fraction is negative
    //When not using this tandard there need s to be more checks in the Rational methods
    public void negate (Rational obj){

        if(obj.numerator == 0){} //Keep blank as there is othing to be done

        else { //this works for positive and negative numerators
            obj.numerator = obj.numerator * -1;
        }
    }

    //Not working, it resolves both times the numerator, don't un...was fine. Something wrong with print method
    public void invert(Rational obj){

        int dValue = obj.numerator;
        int nValue = obj.denominator;

        obj.numerator = nValue;
        obj.denominator = dValue;
    }

    //Need to return the values of the double but asked in the exercise not to modify the values
    //Unusure how you can return two values, will return the value of the division
    public double toDouble(Rational obj){
        double numerator = (double)(obj.numerator);
        double denominator = (double)(obj.denominator);

        return numerator/denominator;
    }


    //Should not change the instance variables
    //Will take a Rational object and print the most simplified version by finding the greatest common denominator
    //It uses Euclids alogortihm which I made a function for in chapter 6
    public void reduce(Rational obj){

        int gcd = gcd(obj.numerator, obj.denominator);
        int redNum = obj.numerator/gcd; //Rednum Rednum Rednum!!!!
        int redDen = obj.denominator/gcd;

        System.out.println("Reduced version: " + redNum + "/" + redDen);

        }

    public static int gcd(int a, int b) {

        int r = a % b;
        while (r != 0) {
            b = r;
            r = b % r;
        }
        return b;
    }

}
