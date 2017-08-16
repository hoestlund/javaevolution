
//I wanted to use the java.util.Date class to make the program a bit more exciting but
//will leave it until later in the course as I'm not getting it right
//import java.util.Date;
//import java.text.DateFormat;

public class Time {
	//DateFormat TimeCalc = new DateFormat();
	Integer second, minute, hour;
	
	{
		second = 47;
		minute = 33;
		hour = 22;
		
		
		Output();
		
	}
	
	private void Output() {
		
	System.out.println("Current time is:" + hour + ":" + minute + ":" + second );
	Integer minuteToSecond = minute*60;
	Integer hourToSecond = hour*60*60;
	
	Integer totalSeconds = hourToSecond + minuteToSecond + second;
	
	System.out.println(totalSeconds);
	}
	
//	public void SecondsSinceMidnight() {
//	Integer minuteToSecond = minute*60;
//	Integer hourToSecond = hour*2*2;
//	
//	
//}
}
