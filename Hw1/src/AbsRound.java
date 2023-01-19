import java.util.LinkedList;

public abstract class AbsRound {
    LinkedList<Match> matches = new LinkedList<Match>();


    public AbsRound(LinkedList<Match> matches) {
        this.matches = new LinkedList<Match>();


    }
    public LinkedList<IContestant> getMatchWinners() {
        LinkedList<IContestant> tempList = new LinkedList<IContestant>();
        for(Match matchObject : this.matches) {
            tempList.add(matchObject.winner());
        }
        return tempList;
    }

    public AbsRound() {

    }

    public boolean isWinner(IContestant contestant) {
        for(Match MatchObject : this.matches) {
            if(MatchObject.winner().equals(contestant)) {
                System.out.println("The Contestant was a winner from a previous round");
                return true;
            }
        }
        System.out.println("The Contestant was not a winner from a previous round");
        return false;
    }


}
