import java.util.Scanner;

public class AreaOfTriangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the value of a: ");
    double a = sc.nextDouble();

    System.out.println("Enter the value opf b: ");
    double b = sc.nextDouble();

    System.out.println("Enter the value of c: ");
    double c = sc.nextDouble();

    double s = (a+b+c)/2;
    double area = Math.sqrt(s * (s-a) * (s-b) * (s-c));

    System.out.println("The area of the triangle is: "+ area);
    sc.close();
  }
}



