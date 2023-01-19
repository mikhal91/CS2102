public class Reading {
    private Time currentTime;
    private double temp;
    private double rainfall;



    public Reading(Time t, double temp,double rainfall){
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
