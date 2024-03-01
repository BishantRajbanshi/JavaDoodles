public class AndOrNot {
  public static void main(String[] args) {
      boolean expr1 = (5 > 3);
      boolean expr2 = (8 > 5);
      boolean expr3 = (5 > 3);
      boolean expr4 = (2 > 5);
      boolean expr5 = (!(5 == 10));

      // Logical And
      boolean resultOfAND = expr1 && expr2;
      System.out.println("Logical AND: " + resultOfAND);

      // Logical Or
      boolean resultOfOR = expr3 || expr4;
      System.out.println("Logical OR: " + resultOfOR);

      // Logical Not
      boolean resultOfNOT = !expr5;
      System.out.println("Logical NOT: " + resultOfNOT);
  }
}


