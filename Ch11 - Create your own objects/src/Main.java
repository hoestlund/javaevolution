public class Main {

    public static void main(String[] args) {
	// write your code here

        //random.testTile(random);
        // This feels so wrong: Create an object to call a method that create an object with parameters of object
        //Tile random = new Tile('z', 10);
        //random.printTile(random);

//Another quick practice. Because the parameter is a class it means the method relies on class creation.
// Therefore the method can not be accessed in a static way e.g. Date.printBirthday
        Date birthday = new Date(1994, 02, 27);
        birthday.printBirthday(birthday);

        Date longBirthday = new Date();
        longBirthday.year = 1994;
        longBirthday.month = 02;
        longBirthday.date = 27;
        longBirthday.printBirthday(longBirthday);

    }
}
