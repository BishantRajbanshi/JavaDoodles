import java.util.Scanner;

public class OddEvenCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        switch (number % 2) {
            case 0:
                System.out.println(number + " is an even number.");
                break;
            case 1:
            case -1:
                System.out.println(number + " is an odd number.");
                break;
        }

        scanner.close();
    }
}


