import java.util.LinkedList;
import java.util.Scanner;
import java.util.HashMap;

class ElectionData {
   // LinkedList<String> ballot = new LinkedList<String>();
 //   LinkedList<String> votes = new LinkedList<String>();
    Scanner keyboard = new Scanner(System.in);

    private HashMap<String, Integer> firstHash = new HashMap<String, Integer>();
    private HashMap<String, Integer> secondHash = new HashMap<String, Integer>();
    private HashMap<String, Integer> thirdHash = new HashMap<String, Integer>();

    ElectionData() {
    }

    public LinkedList<String> getBallot(){
        return new LinkedList<String>(firstHash.keySet());
    }

    /**
     * This method processes and adds votes to the corresponding candidate..
     * @throws UnknownCandidateException and DuplicateVotesException when either a vote is added to an unknown candidate or multipel votes for a single candidate in one ballot.
     **/
    public void processVote(String first, String second, String third) throws UnknownCandidateException, DuplicateVotesException {
        LinkedList<String> nameCheck = new LinkedList<>();
        nameCheck.add(first);
        nameCheck.add(second);
        nameCheck.add(third);

        for (String names : nameCheck) {
            if (firstHash.containsKey(names) == false) {
                throw new UnknownCandidateException(names);
            }
        }
        if ((first.equals(second)) || (first.equals(third)) || (second.equals(third))) {
            throw new DuplicateVotesException(first);
        }
        else {
            firstHash.replace(first, (firstHash.get(first) + 1));
            secondHash.replace(second, (secondHash.get(second) + 1));
            thirdHash.replace(third, (thirdHash.get(third) + 1));
        }
    }

    /**
     * This method adds a candidate to the ballot.
     * @throws CandidateExistsException when the candidate already exists.
     **/
    public void addCandidate(String candidate) throws CandidateExistsException {
        if (firstHash.containsKey(candidate)) {
            throw new CandidateExistsException(candidate);
        } else {
            firstHash.put(candidate, 0);
            secondHash.put(candidate, 0);
            thirdHash.put(candidate, 0);
        }
    }

    public String findWinnerMostFirstVotes() {
        double firstVotes = 0;
        double totalVotes = 0;
        boolean tie = false;
        String winner = "";

        LinkedList<String> voteCount = new LinkedList<String>(firstHash.keySet());

        for(String name: voteCount) {
            totalVotes = totalVotes + firstHash.get(name);
            if (firstHash.get(name) == firstVotes) {
                tie = true;
            }
            if (firstHash.get(name)> firstVotes) {
                firstVotes = firstHash.get(name);
                winner = name;
                tie = false;
            }
        }
        if (tie) {
            return "Runoff required";
        }
        if ((firstVotes/totalVotes) >= .5) {
            return winner;
        }
        return "Runoff required";
    }


// first =3  second=2, third=1
    public String findWinnerMostPoints() {
        String winner = "";
        int pointCount = 0;

       LinkedList<String> voteCount = new LinkedList<String>(firstHash.keySet());

        for(String name: voteCount) {
           int points = ((firstHash.get(name)*3) + ((secondHash.get(name)*2)) + (thirdHash.get(name)));

           if(points>pointCount) {
               pointCount = points;
               winner = name;
           }
    }
        return winner;
}







}






