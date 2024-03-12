class car{
  String name;
  String color;
  int price;

  void getDetails(){
    System.out.println("The name of the car is: "+ name);
    System.out.println("Color: "+ color);
    System.out.println("Price: $"+ price);
  }
}

public class cars {
  public static void main(String[] args) {
    car Dodge = new car();
    Dodge.name = "Hellcat";
    Dodge.color = "Black";
    Dodge.price = 20000;

    // System.out.println(Dodge.name);
    // System.out.println(Dodge.color);
    // System.out.println(Dodge.price);

    Dodge.getDetails();
  }
}
