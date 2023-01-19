import static org.junit.Assert.*;
import org.junit.Test;
import java.util.LinkedList;

public class EarthquakeExamples {
  Earthquake1 E1 = new Earthquake1();
  LinkedList<Double> noData = new LinkedList<Double>();
  LinkedList<Double> threeDates = new LinkedList<Double>();
  LinkedList<MaxHzReport> NovReports = new LinkedList<MaxHzReport>();
  LinkedList<MaxHzReport> OctReports = new LinkedList<MaxHzReport>();
  
  public EarthquakeExamples() {
    threeDates.add(20151013.0);
    threeDates.add(10.0);
    threeDates.add(5.0);
    threeDates.add(20151020.0);
    threeDates.add(40.0);
    threeDates.add(50.0);
    threeDates.add(45.0);
    threeDates.add(20151101.0);
    threeDates.add(6.0);
    NovReports.add(new MaxHzReport(20151101.0,6.0));
    MaxHzReport a = new MaxHzReport(20151020.0,50.0);
    MaxHzReport b = new MaxHzReport(20151013.0,10.0);
    OctReports.add(b);
    OctReports.add(a);
  }

  @Test
  public void instructorTestEQ() { 
    assertEquals(NovReports, 
                 E1.dailyMaxForMonth(threeDates, 11));
  }
  @Test
  public void instructorTestEQ2() {
    assertEquals(OctReports,
            E1.dailyMaxForMonth(threeDates, 10));
  }


}


/* Subtasks:
dailyMaxForMonth needs to do the following:
	-take in a list of sensor data and a month
	-checks each piece of data to see if it is a date or not
	-if it is a date then it should check if the month part of the date is the same month as the month provided
	-cycle through the data for each day until the max value is found
    -return LinkedList<MaxHzReport>, with MaxHzReport parameters as the date and the max
*/
