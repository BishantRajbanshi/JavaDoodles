import java.util.Scanner;

public class GenderMF {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the gender(M/F): ");
    char Gender = sc.next().charAt(0);

    switch (Gender) {
      case 'M':
        System.out.println("The gender is male");
        break;

      case 'F':
        System.out.println("The gender is female");
        break;

      default:
        System.out.println("Why are you Gay?!!");
        break;
    }
    sc.close();
  }
}
