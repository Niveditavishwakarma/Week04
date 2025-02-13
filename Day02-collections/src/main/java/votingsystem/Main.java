package votingsystem;

public class Main {
    public static void main(String[] args){
        VotingSystem votingSystem = new VotingSystem();

        votingSystem.castVote("Alice");
        votingSystem.castVote("Bob");
        votingSystem.castVote("Alice");
        votingSystem.castVote("Charlie");
        votingSystem.castVote("Bob");
        votingSystem.castVote("Alice");

        votingSystem.displayResultsAlphabetically();
        votingSystem.displayResultsByVotes();
        votingSystem.displayVoteOrder();
    }
}
