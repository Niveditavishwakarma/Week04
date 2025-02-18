package annotationproblems.intermediatelevel.logexecutiontime;

public class Main {
        public static void main(String[] args) {
            TaskProcessor taskProcessor = new TaskProcessor();

            MethodExecutionTimer.logExecutionTime(taskProcessor, "performTaskA");
            MethodExecutionTimer.logExecutionTime(taskProcessor, "performTaskB");
            taskProcessor.performTaskC();
        }
    }


