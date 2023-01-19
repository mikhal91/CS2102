import java.util.LinkedList;

public class InitialRound extends AbsRound{

    LinkedList<Match> matches = new LinkedList<Match>();

    public InitialRound(LinkedList<Match> matches) {
        this.matches = new LinkedList<Match>();

    }

    public LinkedList<IContestant> getMatchWinners() {
        LinkedList<IContestant> tempList = new LinkedList<IContestant>();
        for(Match matchObject : this.matches) {
            tempList.add(matchObject.winner());
        }
        return tempList;
    }

    @Override
    public boolean isWinner(IContestant contestant) {
        for(Match MatchObject : this.matches) {

                    if(MatchObject.winner().equals(contestant)) {

                            return true;

                    }

            }
        return false;
    }


    public int getNumWinners() {
        return getMatchWinners().size();
    }

}

