public class LegoRobotTeam implements IContestant {
    IContestant team;
    String school;
    String feature;
    double previousScore;
    double score;


    LegoRobotTeam(String school, String feature, double previousScore) {
        this.school = school;
        this.feature = feature;
        this.previousScore = previousScore;
    }
    
    


    public boolean expectToBeat(LegoRobotTeam legorobotteam2) {
        if (this.previousScore > legorobotteam2.previousScore) {
            return true;
        } else
            return false;
    }


    public LegoRobotTeam() {
    }
}


