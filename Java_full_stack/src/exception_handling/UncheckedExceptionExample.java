package exception_handling;

public class UncheckedExceptionExample {
    public static void main(String[] args) {
        String userName = null;

        try {
            // Trying to call a method on a null object
            System.out.println("User name length: " + userName.length());
        } catch (NullPointerException e) {
            System.out.println("Error: Tried to access a method on a null object.");
        }

        System.out.println("Program continues after handling the exception.");
    }
}
