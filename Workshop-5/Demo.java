// public class Demo {
//   public static void main(String[] args) {
//       try {
//           System.out.println(10 / 0);
//       } catch (ArithmeticException e) {
//           System.out.println("Error: Division by zero");
//       }
//   }
// }


public class Demo {
  public static void main(String[] args) {
      int[] age = {10, 20, 25, 24, 28, 27, 30, 31, 32};
      try {
          System.out.println(age[9]);
      } catch (ArrayIndexOutOfBoundsException e) {
          System.out.println("Error");
      }
  }
}



