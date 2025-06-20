package multithreading;

//With Synchronization (Thread-Safe)

class Account {
    private int balance = 1000;

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " is going to withdraw $" + amount);
            try {
                Thread.sleep(100); // simulate delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " completed withdrawal. Remaining balance: $" + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " tried to withdraw $" + amount + " but insufficient balance.");
        }
    }
}

public class SafeBank {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Runnable task = () -> account.withdraw(700);

        Thread t1 = new Thread(task, "User-1");
        Thread t2 = new Thread(task, "User-2");

        t1.start();
        t2.start();
    }
}
