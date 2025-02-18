package annotationproblems.exercise.customdemo;

public class TaskManager {

    @TaskInfo(priority = "High",assignedTo = "john doe")
    public void completeTask()
    {
        System.out.println("Task is being completed");
    }

    @TaskInfo(priority = "low", assignedTo = "jane doe")
    public void reviewTask()
    {
        System.out.println("task is under review");
    }
}
