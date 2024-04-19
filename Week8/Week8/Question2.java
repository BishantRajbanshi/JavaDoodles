import java.io.File;

public class Question2 {
    public static void main(String[] args) {
        String pathName = "Test1.txt";

        File file = new File(pathName);

        if (file.exists()) {
            if (file.isFile()) {
                System.out.println("The file exists.");
            } else if (file.isDirectory()) {
                System.out.println("The directory exists.");
            }
        } else {
            System.out.println("The file or directory does not exist.");
        }
    }
}