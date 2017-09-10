
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
	
	//method to call all the methods relating to string information
	public static void stringMethods(String s){
		System.out.println("The first character of the string is: " + Exercises.first(s));
		System.out.println("The rest of the world starting from index 1 is: " + Exercises.rest(s));
		System.out.println("The length of the string is: " + Exercises.length(s));
	}
	
	private static char first(String s) {
		return s.charAt(0);
	}
	
	private static String rest(String s) {
		return s.substring(1, s.length());
	}
	
	private static int length(String s) {
		return s.length();
	}
	
	//takes a string and prints each character one by one on a line
	public static void printString(String s) {
		
		int n = s.length(); //this will be the upper limit for the loop
		for (int i = 0; i<n; i++)
		
		System.out.println(s.charAt(i));
		
	}
	
	public static void printBackwards(String s) {
		
		//implementation is a bit annoying and is repeating code, will reverse the string and call the printString method instead
//		int n = s.length(); //this will be the upper limit for the loop
//		for (n; 0<=n; n--)
//		
//		System.out.println(s.charAt(n));
		s = new StringBuilder(s).reverse().toString();
		Exercises.printString(s);
	}
	
	//The text books wants to write a method that reverses a string but not using tools available.
	//keep forgetting to declare the type for i 
	public static void oldSchoolReverse(String s) {
		
		int n = s.length();

		for(int i=0; i < s.length(); i++) {
			System.out.print(s.charAt(n-1));
			n--;
		}
	}
	
	public static double power (double x, int n) {
		if(n==0) {
			return 1.0;
		}
		
		//Checking if even and doing the calculation like so is more efficient
		else if(n%2==0) {
			n = n/2;
			return Math.pow(Math.pow(x, n), 2);
		} 
		
		else {
			return Math.pow(x,n);
		}
		
	}
	
}//end of class





