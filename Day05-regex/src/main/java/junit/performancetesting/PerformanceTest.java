package junit.performancetesting;

public class PerformanceTest {
    public void longRunningTask() throws InterruptedException {
        System.out.println("Task started...");
        Thread.sleep(3000);
        System.out.println("Task completed...");
    }
    public static void main(String[] args) {

        try {
            PerformanceTest test = new PerformanceTest();
            test.longRunningTask();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
