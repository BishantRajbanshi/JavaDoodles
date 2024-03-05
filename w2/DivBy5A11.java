public class DivBy5A11 {
  public static void main(String[] args) {
    int num = 11;

    if (num % 5 == 0 && num % 11 == 0){
      System.out.println("The number is divisible by both 5 and 11");
    }else{
      System.out.println("The number is not divisible by 5 and 11");
    }
  }
}
