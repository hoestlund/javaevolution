
public class Array_practice {

    public int[] cloneArray(int[] originalArray){

        //Creating a clone array of the same length
        //Done to prevent morphing
        int [] cloneArray = new int[originalArray.length];

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
    //ISSUE not able to use method
    public  int[] randomArray(int[] input) {
        int index = input.length - 1;

        int[] a = new int[index];

        for (int i = 0; i<index; i++) {
            a[i] = randomInt(index);
        }

        return a;
    }

    //Used by the randomArray method
    private int randomInt(int high){
        int randomInt = (int)(Math.random() * high);
        return randomInt;
    }

    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        System.out.println("");
    }
}
