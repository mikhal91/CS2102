import java.util.LinkedList;

public class Planning2 {
	double rainfall(LinkedList<Double> rainData)
	{
		double sum = 0;	//the sum of the rainfall totals seen so far
		int count = 0;	//a count of the rainfall totals seen so far
		
		
		LinkedList<Double> cleanedData  = cleanData(rainData);
		
		//Average
		for(Double thisData : cleanedData) {
			sum = sum + thisData;
			count++;
		}
		if (count > 0) {
			return sum/count;
		}
		else return 0;
	}
	
	public LinkedList<Double> cleanData(LinkedList<Double> rainData) {
		LinkedList<Double> cleanedData = new LinkedList<Double>();

		
		//Cleaning
		for(Double d: rainData) {
			
			
			if (d == -999) {			//<-- terminating condition 
				return cleanedData;
			}		
			else if(d >= 0) {			//<-- normal condition
				cleanedData.add(d);
			}
		}
		
		return cleanedData;
	}
}
