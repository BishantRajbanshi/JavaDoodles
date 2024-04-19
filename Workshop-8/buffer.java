import java.io.*;

public class buffer {
    public static void main(String[] args) throws IOException {
        String sourceFileName = "one.txt";
        String destinationFileName = "two.txt";

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFileName));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destinationFileName));

        byte[] buffer = new byte[1024];
        int bytesRead;
        while ((bytesRead = bis.read(buffer)) != -1) {
            bos.write(buffer, 0, bytesRead);
        }

        System.out.println("File copied successfully.");

        bis.close();
        bos.close();
    }
}
