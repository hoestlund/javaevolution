public class Exercises {
    //This chapter mainly looks at classes that are used to help manipulate strings
    //indexOf is the inverse of charAt

      public static void reverse(String s){
          String backString = new StringBuffer(s).reverse().toString();
          System.out.println(backString);
      }

    //Example from textbook but generalized to accept string and char arguments
    //Challenge is to use index instead and also accepting char as argument
    public static void checkA(String word, char letter){

        int length = word.length();
        int count = 0;
        int index = 0;
        while (index < length) {
            if (word.charAt(index) == letter) { count = count + 1;
            }
            index = index + 1;
        }
        System.out.println(count);
    }


    //indexOf takes a character and finds the index where that character appears.
    //indexOf fails if the character does not appear in the string, and returns the value -1.
    //

    public static void countLetters(String word, char letter){

        int length = word.length();
        int count = 0;
        int index = 0;
        while (index < length) {

            if (word.indexOf(letter, index) != -1) {
                count = count +1;
                index = word.indexOf(letter, index) +1;
            }

        }
        System.out.println(count);
    }

    public static void test(){
        char c = 'z';
        String s = "Cheeseburger";
        int number = 525600;
        boolean b = true;

        System.out.println(s + c); //Adding a char to a string concatenates the result
        //System.out.println(s - c); //You cannot minus a char
        System.out.println(s + b); //You can add a bool to a string(it just doesn't automatically resolve as true)
        System.out.println(s + number); //You can add an int, it concatenates
        //System.out.println(b + number); //bool and int don't go together
        //System.out.println(b + c); //bool and char don't go together


    }
    /*Here’s a puzzler: normally, the statement x++ is exactly equivalent to x = x + 1. But if x is a char, it’s not!
    In that case,x++ is legal,but x = x + 1 causes an error. Try it out and see what the error message is,
    then see if you can figure out what is going on.
     */
    public static void puzzler(){
        char x = 'm';
        System.out.println(x++); //This prints m still
        System.out.println(x++); //This prints n, the change comes afterwards
        System.out.println(x); //evaluates to o from last increase
        System.out.println(x); //prints o
        //System.out.println(x = x + 1); //Incompatible types; adding int 1 is not possible to a char
    }

    //A friend of yours shows you the following method and explains that if number is any two-digit number,
    // the program will output the number backwards.
    // He claims that if number is 17, the method will output 71.

    //This doesn't work when the number is less than 10
    //dividing by int always rounds down the result, everywhere where
    public static void friendsMethod(){
        int number = 17;
        int lastDigit = number%10;
        int firstDigit = number/10;
        System.out.println(lastDigit + firstDigit);
    }

    public static void properSwitcher(int number){

        if(number <100 && number >10){ //numbers that are less than ten don't change, should only work with 2 digit numbers
            String numberString = Integer.toString(number); //There are several ways to change an int to string http://javadevnotes.com/java-integer-to-string-examples
            char tens = numberString.charAt(1);
            char decimal = numberString.charAt(0);
            //System.out.println(tens + decimal); This triggers an unwanted result where the char values of the numbers are added
            System.out.println("" + tens + decimal); //Here the first + is String concat, so the result will be a String. Note where the "" lies is important. (https://stackoverflow.com/a/16282424/7254272)

            //A more robust solutions is using stringBuilder i.e: (https://stackoverflow.com/a/16282455/7254272)
            StringBuilder answer = new StringBuilder();
            answer.append(tens);
            answer.append(decimal);
            System.out.println(answer);
        }

        else System.out.println("Please enter a two digit number");
    }

    //This was a puzzle given
    //callEnigma calls enigma with an integer parameter. Nothing happens if the answer is 0,
    //Enigma will print 0 if the answer is a multiple of 4, else it prints 0
    //call Enigma then leaves a line break

    public static void enigma(int x) {
        if (x == 0) {
            return;
        } else {
            enigma(x/2);
        }
        System.out.print(x%2);
    }
    public static void callEnigma(){
        enigma(5);
        System.out.println("");
    }



    private static char firstChar(String s){
        return s.charAt(0);
    }

    private static char lastChar(String s){
        return s.charAt(s.length()-1);
    }

    //generalized get at index method - written before realizing the implementation that the textbook suggested
    public static String getLetterAt(String s, int index){
        return "" + s.charAt(index);
    }

    public static boolean isAbecedarian(String s){
        int index = s.length() - 1;

        for(int i =0; i <index; i++){


            if(s.charAt(i)<=s.charAt(i + 1)){} //This is empty, will carry on running through for then return true

            else{
                System.out.println("That is not abecedarian");
                return false;
            }

        }
        System.out.println("Wow, that number is abecedarian");
        return true;
    }

    //A program that is split up into tiny method calls that return string to make a palindrome of a user's string input
    //will need to make a loop where the first and last part of middle are evaluated

    //resulting in endless loop

    public static boolean isPalindrome(String s){
        String middle = getMiddle(s); //The initial value of middle, this will be reevaluated in the loop

        boolean isPal = true;
        //getLast and getFirst methods useful despite being similar
        // as we will constantly take substrings and evaluate the first and last char of middle

        //A single letter is a palindrome

        //read this in the morning and be sure you are not messing up the length and the index
        //write case for when length is two, check the middle then
        //isPalindrome("ab")); evaluated to true

        if(s.length()>=1) {

            while (middle.length() >= 1) { //this will also evaluate two letter words

                if (middle.length() == 1) {
                    isPal= true;
                    middle = getMiddle(middle);
                }

                //if first and last equal, call middle again
                else if (firstChar(middle) == lastChar(middle)) {
                    middle = getMiddle(middle);
                } // too early? why isn't this working

                //Reassigning middle, will get smaller

                else {
                    isPal = false;
                    middle = getMiddle(middle);
                }

            }
        }

        else{isPal = true;}

        return isPal;
    }

    private static String getMiddle(String s){
        //will generate the middle of the word
        if(s.length() > 2){return s.substring(1, (s.length() - 1));} //There is no middle if the word is less than 3

        else{return "This string is too small, write again";}

    }




}//end of class




