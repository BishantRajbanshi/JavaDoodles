import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberSeparator {
    
    public static void main(String[] args) {
        NumberSeparator separator = new NumberSeparator();
        List<Integer> numbers = separator.read("numbers.txt");
        
        List<Integer> evenNumbers = separator.getEven(numbers);
        List<Integer> oddNumbers = separator.getOdd(numbers);
        
        separator.write(evenNumbers, "even.txt");
        separator.write(oddNumbers, "odd.txt");
    }
    
    public List<Integer> getEven(List<Integer> numbers) {
        List<Integer> evenNumbers = new ArrayList<>();
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenNumbers.add(num);
            }
        }
        return evenNumbers;
    }
    
    public List<Integer> getOdd(List<Integer> numbers) {
        List<Integer> oddNumbers = new ArrayList<>();
        for (int num : numbers) {
            if (num % 2 != 0) {
                oddNumbers.add(num);
            }
        }
        return oddNumbers;
    }
    
    public void write(List<Integer> numbers, String filePath) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath))) {
            for (int num : numbers) {
                writer.print(num + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public List<Integer> read(String filePath) {
        List<Integer> numbers = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(filePath))) {
            while (scanner.hasNextInt()) {
                numbers.add(scanner.nextInt());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return numbers;
    }
}