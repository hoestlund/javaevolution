
public class Exercises {
	
	public static Boolean isDivisible(int n, int m) {
		if(!(n%m==0)) {
			return false; } 
		else return true;
		
	}
	
	public static double multiAdd(double a, double b, double c) {
		return a*b + c;
	}
	
	public static double yikes(double x) {
		return Exercises.multiAdd(x, Math.exp(-x), Math.sqrt(1-Math.exp(-x)));
	}
	
	//attempt at the Ackermann function, getting an overflow error 
	public static int ackermann(int m, int n) {
		
			if(m==0) {
				return n+1;
			}
			else if (m>1&&n==0) {
				return Exercises.ackermann(m-1, 1);
			}
			else {
				return Exercises.ackermann(m-1, Exercises.ackermann(m, n-1));
			}
	}
		
	
}//end of class





