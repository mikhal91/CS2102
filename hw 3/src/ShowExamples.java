import org.testng.annotations.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class ShowExamples 
{
	ShowManager1 sm1 = new ShowManager1();
	LinkedList<Show> shows = new LinkedList<Show>();
	ShowSummary report1 = new ShowSummary();

	Show startrek = new Show("Star Trek", 1800, 45.0, false);
	Show futurama = new Show("Futurama", 1900, 23.0, false);
	Show animaniacs = new Show("Animaniacs", 1630, 7.0, false);
	Show sesamestreet = new Show("Sesame Street", 900, 60.0, false);



	public ShowExamples()
	{
		Show truman = new Show("The Truman Show", 600, 20,false);
		Show AdvTime = new Show("Adventure Time", 1400, 10,true);
		Show Chowder = new Show("Chowder" , 900, 15,false);
		Show afternoonshow1 = new Show("afternoonShow1", 1700, 30, false);
		Show afternoonshow2 = new Show("afternoonShow2", 1900, 30, false);
		Show afternoonshow3 = new Show("afternoonShow3", 1800, 60, true);
		Show late3 = new Show("lateShow3", 2300, 30, true);
		Show MAD2 =new Show("MAD2", 2300, 15,false);
		Show MAD = new Show("MAD",2100,15,true);
		LinkedList<Show> allshows = new LinkedList<Show>();
		allshows.add(truman);
		allshows.add(AdvTime);
		allshows.add(Chowder);
		allshows.add(afternoonshow1);
		allshows.add(afternoonshow2);
		allshows.add(afternoonshow3);
		allshows.add(late3);
		allshows.add(MAD2);
		allshows.add(MAD);
		LinkedList<Show> L1 = new LinkedList<Show>();
		L1.add(truman);
		L1.add(Chowder);
		LinkedList<Show> L2 = new LinkedList<Show>();
		L2.add(afternoonshow1);
		L2.add(afternoonshow2);
		LinkedList<Show> L3 = new LinkedList<Show>();
		L3.add(MAD2);
		ShowSummary total = new ShowSummary(L1,L2,L3);
		ShowSummary lasdl = new ShowSummary(L1,L2,L3);

		LinkedList<Show> EarlyShows = new LinkedList<Show>();
		EarlyShows.add(truman);
		EarlyShows.add(AdvTime);
		LinkedList<Show> AfternoonShows = new LinkedList<Show>();
		AfternoonShows.add(afternoonshow1);
		AfternoonShows.add(afternoonshow2);
		LinkedList<Show> LateShows = new LinkedList<Show>();
		LateShows.add(late3);
		LateShows.add(MAD);
		LinkedList<Show> LateShows2 = new LinkedList<Show>();
		LateShows2.add(late3);
		ShowSummary Sum1 = new ShowSummary(EarlyShows, AfternoonShows,LateShows);
		ShowSummary Sum2 = new ShowSummary(EarlyShows, AfternoonShows,LateShows);
		ShowSummary Sum3 = new ShowSummary();
		ShowSummary Sum4 = new ShowSummary(EarlyShows, AfternoonShows,LateShows2);
		ShowSummary Sumall = new ShowSummary();
		ShowSummary last = Sumall.organizeShows(allshows);
		LateShows2.add(MAD2);

		shows.add(startrek);
		report1.primetime.add(startrek);

		shows.add(futurama);
		report1.primetime.add(futurama);

		shows.add(animaniacs);
		report1.daytime.add(animaniacs);

		shows.add(sesamestreet);
		report1.daytime.add(sesamestreet);
	}
	
	@Test
	public void instructorTestShowSummary_EmptyReport() {
		ShowSummary report2 = new ShowSummary();
		assertFalse(report1.equals(report2));
	}


	@Test
	public void instructorTestShowSummary_WrongOrder() {
		ShowSummary report2 = new ShowSummary();

		report2.primetime.add(futurama);
		report2.primetime.add(startrek);
		report2.daytime.add(animaniacs);
		report2.daytime.add(sesamestreet);

		assertFalse(report1.equals(report2));
	}

	@Test
	public void instructorTestShowSummary_DifferentInstances() {
		ShowSummary report2 = new ShowSummary();

		Show startrek2 = new Show("Star Trek", 1800, 60.0, true);
		Show futurama2 = new Show("Futurama", 1900, 20.0, false);
		Show animaniacs2 = new Show("Animaniacs", 1630, 9.0, true);
		Show sesamestreet2 = new Show("Sesame Street", 900, 55.0, false);

		report2.primetime.add(startrek2);
		report2.primetime.add(futurama2);
		report2.daytime.add(animaniacs2);
		report2.daytime.add(sesamestreet2);

		assertTrue(report1.equals(report2));
	}

	@Test
	public void instructorTestShowSummary_SameInstances() {
		ShowSummary report2 = report1;
		assertTrue(report1.equals(report2));
	}



	@Test
	public void instructorTestOrganizeShows() 
	{
		ShowSummary report2 = sm1.organizeShows(shows);
		assertEquals(report1, report2);
	}

}






















































/////////////////////////////////////////////////////////////////////
/*
Part 1 Subtasks

Method 1.)

Combines all three groups into one large list/group of shows (daytime, primetime, nighttime)

Checks if each show is a special

If it is a special, add it to a new list

Return new list

Method 2.)

Checks the list of shows to see if the show is a special or not
if it is a special it passes into a new list

the new list is organized based on time into daytime primetime or nighttime.

Returns the new organized list














 */












