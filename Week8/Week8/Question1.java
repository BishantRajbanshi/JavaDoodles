import java.io.File;
import java.io.IOException;

public class Question1 {
    public static void main(String[] args) {

        String fileName = "filename.txt";

        File file = new File(fileName);

        String retrievedFileName = file.getName();
        System.out.println("File name: " + retrievedFileName);

        String absolutePath = file.getAbsolutePath();
        System.out.println("Absolute path: " + absolutePath);

        if (file.exists()) {
            System.out.println("File exists.");

            if (file.canRead()) {
                System.out.println("Read permission: Yes");
            } else {
                System.out.println("Read permission: No");
            }

            if (file.canWrite()) {
                System.out.println("Write permission: Yes");
            } else {
                System.out.println("Write permission: No");
            }
        } else {
            System.out.println("File does not exist.");
        }

    }
}