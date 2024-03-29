// public abstract class Shape {
//     public abstract void calculateArea();
//     public abstract void calculatePerimeter();
// }

// public class Quadrilateral extends Shape {
//     private double side1;
//     private double side2;
//     private double side3;
//     private double side4;

//     public Quadrilateral(double side1, double side2, double side3, double side4) {
//         this.side1 = side1;
//         this.side2 = side2;
//         this.side3 = side3;
//         this.side4 = side4;
//     }

//     @Override
//     public void calculateArea() {
//         double base = Math.max(side1, side3);
//         double height = Math.sqrt(side2 * side2 - (0.25 * (Math.pow((side1 - side3), 2))));
//         double area = base * height;
//         System.out.println("The area of the quad is: " + area);
//     }

//     @Override
//     public void calculatePerimeter() {
//         double perimeter = side1 + side2 + side3 + side4;
//         System.out.println("The perimeter of the quad is: " + perimeter);
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         // Creating a Quadrilateral object with side lengths
//         Quadrilateral quad = new Quadrilateral(3, 4, 5, 6);

//         // Calculating and printing the area of the quadrilateral
//         quad.calculateArea();

//         // Calculating and printing the perimeter of the quadrilateral
//         quad.calculatePerimeter();
//     }
// }

public class Main {
    public static void main(String[] args) {
        Quadrilateral quad = new Quadrilateral(3, 4, 5, 6);
        quad.calculateArea();
        quad.calculatePerimeter();
    }
}
