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




        }//end of class




