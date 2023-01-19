import java.util.LinkedList;

public class Tournament extends AbsRound {
    LinkedList<IWinner> rounds = new LinkedList<IWinner>();

    public Tournament(LinkedList<IWinner> rounds) {
        this.rounds = new LinkedList<IWinner>();

    }

    public Tournament addround(IWinner around) {
        this.rounds.add(around);
        return this;
    }


    public Tournament() {

    }

    public boolean finalWinnerIsValid(SoccerTeam contestant)
            {

        if ((rounds.size() / 2.0) < contestant.wins) {
            return true;
        }
        return false;
    }



}