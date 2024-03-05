import java.util.Scanner;

public class BasicOP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the two integers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int add = num1 + num2;
        int sub = num1 - num2;
        int mul = num1 * num2;
        double div = (double) num1 / num2;

        System.out.println("The basic arithmetic operations are:");
        System.out.println("Addition: " + add);
        System.out.println("Subtraction: " + sub);
        System.out.println("Multiplication: " + mul);
        System.out.println("Division: " + div);

        sc.close();
    }
}


