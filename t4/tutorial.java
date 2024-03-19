package t4;

class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }
}

// Subclass or Derived class
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void bark() {
        System.out.println(name + " is barking");
    }
}

public class tutorial {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy");
        myDog.eat();  // inherited from Animal class
        myDog.sleep(); // inherited from Animal class
        myDog.bark(); // defined in Dog class
    }
}
