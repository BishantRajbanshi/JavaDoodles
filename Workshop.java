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

//q3

// class Person{
//     protected String address;
// }

// class Employee extends Person{
//     public String department;
// }

// public class Workshop{
//     public static void main(String[] args) {
//         Employee employee = new Employee();
//         employee.address = "Jakarta";
//         employee.department = "IT";

//         System.out.println("Address: " + employee.address);
//         System.out.println("Department: " + employee.department);
//     }
// }

//q4

// class Parent{
//     private String name;
//     protected int age;
//     public String address;

//     public void setName(String name){
//         this.name = name;
//     }

//     public String getName(){
//         return name;
//     }
// }

// class Child extends Parent{
//     public void setPriavteName(String name){
//         setName(name);
//     }
//     public String getPrivateName(){
//         return getName();
//     }
// }

// public class Workshop{
//     public static void main(String[] args) {
//         Child child = new Child();
//         child.age = 20;
//         child.address = "Jakarta";

//         child.setPriavteName("Bishant Rajbanshi");
//         System.out.println("Name: " + child.getPrivateName());
//         System.out.println("Age: " + child.age);
//         System.out.println("Address: " + child.address);
//     }
// }



