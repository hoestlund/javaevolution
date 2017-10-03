
public class Array_practice {

    public int[] cloneArray(int[] originalArray){

        //Creating a clone array of the same length
        //Done to prevent morphing
        int [] cloneArray = new int[originalArray.length - 1];

        //Copying the values from originalArray
        int i;
        for(i = 0; i < originalArray.length; i++){
            cloneArray[i] = originalArray[i];
        }

        return cloneArray;

    }

    //Starting a acouple methods to help with generating pseudorandom numbers
    //The Maths.random() method doesn't take any parameters, only returns a double between 0 and 1.0


    //Creates a random Array with each element being a value between 0 and n
    public  int[] randomArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i<a.length; i++) {
            a[i] = randomInt(n);
        }
        return a; }

    //Used by the randomArray method
    private int randomInt(int high){
        int randomInt = (int)(Math.random() * high);
        return randomInt;
    }

    public static void printArray(int[] a) {
        for (int i = 0; i<a.length; i++) {
            System.out.println(a[i]);
        }
}
