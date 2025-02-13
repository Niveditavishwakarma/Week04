package votingsystem;
import java.util.*;
class VotingSystem {
    private Map<String, Integer> voteCountMap = new HashMap<>();
    private Map<String, Integer> voteOrderMap = new LinkedHashMap<>();

    public void castVote(String candidate) {
        voteCountMap.put(candidate, voteCountMap.getOrDefault(candidate, 0) + 1);
        voteOrderMap.put(candidate, voteOrderMap.getOrDefault(candidate, 0) + 1);
    }

    public void displayResultsAlphabetically() {
        TreeMap<String, Integer> sortedResults = new TreeMap<>(voteCountMap);
        System.out.println("Results (Alphabetical Order): " + sortedResults);
    }

    public void displayResultsByVotes() {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(voteCountMap.entrySet());
        list.sort((a, b) -> b.getValue().compareTo(a.getValue())); // Sort by votes (desc)

        LinkedHashMap<String, Integer> sortedByVotes = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedByVotes.put(entry.getKey(), entry.getValue());
        }

        System.out.println("Results (Sorted by Votes): " + sortedByVotes);
    }

    public void displayVoteOrder() {
        System.out.println("Vote Order (First Come First Served): " + voteOrderMap);
    }
}
