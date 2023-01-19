import sun.awt.image.ImageWatched;

import java.util.Calendar;
import java.util.GregorianCalendar;

import java.util.LinkedList;

public class TodaysWeatherReport {

    private GregorianCalendar date;
    private LinkedList<Double> tempday;
    private LinkedList<Double> rainfall;


    public TodaysWeatherReport(GregorianCalendar date, LinkedList<Double> temp, LinkedList<Double> rain) {
        this.date = date;
        this.rainfall=rain;
        this.tempday=temp;

    }

    public double gettemp() {
        double temptotal = 0;
        for (Double d : tempday) {
            temptotal += d;
        }
        return temptotal / tempday.size();
    }

    public double getrainfall() {
        double rainfalltotal = 0;
        for (Double r : rainfall){
            rainfalltotal += r;
        }
        return rainfalltotal;
    }

    public GregorianCalendar getDate() {
        return this.date;
    }


}
