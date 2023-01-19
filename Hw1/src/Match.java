public class Match {

    IContestant team1;
    IContestant team2;
    IResult results;



    public Match(IContestant team1, IContestant team2, IResult results) {
        this.team1 = team1;
        this.team2 = team2;
        this.results = results;
    }

    public static void main(String[] args) {
        SoccerTeam Japan = new SoccerTeam("Japan", "Red", false, 3, 1);
        SoccerTeam Sweden = new SoccerTeam("Sweden", "blue", true, 4, 0);
        SoccerTeam Russia = new SoccerTeam("Russia", "white", true, 3, 2);
        SoccerTeam Brazil = new SoccerTeam("Brazil", "green", true, 6, 0);


        LegoRobotTeam WPI = new LegoRobotTeam("WPI", "big arm", 6);
        LegoRobotTeam MIT = new LegoRobotTeam("MIT", "saw", 8);
        LegoRobotTeam UMASS = new LegoRobotTeam("UMASS", "wheels", 2);
        LegoRobotResult checj = new LegoRobotResult(WPI,MIT,3.1,5,true,
                2.2,2,false);
        LegoRobotResult checj2 = new LegoRobotResult(WPI,MIT,3.1,2,false,
                6.2,2,false);
        //System.out.println(checj);
       //System.out.println(WPI);
       //System.out.println(MIT);
       //System.out.println(checj2.getWinner());




    }


    public IContestant winner() {
        if (results.isValid()) {
            return results.getWinner();
        } else {
            return null;
        }
    }
}



