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



        }//end of class




