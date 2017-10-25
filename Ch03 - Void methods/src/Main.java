public class Main {
    //Will execute the other classes that make up the questions from Downey's book
    public static void main(String[] args) {


//		UserFeedback one = new UserFeedback();
//		one.ReadingInput();
//		
//		Notes myExperiments = new Notes();
//		myExperiments.ConvertingDoubleToInt();
//		
//		PowerPro eh = new PowerPro(); //eh is exponential help 
//		eh.UserInterface();

//		Exercise3_3.zool(11, "Mr Fluffy", "Baker St.");

        //Creating a new object and calling the User input method which in turn calls the needed methods to give European and US date formats
        DateSetter BestDate = new DateSetter();
        BestDate.GetUserInput();

    }

}
