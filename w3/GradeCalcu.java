import java.util.Scanner;

public class GradeCalcu{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter marks of five subjects:");
        System.out.print("Physics: ");
        int physics = scanner.nextInt();
        System.out.print("Chemistry: ");
        int chemistry = scanner.nextInt();
        System.out.print("Biology: ");
        int biology = scanner.nextInt();
        System.out.print("Mathematics: ");
        int mathematics = scanner.nextInt();
        System.out.print("Computer: ");
        int computer = scanner.nextInt();

        int totalMarks = physics + chemistry + biology + mathematics + computer;
        double percentage = (double) totalMarks / 5;

        System.out.println("Percentage: " + percentage + "%");

        char grade;

        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else if (percentage >= 40) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        System.out.println("Grade: " + grade);

        scanner.close();
    }
}



