import java.util.Scanner;

public class UserFeedback {

    Scanner Reader = new Scanner(System.in);


    public void ReadingInput() {
        System.out.println("What is your name?");
        String name = Reader.nextLine(); //reads next line and assigns
        System.out.println("Hello " + name);


    }
}
