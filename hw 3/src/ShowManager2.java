import java.util.LinkedList;

class ShowManager2 {
	
	ShowManager2() {}

	public ShowSummary organizeShows(LinkedList<Show> oog) {
		LinkedList<Show> cleanedData  = cleanData(oog);
		{
			LinkedList<Show> day = new LinkedList<Show>();
			LinkedList<Show> afternoon = new LinkedList<Show>();
			LinkedList<Show> night = new LinkedList<Show>();
			for (Show ThisData : oog) {
					if (ThisData.broadcastTime >= 600 && ThisData.broadcastTime < 1700 ){
						day.add(ThisData);
					}
					else if (ThisData.broadcastTime >= 1700 && ThisData.broadcastTime < 2200 ){
						afternoon.add(ThisData);
					}
					else if(ThisData.broadcastTime >= 100 && ThisData.broadcastTime < 600 ){
					}
					else{
						night.add(ThisData);
					}

			}
			ShowSummary egg = new ShowSummary(day,afternoon,night);
			return new ShowSummary(day,afternoon,night);
		}
	}

	public LinkedList<Show> cleanData(LinkedList<Show> oog) {
		LinkedList<Show> cleanedData = new LinkedList<Show>();


		//Cleaning
		for(Show o: oog) {


			if (o.isSpecial != false) {			//<-- terminating condition
				return cleanedData;
			}
			else if(o.isSpecial != true) {			//<-- normal condition
				cleanedData.add(o);
			}
		}

		return cleanedData;
	}

}
