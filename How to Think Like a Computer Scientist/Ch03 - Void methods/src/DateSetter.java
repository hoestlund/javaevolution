import java.util.Scanner;

public class DateSetter {
    Scanner Reader = new Scanner(System.in);

    //Asks the user questions to find out variables, answers used as parameters for dateAmerican and dateEuropean
    //NB I have not implemented checks on the user input, but would approach weekday as equivalent to string.equals (Does this check capitals?)
    //NB I would check date with a parse as well as check if <=31 if Jan, Mar, May, July, Aug, Oct, Dec
    //NB For the year I would set >2016 <(some reasonable number)

    public void GetUserInput() {

        //This block finds the components of the date as well as a suffix
        String day = input("weekday?");
        String date = input("dd?");
        String month = input("mm?");
        String year = input("yyyy?");

        //Add a suffix to the end
        String suffix = findSuffix(date);

        //This block calls print functions for American and European formats
        outputAmerican(day, month, date, suffix, year);
        outputEuropean(day, month, date, suffix, year);


    }

    //Method to handle all the questions asked of the user: day, date, month, year
    public String input(String whatDate) {
        System.out.print("Enter the " + whatDate);
        String outPut = Reader.nextLine();
        return outPut;
    }

    //Below you find my attempt at finding the suffix. My assumption is that it didn't work because:
    // (Of reasons -- seriously experiment and fix it)
    //I have in place used nice logic from  Anand Shekhar on stackoverflow (https://stackoverflow.com/questions/4011075/how-do-you-format-the-day-of-the-month-to-say-11th-21st-or-23rd-in-java)
//	public String findSuffix(String date) {
//			
//			String followsDate;
//			Integer intDate = Integer.parseInt(date);
//		
//			//check what to add to the end of the date st, nd, rd...
//			if(date == "1" || date == "21" || date == "31") {
//				followsDate = "st";
//			}
//			if(date == "2" || date == "22") {
//				followsDate = "nd";
//			}
//			if(date == "3" || date == "23") {
//				followsDate = "rd";
//			}
//			
//			else{
//				followsDate = "th";
//				}
//			
//			return followsDate;

    //Works for 23 but not working for others...

//	public String findSuffix(String date) {
//		
//		String followsDate;
//		Integer intDate = Integer.parseInt(date);
//	
//		//check what to add to the end of the intDate st, nd, rd...
//		if(intDate == 1 || intDate == 21 || intDate == 31) {
//			followsDate = "st";
//		}
//		if(intDate == 2 || intDate == 22) {
//			followsDate = "nd";
//		}
//		if(intDate == 3 || intDate == 23) {
//			followsDate = "rd";
//		}
//		
//		else{
//			followsDate = "th";
//		}
//		
//		return followsDate;
//	}

    private String findSuffix(String date) {
        Integer day = Integer.parseInt(date);
        if (day >= 11 && day <= 13) {
            return "th";
        }
        switch (day % 10) {
            case 1:
                return "st";
            case 2:
                return "nd";
            case 3:
                return "rd";
            default:
                return "th";
        }
    }

    public void outputAmerican(String weekDay, String month, String date, String followsDate, String year) {
        System.out.print("American Format:");
        System.out.println(weekDay + ", " + month + " " + date + followsDate + " " + year);

    }

    public void outputEuropean(String weekDay, String month, String date, String followsDate, String year) {
        System.out.print("European Format:");
        System.out.println(weekDay + ", " + date + followsDate + " " + month + " " + year);

    }
}
