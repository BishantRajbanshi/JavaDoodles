// import java.io.BufferedInputStream;
// import java.io.FileInputStream;
// import java.io.IOException;

// public class tutorial{
//   public static void main(String[] args) {
//     try {
//       String filePath = "Tutorial8.txt";
//       FileInputStream inputStream = new FileInputStream(filePath);
//       BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);

//       byte[] bytes = bufferedInputStream.readAllBytes();

//       for (byte i : bytes) {
//           System.out.print((char) i);
//       }

//       System.out.println(bytes);

//       bufferedInputStream.close();

//   } catch (IOException e) {
//       e.printStackTrace();
//   }
// }
// }


// import java.io.File;
// import java.io.IOException;

// public class tutorial {

//   public static boolean checkPermissions(String filename, String permission) throws IOException {
//     File file = new File(filename);
//     switch (permission) {
//       case "read":
//         return file.canRead();
//       case "write":
//         return file.canWrite();
//       default:
//         throw new IllegalArgumentException("Invalid permission: " + permission);
//     }
//   }

//   public static void main(String[] args) throws IOException {
//     String filename = "tutoriall.txt";

//     File file = new File(filename);
//     file.createNewFile();

//     String fileName = file.getName();
//     System.out.println("File name: " + fileName);

//     String absolutePath = file.getAbsolutePath();
//     System.out.println("Absolute path: " + absolutePath);

//     boolean canRead = checkPermissions(filename, "read");
//     boolean canWrite = checkPermissions(filename, "write");
//     System.out.println("Can read: " + canRead);
//     System.out.println("Can write: " + canWrite);
//   }
// }
