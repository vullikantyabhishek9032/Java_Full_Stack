package input_output;

public class ConsoleInput {
    public static void main(String[] args) {
        java.io.Console console = System.console();
        if (console != null) {
            String username = console.readLine("Enter username: ");
            char[] password = console.readPassword("Enter password: ");
            System.out.println("Welcome, " + username);
        } else {
            System.out.println("Console not available.");
        }
    }
}
