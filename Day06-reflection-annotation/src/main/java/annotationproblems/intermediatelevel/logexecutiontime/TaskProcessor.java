package annotationproblems.intermediatelevel.logexecutiontime;

public class TaskProcessor {

        @LogExecutionTime
        public void performTaskA() {
            try {
                Thread.sleep(500);
                System.out.println("Task A performed.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        @LogExecutionTime
        public void performTaskB() {
            try {
                Thread.sleep(300);
                System.out.println("Task B performed.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public void performTaskC() {
            System.out.println("Task C performed (not logged).");
        }
    }


