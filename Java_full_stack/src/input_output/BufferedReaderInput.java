package input_output;

import java.io.*;

//Standard Input using BufferedReader

public class BufferedReaderInput {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter your city: ");
        String city = reader.readLine();

        System.out.println("You live in " + city);
    }
}
