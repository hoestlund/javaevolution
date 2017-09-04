
public class Recursion {

	public static int factorial(int n) {
		if(n==0) {
			return 1;
		} else {
			int recurse = factorial(n-1);
			int result = n * recurse;
			return result;
			
		}
	}
}
