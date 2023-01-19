public class Readings {
    private Time currentTime;
    private double temp;
    private double rainfall;



    public Readings(Time t, double temp,double rainfall){
        this.currentTime=t;
        this.temp=temp;
        this.rainfall=rainfall;
    }
    public double gettemp(){
        return temp;
    }
    public double getrainfall(){
        return rainfall;
    }



}
