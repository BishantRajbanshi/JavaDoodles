import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Student {
    private String firstName;
    private String lastName;
    private String address;
    private String contactNumber;
    private String semester;

    public Student(String firstName, String lastName, String address, String contactNumber, String semester) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.contactNumber = contactNumber;
        this.semester = semester;
    }

    public String toCSV() {
        return String.format("%s,%s,%s,%s,%s\n", firstName, lastName, address, contactNumber, semester);
    }
}

public class Question10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Address: ");
        String address = scanner.nextLine();

        System.out.print("Contact Number: ");
        String contactNumber = scanner.nextLine();

        System.out.print("Semester: ");
        String semester = scanner.nextLine();

        Student student = new Student(firstName, lastName, address, contactNumber, semester);
        writeStudentToCSV(student);

        System.out.println("Student information has been saved to student.csv");
    }

     private static void writeStudentToCSV(Student student) {
        try (FileWriter fileWriter = new FileWriter("student.csv")) {
            fileWriter.write(student.toCSV());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
