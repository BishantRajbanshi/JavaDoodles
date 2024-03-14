import java.util.Scanner;

public class ExamEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Do you have a medical cause? (y/n): ");
        char medicalCause = scanner.next().charAt(0);

        if (medicalCause == 'y') {
            System.out.println("You are not allowed to sit in the exam.");
        } else if (medicalCause == 'n') {
            System.out.println("You can sit in the exam.");
        } else {
            System.out.println("Invalid input. Please enter 'y' or 'n'.");
        }

        scanner.close();
    }
}



