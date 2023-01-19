import static org.junit.Assert.*;

import org.junit.Before;
import org.testng.annotations.Test;

import java.util.LinkedList;


public class Examples {



    SoccerTeam soccerTeamCheck = new SoccerTeam("WPI", "maroon", false, 4, 6);
    LegoRobotTeam robotsTeamCheck = new LegoRobotTeam("WPI","goat cheese", 7);
    SoccerResult soccerResultCheck = new SoccerResult(soccerTeamCheck,
            soccerTeamCheck, 10.5,15.2);
    LegoRobotResult robotsResultCheck = new LegoRobotResult(robotsTeamCheck,
            robotsTeamCheck, 3.1, 5, true, 3.2, 2, false);
    Match soccerMatchCheck = new Match(soccerTeamCheck, soccerTeamCheck,
            soccerResultCheck);
    Match robotsMatchCheck = new Match(robotsTeamCheck, robotsTeamCheck,
            robotsResultCheck);

    SoccerTeam Japan = new SoccerTeam("Japan", "Red", false, 3, 1);
    SoccerTeam Sweden = new SoccerTeam("Sweden", "blue", true, 4, 0);
    SoccerTeam Russia = new SoccerTeam("Russia", "white", true, 3, 2);
    SoccerTeam Brazil = new SoccerTeam("Brazil", "green", true, 6, 0);


    LegoRobotTeam WPI = new LegoRobotTeam("WPI", "big arm", 6);
    LegoRobotTeam MIT = new LegoRobotTeam("MIT", "saw", 8);
    LegoRobotTeam UMASS = new LegoRobotTeam("UMASS", "wheels", 2);


    InitialRound iRound = new InitialRound(new LinkedList<Match>());
    AdvancedRound aRound = new AdvancedRound(new LinkedList<Match>(), new LinkedList<IContestant>());
    Tournament tnmt = new Tournament(new LinkedList<IWinner>());





    public Examples(){}



    // isValid
    // getScore
    // getWinner
    // winner
    // expectToBeat



    //IsValid tests

    @Test
    public void testisValid_True1( ) {assertTrue(soccerResultCheck.isValid());}
    @Test
    public void testisValid_True2( ) {assertTrue(robotsResultCheck.isValid());}

   ///GetScore

    @Test
    public void testgetScore_getbacknumber() {assertEquals(robotsResultCheck.getScore(3.2, 1, false), 4.2, .2); }



    @Test
    public void tes(){assertSame(soccerTeamCheck,soccerTeamCheck);}

    //getWinner
   @Test
   public void testGetWinnerLego(){assertSame(robotsResultCheck.getWinner(),robotsTeamCheck);}
    @Test
    public void testgetwinnernotelgot(){assertSame(soccerResultCheck.getWinner(),soccerTeamCheck);}




/// Winner

    @Test
    public void testwinner_lego() {assertSame(robotsMatchCheck.winner(),robotsTeamCheck) ; }


    @Test
    public void testwinner_soccer() {assertSame(soccerMatchCheck.winner(),soccerTeamCheck) ; }



//expectToBeat

    @Test
    public void testgetExpecttobeat() {
        assertFalse(robotsTeamCheck.expectToBeat(robotsTeamCheck));
    }

    @Test
    public void testexpecttobeatsoccer(){ assertFalse(soccerTeamCheck.expectToBeat(soccerTeamCheck));}


    //Linked List Testing
    //AbsRound trny1 = new Tournament();



    // getMatchWinners

    @Test
    public void testGetMatchWinners_init() {
        LinkedList<IContestant> tempList = iRound.getMatchWinners();
        assertEquals(new LinkedList<>(), new LinkedList<IContestant>());
    }

    @Test
    public void testGetMatchWinners_adv() {
        LinkedList<IContestant> tempList = aRound.getMatchWinners();
        assertEquals(new LinkedList<>(), new LinkedList<IContestant>());

    }


    @Test
    public void testgetnumwinners_aRound() {
        int tempnum = aRound.getNumWinners();
        System.out.println(aRound.getMatchWinners().size());
        assertEquals(aRound.getMatchWinners().size(), aRound.getNumWinners());

    }
    @Test
    public void testgetnumwinners_iRound() {
        int tempnum = iRound.getNumWinners();
        System.out.println(iRound.getMatchWinners().size());
        assertEquals(iRound.getMatchWinners().size(), iRound.getNumWinners());

    }
//iRound.isWinner(soccerTeamCheck)

    @Test
    public void testisWinnerinit() {
        assertFalse(iRound.isWinner(Japan));
    }

    @Test
    public void testisWinneradv() {
        assertFalse(aRound.isWinner(WPI));
    }


    @Test
    public void testisfinalwinnervalid() {
        assertTrue(tnmt.finalWinnerIsValid(Japan));
    }



}