import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What do you want to perform: ");
        String ope = scanner.nextLine();

        System.out.print("Enter the first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble();

        if (ope.equals("add")) {
            double result = num1 + num2;
            System.out.println("Result: " + result);
        } else if (ope.equals("sub")) {
          double result = num1 - num2;
          System.out.println("Result: " + result);
        } else if (ope.equals("mul")) {
          double result = num1 * num2;
          System.out.println("Result: " + result);
        } else if (ope.equals("div")) {
          double result = num1 / num2;
          System.out.println("Result: " + result);
        } else if (ope.equals("mod")) {
          double result = num1 % num2;
          System.out.println("Result: " + result);
        }
        else {
            System.out.println("Unsupported operation.");
        }
        scanner.close();
    }
}
