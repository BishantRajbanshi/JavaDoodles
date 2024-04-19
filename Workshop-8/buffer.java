import java.io.*;

public class buffer {
    public static void main(String[] args) throws IOException {
        String sourceFileName = "one.txt";
        String destinationFileName = "two.txt";

        BufferedInputStream txt = new BufferedInputStream(new FileInputStream(sourceFileName));
        BufferedOutputStream txts = new BufferedOutputStream(new FileOutputStream(destinationFileName));

        byte[] buffer = new byte[1024];
        int bytesRead;
        while ((bytesRead = txt.read(buffer)) != -1) {
            txts.write(buffer, 0, bytesRead);
        }

        System.out.println("File copied successfully.");

        txt.close();
        txts.close();
    }
}


