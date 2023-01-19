import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;

public class DailyRepList implements IReadings {

     private LinkedList<TodaysWeatherReport> a;

     public DailyRepList(LinkedList<TodaysWeatherReport> rep) {
         a = rep;
     }

     public LinkedList<TodaysWeatherReport> getreport() {
         return a;
     }

     public double averageMonthTemp(int month, int year) {
         double temp = 0;
         int sofar = 0;
         for (TodaysWeatherReport d : a) {
             if (d.getDate().get(GregorianCalendar.MONTH) == month && d.getDate().get(GregorianCalendar.YEAR) == year) {
                 sofar++;
                 temp += d.gettemp();
             }
         }
         if (sofar != 0) {
             return temp / sofar;
         }
         return 0;
     }

     public double totalMonthRainfall(int mon, int year) {
         double rainfall = 0;
         for (TodaysWeatherReport d : a) {
             if (d.getDate().get(GregorianCalendar.MONTH) == mon && d.getDate().get(GregorianCalendar.YEAR) == year){
                 rainfall += d.getrainfall();
             }
         }
         if (rainfall != 0) {
             return rainfall;
         }
         return 0;
     }

     public void add(TodaysWeatherReport add) {
         a.add(add);
     }

     public void addTodaysReport(GregorianCalendar date, LinkedList<Reading> reading) {
         LinkedList<Double> temp = new LinkedList<>();
         LinkedList<Double> rain = new LinkedList<>();
         for (Reading r : reading) {
             rain.add(r.getrainfall());
             temp.add(r.gettemp());
         }
         TodaysWeatherReport z = new TodaysWeatherReport(date,temp,rain);
         a.add(z);
     }
 }





