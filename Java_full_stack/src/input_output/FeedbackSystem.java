package input_output;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

//File handling 

public class FeedbackSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = "feedback.txt";

        // Step 1: Take user input
        System.out.print("Enter your feedback: ");
        String feedback = scanner.nextLine();

        // Step 2: Write feedback to file
        try (FileWriter writer = new FileWriter(fileName, true)) { // 'true' enables appending
            writer.write(feedback + "\n");
            System.out.println("Feedback saved successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // Step 3: Read and display all feedback
        System.out.println("\n All Feedback:");
        try (FileReader reader = new FileReader(fileName)) {
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            System.out.println("❌ Error reading from file: " + e.getMessage());
        }

        scanner.close();
    }
}
