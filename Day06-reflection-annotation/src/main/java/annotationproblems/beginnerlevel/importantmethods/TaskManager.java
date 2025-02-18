package annotationproblems.beginnerlevel.importantmethods;

public class TaskManager {

        @ImportantMethod(level = "HIGH")
        public void processCriticalTask() {
            System.out.println("Processing critical task...");
        }

        @ImportantMethod(level = "LOW")
        public void processRoutineTask() {
            System.out.println("Processing routine task...");
        }

        public void performRegularTask() {
            System.out.println("Performing regular task...");
        }
    }


