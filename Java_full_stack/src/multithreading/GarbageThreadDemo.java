package multithreading;

public class GarbageThreadDemo {
    // Override finalize to observe garbage collection
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage Collector called. Object is being deleted.");
    }

    public static void main(String[] args) {
        GarbageThreadDemo obj = new GarbageThreadDemo();

        // Make object eligible for GC
        obj = null;

        // Request garbage collection
        System.gc();

        // Wait to give GC time to run
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Sleep interrupted.");
        }

        System.out.println("End of main method.");
    }
}
