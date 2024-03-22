package t4;
public class Box {
  private double width;
  private double height;
  private double depth;

  // Constructor for a cube
  public Box(double length) {
      this.width = length;
      this.height = length;
      this.depth = length;
  }

  // Constructor for a cuboid
  public Box(double length, double breadth, double height) {
      this.width = length;
      this.height = breadth;
      this.depth = height;
  }

  // No-argument constructor
  public Box() {
      this.width = 10;
      this.height = 8;
      this.depth = 12;
  }

  // Method to calculate and print the volume
  public void getVolume() {
      double volume = width * height * depth;
      System.out.println("Volume of the box is: " + volume);
  }

  public static void main(String[] args) {
      // For a cube
      Box cube = new Box(5);
      System.out.println("Cube:");
      cube.getVolume();

      // For a cuboid
      Box cuboid = new Box(10, 5, 3);
      System.out.println("\nCuboid:");
      cuboid.getVolume();

      // For no parameter
      Box defaultBox = new Box();
      System.out.println("\nDefault Box:");
      defaultBox.getVolume();
  }
}
