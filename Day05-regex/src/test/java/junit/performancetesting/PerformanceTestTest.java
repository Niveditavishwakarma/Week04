package junit.performancetesting;

import org.junit.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

public class PerformanceTestTest {
    public void longRunningTask() throws InterruptedException {
        Thread.sleep(3000);
    }

    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS)
    public void testLongRunningTask() throws InterruptedException {
        longRunningTask();
    }

}