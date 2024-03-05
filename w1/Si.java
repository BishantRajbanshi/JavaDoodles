import java.util.Scanner;

public class Si {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the principal amount: ");
    Double P = sc.nextDouble();

    System.out.println("Enter the rate of interest(%): ");
    Double R = sc.nextDouble();

    System.out.println("Enter the time period(yrs):");
    Double T = sc.nextDouble();

    Double interest = (P*T*R)/100;

    System.out.println("The simple interest amount is: "+ interest);
    sc.close();
  }
}
