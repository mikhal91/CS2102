public class LegoRobotResult extends LegoRobotTeam implements IResult{

    LegoRobotTeam team1;
    LegoRobotTeam team2;
    double team1points;
    int team1tasks;
    boolean team1fell;
    double team2points;
    int team2tasks;
    boolean team2fell;
    double score1;
    double score2;




    public LegoRobotResult(LegoRobotTeam team1, LegoRobotTeam team2, double team1points,int team1tasks,boolean team1fell, double team2points, int team2tasks, boolean team2fell) {
        this.team1 = team1;
        this.team2 = team2;
        this.team1points = team1points;
        this.team1tasks = team1tasks;
        this.team1fell = team1fell;
        this.team2points = team2points;
        this.team2tasks = team2tasks;
        this.team2fell = team2fell;

    }

    public boolean isValid() {
    if (team1points <= 16 && team2points <= 16 && team1tasks < 8 && team2tasks < 8) {

        System.out.println("The results are expected/reasonable");
        return true;
    }
            else

                    System.out.println("The results are not valid or expected");
                    return false;
}

    public double getScore(double teampoints, int tasks, boolean fell) {

        if (fell) {
            score = teampoints + tasks - 5;
            return score;
        }
        else
            score = teampoints + tasks;
        return score;
        }




        public LegoRobotTeam getWinner() {
        if (getScore(team1points,team1tasks,team1fell) < getScore(team2points,team2tasks,team2fell)) {
            return team2;
        } else
            return team1;
    }


      }



