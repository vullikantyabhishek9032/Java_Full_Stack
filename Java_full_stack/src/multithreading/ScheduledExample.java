package multithreading;

import java.util.concurrent.*;

public class ScheduledExample {
    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        Runnable task = () -> System.out.println("Running at " + System.currentTimeMillis());

        // Schedule task to run after 2 seconds, then every 3 seconds
        scheduler.scheduleAtFixedRate(task, 2, 3, TimeUnit.SECONDS);
    }
}
