import java.util.GregorianCalendar;
import java.util.LinkedList;

interface IReadings {

    public double averageMonthTemp(int month, int year);


    public double totalMonthRainfall(int month, int year);


    //adds todays report to the existing Report list
    public void addTodaysReport(GregorianCalendar date, LinkedList<Readings> temp);


    //used for the examples testing, adds a daily report to a linkedlist
    public void add(TodaysWeatherReport add);



    public LinkedList<TodaysWeatherReport> getList();

}