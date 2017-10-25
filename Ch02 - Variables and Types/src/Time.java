//I wanted to use the java.util.Date class to make the program a bit more exciting but
//will leave it until later in the course as I'm not getting it right
//import java.util.Date;
//import java.text.DateFormat;

public class Time {
    //DateFormat TimeCalc = new DateFormat();
    Integer second, minute, hour;

    {
        //hard coded the time to test everything
        second = 30;
        minute = 25;
        hour = 22;


        Output();

    }

    private void Output() {

        System.out.println("Current time is:" + hour + ":" + minute + ":" + second);
        Integer minuteToSecond = minute * 60;
        Integer hourToSecond = hour * 60 * 60;
        Double secondsInDay = 60 * 60 * 24.0;

        Integer totalSeconds = hourToSecond + minuteToSecond + second;

        System.out.println(totalSeconds);
        System.out.println("");
        System.out.println("This is the percetge of time passed today: ");

        Double percentageDay = (totalSeconds / secondsInDay) * 100;
        Double percentageToDisplay = (double) Math.round(percentageDay * 1000d) / 1000d;
        System.out.println(percentageToDisplay + "%");
    }

//	public void SecondsSinceMidnight() {
//	Integer minuteToSecond = minute*60;
//	Integer hourToSecond = hour*2*2;
//	
//	
//}
}
