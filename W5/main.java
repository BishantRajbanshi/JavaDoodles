// package W5;

// abstract class Bank {
//     public abstract double getBalance();
// }

// class BankA extends Bank{
//     private double balance = 100;
//     @Override
//     public double getBalance(){
//         return balance;
//     } 
// }

// class BankB extends Bank{
//     private double balance = 150;
//     @Override
//     public double getBalance(){
//         return balance;
//     }
// }

// class BankC extends Bank{
//     private double balance = 200;
//     @Override
//     public double getBalance(){
//         return balance;
//     }
// }

// public class main {
//     public static void main(String[] args) {
//         BankA bankA = new BankA();
//         BankB bankB = new BankB();
//         BankC bankC = new BankC();

//         System.out.println("Balance in Bank A: $" + bankA.getBalance());
//         System.out.println("Balance in Bank C: $" + bankB.getBalance());
//         System.out.println("Balance in Bank C: $" + bankC.getBalance());
//     }

    
// }

// package W5;

// abstract class Shape {
//     public abstract double getRectangleArea(double l , double b);
//     public abstract double getSquareArea(double l);
//     public abstract double getCircleArea(double r);
// }

// class Area extends Shape{
//     @Override
//     public double getRectangleArea(double l ,double b){
//         return l * b ;
//     }
//     @Override
//     public double getSquareArea(double l){
//         return l * l ;
//     }
//     @Override
//     public double getCircleArea(double r){
//         return (22/7)*r*r ;
//     }
// }

// public class main {

//     public static void main(String[] args) {
//         Area area = new Area();

//         double rectangleArea = area.getRectangleArea(5, 10);
//         System.out.println("Area of rectangle: " + rectangleArea);
//         double squareArea = area.getSquareArea(5);
//         System.out.println("Area of Square: " + squareArea);
//         double circleArea = area.getCircleArea(5);
//         System.out.println("Area of Circle: " + circleArea);
//     }
// }

// Remove the constructor from the interface A.
// Ensure all methods in the interface are abstract, which means they do not have an implementation (body).

