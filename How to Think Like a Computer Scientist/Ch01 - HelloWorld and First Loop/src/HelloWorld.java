public class HelloWorld {
    //This is my Java comment
    /*
	 * This
	 * is
	 * my
	 * multi-
	 * line
	 * comment
	 * 
	 */
    public static void main(String[] args) {
        // 13.08.17 My first program in Java! Oskar Enmalm
        System.out.println("Hello world!");
        System.out.println("*insert something witty*");

        String name;
        String firstName = "Oskar";
        String lastName = "Enmalm";

        name = firstName + "" + lastName;
        System.out.println(name);

        int universityGrade = 1; //declaring and assigning value in the same line
        System.out.println(universityGrade);
        System.out.println(name + name);

        Name.main(args);

        //We have a snail that needs to get to Proxima centauri and back

        public static void snailToStar{
            double secondsInYear = 365*24*60*60;
            double speedOfLight = 299792458;
            double totalMeters = 8.4 * secondsInYear * speedOfLight;
            double snailSpeedMS = 0.42/60*60; //snail travels 42 cm an hour

            double secondsTaken = totalMeters/snailSpeed; //time in seconds
            double yearsTaken = secondsTaken/secondsInYear;

            System.out.println("The snail spent " + yearsTaken + " years to go to Centaurai and back");
        }
    }

}
