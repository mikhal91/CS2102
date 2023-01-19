import java.util.GregorianCalendar;
import java.util.LinkedList;

interface IReadings {

    public double averageMonthTemp(int month, int year);


    public double totalMonthRainfall(int month, int year);



    public void addTodaysReport(GregorianCalendar date, LinkedList<Reading> temp);



    //public void add(TodaysWeatherReport add);



}