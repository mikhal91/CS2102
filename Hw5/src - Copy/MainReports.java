import java.util.GregorianCalendar;
import java.util.LinkedList;


public class MainReports {
    private IReadings totalReadings;

    public MainReports() {
        this.readings = new LinkedList<TodaysWeatherReport>();
    }



    public void addTodaysReport(GregorianCalendar date, LinkedList<Readings> temp) {
        readings.add(new TodaysWeatherReport(date,temp));
    }


    public void add(TodaysWeatherReport add) {

    }


    public double averageMonthTemp(int mon, int year){
        int numdays=0;
        double temp =0;
        for (TodaysWeatherReport d : a) {
            if (d.getDate().get(GregorianCalendar.MONTH)==mon && d.getDate().get(GregorianCalendar.YEAR)==year){
                numdays++;
                temp+=d.gettemp();
            }
        }
        if (temp!=0){
            return temp/numdays;
        }
        return 0;
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




}
