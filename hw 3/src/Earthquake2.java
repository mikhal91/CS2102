import java.util.LinkedList;

class Earthquake2 {
  Earthquake2(){}
      
  // checks whether a datum is a date
  boolean isDate(double anum) { return (int)anum > 10000000; }
  // extracts the month from an 8-digit date
  int extractMonth(double dateNum) { return ((int)dateNum % 10000) / 100; }

  public LinkedList<MaxHzReport> dailyMaxForMonth(LinkedList<Double> data, int month) {
    LinkedList<MaxHzReport> reports = new LinkedList<>();
    boolean getValues = false;
    double maxValue = 0;
    double previousDate = 0;

    for(double data2: data) {
      if (getValues == true) {
        if (isDate(data2)) {
          if (extractMonth(data2)==month) {
            getValues = false;
            reports.add(new MaxHzReport(previousDate, maxValue));
          }
          else {
            getValues = false;
          }
        }
        else if (maxValue < data2) {
          maxValue = data2;
        }
      }
      if (isDate(data2)) {
        if (extractMonth(data2)==month) {
          getValues = true;
          previousDate = data2;
        }
        maxValue = 0;
      }
    }
    if (maxValue != 0) {
      reports.add(new MaxHzReport(previousDate, maxValue));
    }
    return reports;
  }
}
