import java.util.LinkedList;

public class Planning1 {
	
	public Planning1()
	{
		
	}
	
	double rainfall(LinkedList<Double> rainData)
	{
		double sum = 0;	//the sum of the rainfall totals seen so far
		int count = 0;	//a count of the rainfall totals seen so far
		
		for(Double d: rainData) {
			if (d == -999) {			//<-- terminating condition 
				if(count > 0) {
					return sum/count;
				}
			else { return -1; }
			}
			
			else if(d >= 0) {			//<-- normal condition
				sum = sum + d;
				count = count + 1;
			}
		}
		
		if (count > 0) {
			return sum/count;
		}
		else { return -1; }
	}

}
