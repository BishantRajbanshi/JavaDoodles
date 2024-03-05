import java.util.Scanner;
public class celtofeh {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the temperature in Celsius: ");
    Double c = sc.nextDouble();

    Double F = c * 9/5 + 32;

    System.out.println("The Fehrenheit is: "+ F );

    sc.close();
  }
}


