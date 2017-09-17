public class Exercises {
    //This chapter mainly looks at classes that are used to help manipulate strings
    //indexOf is the inverse of charAt

    public static void reverse(String s){
        String backString = new StringBuffer(s).reverse().toString();
        System.out.println(backString);
    }

}
