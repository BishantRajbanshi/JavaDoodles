import java.util.Scanner;

public class AreaOfTheSquare {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the length fo the square: ");
    Double length = scanner.nextDouble();

    Double Area  = Math.pow(length, 2);

    System.out.println("The area of the square is: "+ Area);

    scanner.close();

  }
}



