import sun.awt.image.ImageWatched;

import java.util.LinkedList;

class ShowSummary {
	
	LinkedList<Show> daytime;
	LinkedList<Show> primetime;
	LinkedList<Show> latenight;
	
	ShowSummary()
	{
		this.daytime = new LinkedList<Show>();
		this.primetime = new LinkedList<Show>();
		this.latenight = new LinkedList<Show>();
	}
	
	ShowSummary(LinkedList<Show> daytime, LinkedList<Show> primetime, LinkedList<Show> latenight)
	{
		this.daytime = daytime;
		this.primetime = primetime;
		this.latenight = latenight;
	}



	@Override
		public boolean equals(Object z) {
		ShowSummary o = (ShowSummary) z;
		if ((o.daytime.size() == this.daytime.size()) &&
			(o.primetime.size() == this.primetime.size()) &&
			(o.latenight.size() == this.latenight.size())){
			if (issame(o)){
				return true;
			}
		}

		return false;
		}
		boolean issame(ShowSummary o) {
			for (int i = 0; i <o.daytime.size(); i++) {
				if ((o.daytime.get(i).title != this.daytime.get(i).title) ||
					(o.daytime.get(i).broadcastTime != this.daytime.get(i).broadcastTime) ){
					return false;
				}
			}
			for (int i = 0; i <o.primetime.size(); i++) {
				if ((o.primetime.get(i).title != this.primetime.get(i).title) ||
						(o.primetime.get(i).broadcastTime != this.primetime.get(i).broadcastTime)){
					return false;
				}
			}
			for (int i = 0; i <o.latenight.size(); i++) {
				if ((o.latenight.get(i).title != this.latenight.get(i).title) ||
					(o.latenight.get(i).broadcastTime != this.latenight.get(i).broadcastTime)){
					return false;
				}
			}
			return true;
		}



		public ShowSummary organizeShows(LinkedList<Show> oog){
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
			return egg;
		}









































}
