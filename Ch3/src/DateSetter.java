import java.util.Scanner;

public class DateSetter {
	Scanner Reader = new Scanner(System.in);
	
	public void GetUserInput() {
		System.out.print("Enter the date");
		String date  = Reader.nextLine();
		//Integer date = Integer.parseInt(d);
		
	}
	
	public String findSuffix(String date) {
			
			String followsDate;
		
			//check what to add to the end of the date st, nd, rd...
			if(date == "1" || date == "21" || date == "31") {
				followsDate = "st";
			}
			if(date == "2" || date == "22") {
				followsDate = "nd";
			}
			if(date == "3" || date == "23") {
				followsDate = "rd";
			}
			
			else{
				followsDate = "th";
			}
			
			return followsDate;
	}
	
	public void outputAmerican(String month, String date, String followsDate, String year) {
		System.out.println("American Format:");
		System.out.print(month + " " + date + followsDate + ", " + year);
		
	}
}
