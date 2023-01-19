public class SoccerTeam implements IContestant {

    String country;
    String jerseycolor;
    boolean ritual;
    int wins;
    int losses;

    public SoccerTeam(String country, String jerseycolor, boolean ritual, int wins, int losses) {
        this.country = country;
        this.jerseycolor = jerseycolor;
        this.ritual = ritual;
        this.wins = wins;
        this.losses = losses;

    }

    public SoccerTeam() {
    }


    public boolean expectToBeat(SoccerTeam soccerteam2) {
        if (this.ritual != (soccerteam2.ritual)) {
            if (this.ritual = (soccerteam2.ritual)) {
                if ((this.wins - this.losses) < (soccerteam2.wins - soccerteam2.losses)) {
                    return true;
                } else
                    return false;
            }
            return true;
        }


        return false;
    }


}
