
public class Date {
String day, month;
Integer date, year;
String followsDate;
	{
		day = "Wednesday";
		month = "August";
		date = 16;
		year = 2017;
		
		
		//FirstGoal();
		SecondGoal();
		
		//String output = System.out.println(day, date.toString(), month, year.toString());
		//String firstLine = System.out.println(day);
		//String secondLine = System
		//public void InitialOutput(String [] args) {
		
		

}
	public void FirstGoal(){
	System.out.println(day);
	System.out.println(date);
	System.out.println(month);
	System.out.println(year);
	}
	
	public void SecondGoal(){
		//check what to add to the end of the date st, nd, rd...
		if(date == 1 || date == 21 || date == 31) {
			followsDate = "st";
		}
		if(date == 2 || date == 22) {
			followsDate = "nd";
		}
		if(date == 3 || date == 23) {
			followsDate = "rd";
		}
		
		else{
			followsDate = "th";
		}
		
		
		
		System.out.println("American Format:");
		System.out.print(day + ", " + month + " " + date + followsDate + ", " + year);
	}
	
//	private void isThrid() {
//		if(date = 3 )
//	}
	
}