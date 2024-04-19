import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Question5 {
    public static void main(String[] args) {
        String sourceFileName = "one.txt";
        String destinationFileName = "two.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFileName));
             BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFileName))) {

            char[] buffer = new char[1024];
            int charsRead;

            while ((charsRead = reader.read(buffer)) != -1) {
                writer.write(buffer, 0, charsRead);
            }

            System.out.println("Content copied from " + sourceFileName + " to " + destinationFileName + " successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
