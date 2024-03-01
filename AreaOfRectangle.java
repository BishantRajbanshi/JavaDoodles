import java.util.Scanner;

public class AreaOfRectangle {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the length of the rectamgle: ");
    Double l = scanner.nextDouble();

    System.out.println("Enter the breath of the reactangle: ");
    Double b = scanner.nextDouble();

    Double peri = 2*(l * b);
    System.err.println("The perimeter of the rectangle: " + peri);
    scanner.close();
  }
}


