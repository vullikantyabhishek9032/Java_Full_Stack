package multithreading;

//Using the Thread Class

public class ThreadExample extends Thread {
	    public void run() {
	        System.out.println("Thread is running using Thread class.");
	    }

	    public static void main(String[] args) {
	        ThreadExample t1 = new ThreadExample();
	        t1.start(); // Starts the thread
	    }
	}
