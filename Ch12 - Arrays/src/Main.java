public class Main {

    public static void main(String[] args) {

        Array_practice arrayObj = new Array_practice();


        int[] test = new int[10];
        test = arrayObj.randomArray(test);

        //int[] testDuplicate = new int[];
        int[] testDuplicate = arrayObj.cloneArray(test);

        arrayObj.printArray(test);
        arrayObj.printArray(testDuplicate);
    }
}
