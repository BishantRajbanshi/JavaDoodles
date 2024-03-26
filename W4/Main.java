package W4;
// Question no 1

// class Animal{
//   String name;
//   int age;

//   Animal(String name, int age){
//     this.name = name;
//     this.age = age;
//   }
// }

// class Dog extends Animal{
//   String breed;

//   Dog(String name, int age, String breed){
//     super(name,age);
//     this.breed = breed;
//   }
// }

// public class Main {
//   public static void main(String[] args){
//     Animal animal1 = new Animal("Dog",5);
//     System.out.println("Animal - Name: " + animal1.name + "\n Age:" + animal1.age);

//     Dog dog1 = new Dog("Tommy", 3, "Shelby");
//       System.out.println("Dog - Name: " + dog1.name + "\n Age: " + dog1.age + " \nBreed: " + dog1.breed);
//   }
// }

//2//
// import java.lang.Math;

// class Shape {
//     public double getPerimeter() {
//         return 0.0; 
//     }
//     public double getArea() {
//         return 0.0;
//     }
// }
// // Circle subclass
// class Circle extends Shape {
//     private double radius;

//     public Circle(double radius) {
//         this.radius = radius;
//     }

//     @Override
//     public double getPerimeter() {
//         return 2 * Math.PI * radius;
//     }

//     @Override
//     public double getArea() {
//         return Math.PI * Math.pow(radius, 5);
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Circle circle = new Circle(7);
//         System.out.println("Perimeter of the circle: " + circle.getPerimeter());
//         System.out.println("Area of the circle: " + circle.getArea());
//     }
// }

//3//
