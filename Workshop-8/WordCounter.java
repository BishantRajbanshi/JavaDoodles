import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        WordCounter wordCounter = new WordCounter();
        int wordCount = wordCounter.countWords("input.txt");
        System.out.println("Total number of words: " + wordCount);
    }

    public int countWords(String filePath) {
        int count = 0;
        try (Scanner scanner = new Scanner(new File(filePath))) {
            while (scanner.hasNext()) {
                scanner.next(); 
                count++;
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        }
        return count;
    }
}


