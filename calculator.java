import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What do you want to perform: ");
        String operation = scanner.nextLine();

        System.out.print("Enter the first number:");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number:");
        double num2 = scanner.nextDouble();
        
        double result = 0.0;

        switch (operation) {
            case "add":
                result = num1 + num2;
                break;
            case "sub":
                result = num1 - num2;
                break;
            case "mul":
                result = num1 * num2;
                break;
            case "div":
                result = num1 / num2;
                break;
            case "mod":
                result = num1 % num2;
                break;
            default:
                System.out.println("Invalid operation.");
                break;
        }

        System.out.println("Result: " + result);
        scanner.close();
    }
}