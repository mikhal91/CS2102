import org.junit.Test;

import java.util.GregorianCalendar;
import java.util.LinkedList;
import static org.junit.Assert.*;


public class Examples {


    MainReports reporttest1;


    LinkedList<Readings> allr;
    Readings r1;
    Readings r2;
    Readings r3;
    Readings r4;
    Readings r5;
    TodaysWeatherReport t1;
    TodaysWeatherReport t2;
    TodaysWeatherReport t3;
    WeatherStation w1;
    WeatherStation w2;
    WeatherStation w3;

    public Examples() {




        GregorianCalendar date1 = new GregorianCalendar(2016, 11, 17);
        GregorianCalendar date2 = new GregorianCalendar(2017, 11, 18);
        GregorianCalendar date3 = new GregorianCalendar(2016, 11, 19);
        GregorianCalendar date4 = new GregorianCalendar(2016, 12, 17);




        TodaysWeatherReport d1 = new TodaysWeatherReport(date1, allr);
        d1 = new TodaysWeatherReport(date1, allr);

        reporttest1 = new MainReports();
        reporttest1.add(d1);

        allr= new LinkedList<Readings>();
        r1 = new Readings(new Time(5,10),33.5,1.1);
        r2 = new Readings(new Time(9,43),46.5,3.4);
        r3 = new Readings(new Time(13,5),69.5,10);
        r4 = new Readings(new Time(19,29),54.5,5.2);
        r5 = new Readings(new Time(23,59),20.5,1);
        allr.add(r1);
        allr.add(r2);
        allr.add(r3);
        allr.add(r4);
        allr.add(r5);
        LinkedList<Readings> allr2 = new LinkedList<Readings>();
        Readings r11=new Readings(new Time(5,10),33.5,1);
        Readings r12=new Readings(new Time(6,13),38.8,3.3);
        Readings r13=new Readings(new Time(7,52),42.5,7.7);
        Readings r14=new Readings(new Time(8,42),50.2,2.8);
        Readings r15=new Readings(new Time(9,18),52.1,0.1);
        allr2.add(r11);
        allr2.add(r12);
        allr2.add(r13);
        allr2.add(r14);
        allr2.add(r15);
        LinkedList<Readings> allr3 = new LinkedList<Readings>();
        Readings r111=new Readings(new Time(11,0),59.3,9.1);
        Readings r112=new Readings(new Time(15,53),70.5,2.4);
        Readings r113=new Readings(new Time(19,22),54.4,1.3);
        Readings r114=new Readings(new Time(21,32),55.7,0.2);
        Readings r115=new Readings(new Time(22,37),52.9,3.8);
        allr3.add(r111);
        allr3.add(r112);
        allr3.add(r113);
        allr3.add(r114);
        allr3.add(r115);
        t1=new TodaysWeatherReport(new GregorianCalendar(2021,10,10),allr);
        t2=new TodaysWeatherReport(new GregorianCalendar(2021,11,11),allr2);
        t3=new TodaysWeatherReport(new GregorianCalendar(2021,10,13),allr3);
        w1.addTodaysReport(new GregorianCalendar(2021,10,10),allr);
        w2.addTodaysReport(new GregorianCalendar(2021,11,11),allr2);
        w3.addTodaysReport(new GregorianCalendar(2021,10,13),allr3);



    }

    @Test
    public void readingtemp(){
        assertEquals(r1.gettemp(),33.5);
    }
    @Test
    public void readingrain(){
        assertEquals(r1.getrainfall(),1.1);
    }
    @Test
    public void ReportTemp(){
        assertEquals(t1.gettemp(),44.9);
    }
    @Test
    public void ReportRain(){
        assertEquals(t1.getrainfall(),20.7);
    }
    @Test
    public void AverageMonthTemp1(){
        assertEquals(reporttest1.averageMonthTemp(10, 2021),44.9);
    }
  //  @Test
  //  public void __(){
  //      assertEquals();
  //  }
  //  @Test
  //  public void __(){
   //     assertEquals();
  //  }

}

  //  @Test //test reading temp
  //  public void test6(){
  //      assertEquals(10,readings1.getTemp(),.1);
  //  }




// @Test //test average low
  // public void test1(){
  //     assertEquals(32.5, report1.avgLowForMonth(11, 2016),.1);
  // }