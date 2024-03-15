import java.util.Scanner;

public class GradeCal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the marks: ");
        int marks = scanner.nextInt();

        char grade;

        if (marks >= 40 && marks < 50) {
            grade = 'C';
        } else if (marks >= 50 && marks < 60) {
            grade = 'C';
        } else if (marks >= 60 && marks < 70) {
            grade = 'B';
        } else if (marks >= 70 && marks < 80) {
            grade = 'B';
        } else if (marks >= 80 && marks < 90) {
            grade = 'A';
        } else if (marks >= 90) {
            grade = 'A';
        } else {
            grade = 'F';
        }

        System.out.println("Grade: " + grade);

        scanner.close();
    }
}



