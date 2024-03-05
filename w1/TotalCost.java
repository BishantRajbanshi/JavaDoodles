import java.util.Scanner;

public class TotalCost {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the quantity of an item: ");
    int Q = sc.nextInt();

    System.out.print("Enter the price of an item: ");
    Double P = sc.nextDouble();

    Double totalcost = P * Q;

    System.out.print("The Total cost is: "+ totalcost);
    sc.close();
  }
}


