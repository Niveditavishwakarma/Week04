package annotationproblems.exercise.repeatabledemo;

public class BugTracker {
    @BugReport(description = "Bug in login functionality.")
    @BugReport(description = "Bug in payment gateway.")
    public void trackBugs() {
        System.out.println("Tracking bugs in the system.");
    }
}
