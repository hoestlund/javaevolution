public class Date {

    int year, month, date;

    public Date() {
        year = 0;
        month = 0;
        date = 0;
    }

    public Date(int year, int month, int  date){
        this.year = year;
        this.month = month;
        this.date = date;
    }

    public void printBirthday(Date birthday){
        System.out.println(birthday.date + "." + birthday.month + "." + birthday.year);
    }
}
