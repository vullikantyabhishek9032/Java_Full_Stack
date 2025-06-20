package multithreading;

public class MainThreadDemo {
    public static void main(String[] args) {
        // Get reference to the current thread
        Thread mainThread = Thread.currentThread();

        System.out.println("Thread Name: " + mainThread.getName());
        System.out.println("Thread Priority: " + mainThread.getPriority());
        System.out.println("Thread State: " + mainThread.getState());

        // Simulate some main thread work
        for (int i = 1; i <= 3; i++) {
            System.out.println("Main thread working on task " + i);
            try {
                Thread.sleep(1000); // Simulate delay
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted.");
            }
        }

        System.out.println("Main thread completed.");
    }
}
