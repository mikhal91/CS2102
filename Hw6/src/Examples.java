import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.rules.ExpectedException;
import java.util.LinkedList;

public class Examples {


    // method to set up a ballot and cast votes

    ElectionData Setup1() {

        ElectionData ED = new ElectionData();

        // put candidates on the ballot
        try {

            ED.addCandidate("gompei");
            ED.addCandidate("husky");
            ED.addCandidate("ziggy");

        } catch (Exception e) {
        }

        // cast votes

        try {

            ED.processVote("gompei", "husky", "ziggy");
            ED.processVote("gompei", "husky", "ziggy");
            ED.processVote("ziggy", "husky", "gompei");
            ED.processVote("husky", "ziggy", "gompei");

        } catch (Exception e) {
        }

        return (ED);

    }

    // now run a test on a specific election
    @Test
    public void testMostFirstWinner() {
        assertEquals("gompei", Setup1().findWinnerMostFirstVotes());
    }

    @Test
    public void testFindWinnerMostPoints() throws UnknownCandidateException, DuplicateVotesException, CandidateExistsException {
        assertEquals("husky", Setup1().findWinnerMostPoints());
    }


    // method to set up a ballot and cast votes

    ElectionData Setup2() {

        ElectionData ED2 = new ElectionData();

        // put candidates on the ballot
        try {

            ED2.addCandidate("gompei");
            ED2.addCandidate("husky");
            ED2.addCandidate("ziggy");

        } catch (Exception e) {
        }

        // cast votes

        try {

            ED2.processVote("gompei", "ziggy", "husky");
            ED2.processVote("gompei", "ziggy", "husky");
            ED2.processVote("husky", "ziggy", "gompei");
            ED2.processVote("husky", "ziggy", "gompei");
            ED2.processVote("ziggy", "gompei", "husky");

        } catch (Exception e) {

        }

        return (ED2);

    }

    //Don't know why this won't work, but it's not our issue. Too bad!
    @Test
    public void testTiedWinnerPoints() {
        assertEquals("Runoff required", Setup2().findWinnerMostFirstVotes());
    }
    // method to set up a ballot and cast votes

    ElectionData Setup3() throws UnknownCandidateException, DuplicateVotesException, CandidateExistsException{

        ElectionData ED3 = new ElectionData();

        // put candidates on the ballot
        try {

            ED3.addCandidate("gompei");
            ED3.addCandidate("husky");
            ED3.addCandidate("ziggy");

        } catch (Exception e) {

        }

        // cast votes

        try {

            ED3.processVote("gompei", "a", "ziggy");
            ED3.processVote("gompei", "ziggy", "husky");
            ED3.processVote("husky", "gompei", "ziggy");

        } catch (Exception e) {
            System.out.println("error, unknown candidate. please vote again");
            throw e;
        }

        return (ED3);
    }


    ElectionData Setup4() throws UnknownCandidateException, DuplicateVotesException, CandidateExistsException{

        ElectionData ED4 = new ElectionData();

        // put candidates on the ballot
        try {

            ED4.addCandidate("gompei");
            ED4.addCandidate("husky");
            ED4.addCandidate("ziggy");

        } catch (Exception e) {
        }

        // cast votes

        try {

            ED4.processVote("gompei", "gompei", "ziggy");
            ED4.processVote("gompei", "ziggy", "husky");
            ED4.processVote("husky", "gompei", "ziggy");

        } catch (Exception e) {
            System.out.println("error, duplicate candidate, please vote again");
            throw e;

        }

        return (ED4);
    }

    ElectionData Setup5() throws UnknownCandidateException, DuplicateVotesException, CandidateExistsException{

        ElectionData ED5 = new ElectionData();

        // put candidates on the ballot
        try {

            ED5.addCandidate("gompei");
            ED5.addCandidate("husky");
            ED5.addCandidate("ziggy");
            ED5.addCandidate("ziggy");

        } catch (Exception e) {
            System.out.println("error, Candidate already exists, please vote again");
            throw e;
        }

        // cast votes

        try {

            ED5.processVote("gompei", "husky", "ziggy");
            ED5.processVote("gompei", "ziggy", "husky");
            ED5.processVote("husky", "gompei", "ziggy");

        } catch (Exception e) {

        }

        return (ED5);
    }



    //UnknownCandidateException, DuplicateVotesException, CandidateExistsException



    @Test(expected= UnknownCandidateException.class)
    public void UnknownTest() throws UnknownCandidateException, DuplicateVotesException, CandidateExistsException
    {
        Setup3().findWinnerMostPoints();
    }

    @Test(expected= DuplicateVotesException.class)
    public void DuplicateTest() throws UnknownCandidateException, DuplicateVotesException, CandidateExistsException
    {
        Setup4().findWinnerMostPoints();
    }
    @Test(expected= CandidateExistsException.class)
    public void ExistsTest() throws UnknownCandidateException, DuplicateVotesException, CandidateExistsException
    {
        Setup5().findWinnerMostPoints();
    }






}




