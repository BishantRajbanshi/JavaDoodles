import java.util.Scanner;

public class oldestyoung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of people: ");
        int numPeople = scanner.nextInt();

        int oldest = Integer.MIN_VALUE;
        int youngest = Integer.MAX_VALUE;

        for (int i = 1; i <= numPeople; i++) {
            System.out.print("Enter the age of person " + i + ": ");
            int age = scanner.nextInt();

            if (age > oldest) {
                oldest = age;
            }

            if (age < youngest) {
                youngest = age;
            }
        }

        System.out.println("Oldest person's age: " + oldest);
        System.out.println("Youngest person's age: " + youngest);

        scanner.close();
    }
}


