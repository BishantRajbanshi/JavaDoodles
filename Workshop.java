// class Animal{
//     String name;
//     int age;

//     public Animal(){
//         System.out.println("This is a Animal Constructor.");
//     }
// }

// class Dog extends Animal{
//     String breed;

//     public Dog(){
//         System.out.println("This is a Dog Constructor");
//     }
// }

// public class Workshop{
//     public static void main(String[] args) {
//         Dog dog = new Dog();
//         dog.name = "Nima";
//         dog.age = 20;
//         dog.breed = "Labrador";

//         System.out.println(dog.name + " is " + dog.age + " yrs old . His breed is " + dog.breed);
//     }
// }

//q2

// class Shape{
//     public void getArea(){
//         System.out.println("This is the area section");
//     }
//     public void getPerimeter(){
//         System.out.println("This is the perimeter section");
//     }
// }

// class Circle extends Shape{
//     public void getArea(){
//         System.out.println("This is the area of the circle.");
//     }

//     public void getPerimeter(){
//         System.out.println("This is the perimeter of the circle.");
//     }
// }

// public class Workshop{
//     public static void main(String[] args) {
//         Circle c = new Circle();
//         c.getArea();
//         c.getPerimeter();
//     }
// }

//Q3

// class Animal{
//     public Animal(String name){
//         System.out.println(name + " is an animal.");
//     }
// }

// class Dog extends Animal{
//     public Dog(String name){
//         super(name);
//         System.out.println("This is the dog constructor");
//     }
// }

// public class Workshop{
//     public static void main(String[] args) {
//         Dog dog = new Dog("Godjilla");
//     }
// }

