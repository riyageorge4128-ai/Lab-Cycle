import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReadScanner {
    public static void main(String[] args) {
        String filename = "test_scanner.txt";

        // Create sample file if it doesn't exist
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("Hello from FileReadScanner!\n");
            writer.write("Java File Handling using Scanner.\n");
            writer.write("Line 3 of sample data.\n");
        } catch (IOException e) {
            System.out.println("Error creating sample file: " + e.getMessage());
        }

        // Read the file using Scanner
        File file = new File(filename);
        try (Scanner sc = new Scanner(file)) {
            System.out.println("Reading contents of " + filename + ":");
            System.out.println("----------------------------------------");
            int lineNum = 1;
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println("Line " + lineNum + ": " + line);
                lineNum++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
