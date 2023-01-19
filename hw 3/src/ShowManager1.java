import java.util.LinkedList;


class ShowManager1 {
	
	ShowManager1() {}

	public ShowSummary organizeShows(LinkedList<Show> oog)
	{
		LinkedList<Show> day = new LinkedList<Show>();
		LinkedList<Show> afternoon = new LinkedList<Show>();
		LinkedList<Show> night = new LinkedList<Show>();
		for (Show show : oog) {
			if (show.isSpecial != true){
				if (show.broadcastTime >= 600 && show.broadcastTime < 1700 ){
					day.add(show);
				}
				else if (show.broadcastTime >= 1700 && show.broadcastTime < 2200 ){
					afternoon.add(show);
				}
				else if(show.broadcastTime >= 100 && show.broadcastTime <600 ){
				}
				else{
					night.add(show);
				}
			}
		}
		ShowSummary egg = new ShowSummary(day,afternoon,night);
		return new ShowSummary(day,afternoon,night);
	}
	
}

