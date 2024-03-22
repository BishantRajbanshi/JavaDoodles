class Animal {
  String name;
  int age;

  Animal(String name, int age) {
      this.name = name;
      this.age = age;
  }
}

class Dog extends Animal {
  String breed;

  Dog(String name, int age, String breed) {
      super(name, age);
      this.breed = breed;
  }
}

public class Main {
  public static void main(String[] args) {
      Animal animal1 = new Animal("Max", 5);
      System.out.println("Animal - Name: " + animal1.name + " Age: " + animal1.age);

      Dog dog1 = new Dog("Buddy", 3, "Labrador");
      System.out.println("Dog - Name: " + dog1.name + " Age: " + dog1.age + " Breed: " + dog1.breed);
  }
}
