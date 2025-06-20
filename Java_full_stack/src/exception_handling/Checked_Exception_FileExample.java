package exception_handling;

import java.io.*;

//File Not Found (Checked Exception)

public class Checked_Exception_FileExample {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("data.txt");
            BufferedReader reader = new BufferedReader(file);
            System.out.println(reader.readLine());
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
}
