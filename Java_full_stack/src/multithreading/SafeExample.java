package multithreading;

//With Thread Safety Using synchronized

class SafeCounter {
    int count = 0;

    public synchronized void increment() {
        count++;
    }
}

public class SafeExample {
    public static void main(String[] args) throws InterruptedException {
        SafeCounter counter = new SafeCounter();

        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final count (thread-safe): " + counter.count);
    }
}
