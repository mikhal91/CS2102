public class SoccerResult extends SoccerTeam implements IResult{


    SoccerTeam team1;
    SoccerTeam team2;
    double team1points;
    double team2points;


    public SoccerResult(SoccerTeam team1, SoccerTeam team2, double team1points, double team2points) {
        this.team1 = team1;
        this.team2 = team2;
        this.team1points = team1points;
        this.team2points = team2points;

    }

    public SoccerResult(String country, String jerseycolor, boolean ritual, int wins, int losses) {
        super(country, jerseycolor, ritual, wins, losses);
    }

    public boolean isValid() {
            if (team1points < 150 && team2points < 150) {

                    System.out.println("The results are expected/reasonable");
                    return true;
            }
            else
                System.out.println("The results are not valid or expected");
            return false;
        }

    public SoccerTeam getWinner() {
        if (team1points < team2points) {
            return team2;

        } else
            return team1;
    }




    // For soccer scores, a result is valid only if BOTH teams are under 150 points.
    // For robotics scores, a result is valid only if BOTH teams have fewer than 8 attempted tasks AND no more than 16 points.


}
