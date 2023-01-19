import java.util.GregorianCalendar;
import java.util.LinkedList;


public class WeatherStation {
    private IReadings totalReadings;

    public WeatherStation(IReadings read) {
        this.totalReadings = read;
    }
    public double averageMonthTemp(int mon, int year){
        return totalReadings.averageMonthTemp(mon,year);
    }

    public double totalMonthRainfall(int mon, int year){
        return totalReadings.totalMonthRainfall(mon,year);
    }
    public void addTodaysReport(GregorianCalendar date, LinkedList<Reading> reading) {
        totalReadings.addTodaysReport(date,reading);
    }

}
