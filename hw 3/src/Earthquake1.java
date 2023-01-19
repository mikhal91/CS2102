import java.util.LinkedList;

class Earthquake1 {
  Earthquake1(){}

  // checks whether a datum is a date
  boolean isDate(double anum) { return (int)anum > 10000000; }
  // extracts the month from an 8-digit date
  int extractMonth(double dateNum) { return ((int)dateNum % 10000) / 100; }
 
  public LinkedList<MaxHzReport> dailyMaxForMonth(LinkedList<Double> data, int month) {

    double maxnow= 0;

    LinkedList<MaxHzReport> toreturn = new LinkedList<MaxHzReport>();
    LinkedList<Integer> wheretheyat = new LinkedList<Integer>();
    for (int i = 0; i <data.size(); i++) {

      if (isDate(data.get(i))){
        wheretheyat.add(i);
      }

    }

    for (Integer z: wheretheyat) {
    }

    for (int i = 0; i <wheretheyat.size(); i++) {
      maxnow=0;
      int howfar=0;
      if (wheretheyat.get(i) != wheretheyat.getLast()){
       howfar = Math.abs(wheretheyat.get(i)-wheretheyat.get(i+1))-1;}
      else {
         howfar= Math.abs(wheretheyat.get(i)-data.size())-1;
      }
      for (int j = 1; j <=howfar; j++) {
        if (maxnow<data.get(wheretheyat.get(i)+j)){
          maxnow = data.get(wheretheyat.get(i)+j);
      }
    }
      MaxHzReport add = new MaxHzReport(data.get(wheretheyat.get(i)),maxnow);
      toreturn.add(add);
    }
    ///toreturn has all of the daily highs
    LinkedList<MaxHzReport> real = new LinkedList<MaxHzReport>();
    for (MaxHzReport asd: toreturn) {
      if ( extractMonth(asd.date) == month){
        real.add(asd);
      }
    }
   return real;
  }
}




