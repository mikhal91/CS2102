import sun.awt.image.ImageWatched;

import java.util.GregorianCalendar;
import java.util.LinkedList;

public class Main {



    public static void main(String[] args) {
        LinkedList<Reading> allr = new LinkedList<Reading>();
        LinkedList<Double> temps1 = new LinkedList<>();
        LinkedList<Double> rain1 = new LinkedList<>();
        Reading r1 = new Reading(new Time(5, 10), 33.5, 1.1);
        Reading r2 = new Reading(new Time(9, 43), 46.5, 3.4);
        Reading r3 = new Reading(new Time(13, 5), 69.5, 10);
        Reading r4 = new Reading(new Time(19, 29), 54.5, 5.2);
        Reading r5 = new Reading(new Time(23, 59), 20.5, 1);
        allr.add(r1);
        temps1.add(r1.gettemp());
        rain1.add(r1.getrainfall());
        allr.add(r2);
        temps1.add(r2.gettemp());
        rain1.add(r2.getrainfall());
        allr.add(r3);
        temps1.add(r3.gettemp());
        rain1.add(r3.getrainfall());
        allr.add(r4);
        temps1.add(r4.gettemp());
        rain1.add(r4.getrainfall());
        allr.add(r5);
        temps1.add(r5.gettemp());
        rain1.add(r5.getrainfall());
        LinkedList<Reading> allr2 = new LinkedList<Reading>();
        LinkedList<Double> temps2 = new LinkedList<>();
        LinkedList<Double> rain2 = new LinkedList<>();
        Reading r11 = new Reading(new Time(5, 10), 33.5, 1);
        Reading r12 = new Reading(new Time(6, 13), 38.8, 3.3);
        Reading r13 = new Reading(new Time(7, 52), 42.5, 7.7);
        Reading r14 = new Reading(new Time(8, 42), 50.2, 2.8);
        Reading r15 = new Reading(new Time(9, 18), 52.1, 0.1);
        allr2.add(r11);
        temps2.add(r11.gettemp());
        rain2.add(r11.getrainfall());
        allr2.add(r12);
        temps2.add(r12.gettemp());
        rain2.add(r12.getrainfall());
        allr2.add(r13);
        temps2.add(r13.gettemp());
        rain2.add(r13.getrainfall());
        allr2.add(r14);
        temps2.add(r14.gettemp());
        rain2.add(r14.getrainfall());
        allr2.add(r15);
        temps2.add(r15.gettemp());
        rain2.add(r15.getrainfall());
        LinkedList<Reading> allr3 = new LinkedList<Reading>();
        LinkedList<Double> temps3 = new LinkedList<>();
        LinkedList<Double> rain3 = new LinkedList<>();
        Reading r111 = new Reading(new Time(11, 0), 59.3, 9.1);
        Reading r112 = new Reading(new Time(15, 53), 70.5, 2.4);
        Reading r113 = new Reading(new Time(19, 22), 54.4, 1.3);
        Reading r114 = new Reading(new Time(21, 32), 55.7, 0.2);
        Reading r115 = new Reading(new Time(22, 37), 52.9, 3.8);
        allr3.add(r111);
        temps3.add(r111.gettemp());
        rain3.add(r111.getrainfall());
        allr3.add(r112);
        temps3.add(r112.gettemp());
        rain3.add(r112.getrainfall());
        allr3.add(r113);
        temps3.add(r113.gettemp());
        rain3.add(r113.getrainfall());
        allr3.add(r114);
        temps3.add(r114.gettemp());
        rain3.add(r114.getrainfall());
        allr3.add(r115);
        temps3.add(r115.gettemp());
        rain3.add(r115.getrainfall());
        TodaysWeatherReport t1 = new TodaysWeatherReport(new GregorianCalendar(2021, 10, 10), temps1, rain1);
        TodaysWeatherReport t2 = new TodaysWeatherReport(new GregorianCalendar(2021, 11, 11), temps2, rain2);
        TodaysWeatherReport t3 = new TodaysWeatherReport(new GregorianCalendar(2021, 10, 13), temps3, rain3);
        LinkedList<TodaysWeatherReport> z = new LinkedList<TodaysWeatherReport>();
        z.add(t1);
        z.add(t2);
        z.add(t3);

        DailyRepList l1 = new DailyRepList(z);
        WeatherStation w1=new WeatherStation(l1);
        WeatherStation w2=new WeatherStation(new DailyRepList(new LinkedList<TodaysWeatherReport>()));
        System.out.println(w1.averageMonthTemp(10,2021));
        System.out.println(w1.totalMonthRainfall(10,2021));
    }
}
