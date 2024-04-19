import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Question8 {
    public static void main(String[] args) {
        String fileName = "existing_file.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            String textToAppend = "Tex to append.";
            writer.write(textToAppend);
            writer.newLine();

            System.out.println("Text appended successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
