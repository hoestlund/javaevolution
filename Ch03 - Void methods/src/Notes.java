import java.util.Scanner;

public class Notes {
    //Converting can be done by creating another variable in the data type wanted, example:


    //creating a method to insert a new line
    public static void newLine() {
        System.out.println("");
    }

    public static void styleLine() {
        System.out.println(".-.-.-.-.-.-.-.-.-.-.-.-.");
    }

    //a method to call other methods
    public static void niceBreak() {
        newLine();
        styleLine();
    }

    public void ConvertingDoubleToInt() {

        Scanner Reader = new Scanner(System.in);

        double pi = 3.14159265358;
        int pIndiana = (int) pi;
        styleLine();
        System.out.println("Some decimals of pi; " + pi);
        System.out.println("No decimals of pi; " + pIndiana);
        newLine();
        styleLine();
        System.out.print("Now enter a double: ");
        String userDouble = Reader.nextLine();
        niceBreak();
        Double outputDouble = Double.parseDouble(userDouble);
        System.out.println("Your double: " + outputDouble);
        Integer outputInt = outputDouble.intValue();
        System.out.println("Your double as an integer: " + outputInt);

    }
}
