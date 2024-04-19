import java.io.*;

public class Question4 {
    public static void main(String[] args) {
        String filePath = "test1.txt";

        try {
            FileInputStream fis = new FileInputStream(filePath);
            BufferedInputStream bis = new BufferedInputStream(fis);
            InputStreamReader isr = new InputStreamReader(bis);
            BufferedReader reader = new BufferedReader(isr);

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}