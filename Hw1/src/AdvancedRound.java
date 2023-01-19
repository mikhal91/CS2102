import java.util.LinkedList;

public class AdvancedRound extends AbsRound {

    LinkedList<Match> matches = new LinkedList<Match>();
    LinkedList<IWinner> winners = new LinkedList<IWinner>();


    public AdvancedRound(LinkedList<Match> matches, LinkedList<IContestant> contestants) {
        super();
        this.matches = new LinkedList<Match>();
        this.winners = new LinkedList<IWinner>();
    }


        public LinkedList<IContestant> getMatchWinners() {
            LinkedList<IContestant> tempList = new LinkedList<IContestant>();
            for(Match matchObject : this.matches) {
                tempList.add(matchObject.winner());
            }
            return tempList;
        }




    public int getNumWinners() {
        return getMatchWinners().size();
    }
        //return this.books.size();



 //   public boolean isWinner(IContestant contestant) {
 //       for(Match MatchObject : this.matches) {
 //           if(MatchObject.winner().equals(contestant)) {
 //               System.out.println("The Contestant was a winner from a previous round");
 //               return true;
 //           }
 //       }
 //       System.out.println("The Contestant was not a winner from a previous round");
 //       return false;
 //   }

}








