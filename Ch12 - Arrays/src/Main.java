public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] test = new int[];
        test = test.randomArray(10);

        int[] testDuplicate = new int[];
        testDuplicate = testDuplicate.clone(test);
    }
}
