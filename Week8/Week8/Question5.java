import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Question5 {
    public static void main(String[] args) {
        String sourceFileName = "one.txt";
        String destinationFileName = "two.txt";

        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFileName));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destinationFileName));

            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }

            System.out
                    .println("Content copied from " + sourceFileName + " to " + destinationFileName + " successfully.");

            bis.close();
            bos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}