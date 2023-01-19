import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;

public class WeatherStation implements IReadings {

    private LinkedList<TodaysWeatherReport> a;

    private IReadings totalReadings;

    WeatherStation(IReadings totalReadings){
        this.totalReadings = totalReadings;
    }





    public double averageMonthTemp(int month, int year) {

        double avg = totalReadings.averageMonthTemp(month, year);
        return avg;
    }


    public double totalMonthRainfall(int mon, int year){
        double rainfall = 0;
        for (TodaysWeatherReport d :a) {
            if (d.getDate().get(GregorianCalendar.MONTH)==mon && d.getDate().get(GregorianCalendar.YEAR)==year){

                rainfall+=d.getrainfall();
            }
        }
        if (rainfall!=0){
            return rainfall;
        }
        return 0;
    }


    public void addTodaysReport(GregorianCalendar date,LinkedList<Readings> read) {
        totalReadings.add(new TodaysWeatherReport(date, read));

        //TodaysWeatherReport n = new TodaysWeatherReport(date,read);
        //   totalReadings.add(n);
    }

    public void add(TodaysWeatherReport add) {
    }

}
