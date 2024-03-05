import java.util.Scanner;

public class MilesToKilometers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the distance in miles: ");
        double miles = sc.nextDouble();
        
        double kilometers = miles * 1.60934;

        System.out.println("Equivalent distance in kilometers: " + kilometers);

        sc.close();
    }
}


