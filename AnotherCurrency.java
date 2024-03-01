import java.util.Scanner;

public class AnotherCurrency{
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter the amount in U.S. dollars: ");
      double USD = sc.nextDouble();

      System.out.print("Enter the exchange rate: ");
      double Rate = sc.nextDouble();

      double convertedAmount = USD * Rate;

      System.out.println("Converted amount: " + convertedAmount);

      sc.close();
    }
}


