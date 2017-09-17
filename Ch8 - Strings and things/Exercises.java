public class Exercises {
    //This chapter mainly looks at classes that are used to help manipulate strings
    //indexOf is the inverse of charAt

    public static void reverse(String s){
        String backString = new StringBuffer(s).reverse().toString();
        System.out.println(backString);
    }

    public static void countLetters(String s, char l){
        //String fruit = "banana";

        if (s.indexOf(l) == -1){
            System.out.println("That letter does no exist in the string, try another");
        }

        else{
            int index = s.length() - 1; //This is taken to put an upper limit to the loop
            int startSearchAt = 0; //This will be the second argument for the index at
            int timesAppeared = 0;

            //a recursive function where if checks if the start is the last character of the word (printing the count of occurances)
            //the else part would contain the snippet I have already written, organized slightly differently

           /* for ( int timesAppeared = 0; startSearchAt<=s.length(); count ++){
               if (s.charAt(startSearchAt) == l){
                    timesAppeared++;
                }
                startSearchAt = s.indexOf(l,startSearchAt) + 1; //This will gradually move the start position automatically towards the end
                System.out.println("This ran");*/
            if(startSearchAt<index){
                
            }


            }

            System.out.println(timesAppeared);
        }


    }

}
