public class SumandAv {
  public static void main(String[] args) {
    double[] number = {1, 2.2, 51, 44, 2};

    System.out.println("Here is the sum: ");
    double sum = sumArr(number);
    System.out.println(sum);

    System.out.println("Here is your average: ");
    double average = sum / number.length;
    System.out.println(average);
  }

  static double sumArr(double[] number) {
    double sums = 0;
    for (double i : number) {
      sums += i;
    }
    return sums;
  }
}


