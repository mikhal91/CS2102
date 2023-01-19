import java.util.Scanner;


public class VotingMachine {
    Scanner keyboard = new Scanner(System.in);
    ElectionData electionData;

    VotingMachine() {
        electionData = new ElectionData();
    }

    public void printBallot() {
        System.out.println("The candidates are " + electionData.getBallot());
    }

    /**
     * This method is a scanner where a voter will input their top three candidates .
     * @throws UnknownCandidateException and DuplicateVotesException when either an unknown candidate is inputted or when a candidate is typed multiple times.
     **/
    public void screen() throws UnknownCandidateException, DuplicateVotesException {
        this.printBallot();
        System.out.println("Who do you want to vote for first place?");
        String first = keyboard.next();
        System.out.println("You voted for " + first);
        System.out.println("Who do you want to vote for second place?");
        String second = keyboard.next();
        System.out.println("You voted for " + second);
        System.out.println("Who do you want to vote for third place?");
        String third = keyboard.next();
        System.out.println("You voted for " + third);

        try {
            electionData.processVote(first, second, third);
        }
            catch(UnknownCandidateException name) {
            System.out.println("Would you like to add " + name + " to the ballot? Type Y or N");
            String response = keyboard.next();
            if((response == "y" || response == "Y")) {
                addWriteIn(name.getCandidate());
                screen();
            }
            else if ((response == "n" || response == "N")) {
                System.out.println("Please check your spelling. Thank You");
                screen();
                }
        }
        try {
            electionData.processVote(first, second, third);
        }
        catch(DuplicateVotesException e) {
            System.out.println("You cannot vote for the same candidate multiple times");
            screen();
        }
    }

    public String addWriteIn(String name) {
        try {
            electionData.addCandidate(name);
        }
            catch (CandidateExistsException names) {
                 System.out.println("Candidate Already Exists");
        }
        return "Candidate Has been Successfully added to the ballot";
    }
}
