//experimenting with the Math class and reading the user input to feed it into the parameters of the class
//need to find the base and exponent through user input
//need to then use the math class to find the result and print it 

//To do
//want to do some input checking but need to work it out:
//Have a bool method for isInteger
//Want to return a response when it's not but trying to avoid creating too many methods, 

import java.util.Scanner;

public class PowerPro {
    Scanner Reader = new Scanner(System.in);
    //Integer test;

    public void UserInterface() {
        System.out.print("Enter the base number: ");
        Double base = findDouble();
        System.out.print("Enter the exponent: ");
        Double exponent = findDouble();

        Double result = Math.pow(base, exponent);
        System.out.println("Here is the result: " + result);


    }

//	public Integer findBase() {
//		String baseString = Reader.nextLine();
//		Integer b = Integer.parseInt(baseString);
//		return b;
//	}

    public Double findDouble() {
        String startDouble = Reader.next();
        Double d = Double.parseDouble(startDouble);
        return d;
    }

//	public Boolean isInteger() {
//		 if (test == (int)test) {
//			 return true;
//		 }
//		 else
//			 return false;
//	}

}
