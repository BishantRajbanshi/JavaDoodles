import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Question9 {
    public static void main(String[] args) {
        String filePath = "textfile.txt";
        int wordCount = countWords(filePath);
        System.out.println("Total number of words: " + wordCount);
    }

    public static int countWords(String filePath) {
        try {
            String content = new String(Files.readAllBytes(Paths.get(filePath)));
            String[] words = content.split("\\s+");
            return words.length;
        } catch (IOException e) {
            e.printStackTrace();
            return 0;
        }
    }
}
