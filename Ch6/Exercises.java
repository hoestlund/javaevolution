
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
	

}
