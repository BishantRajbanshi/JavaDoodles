package t4;
public class Lamp {
  private boolean isOn;

  public Lamp() {
      this.isOn = false;
  }

  public void turnOn() {
      this.isOn = true;
      System.out.println("The lamp is now turned on.");
  }

  public void turnOff() {
      this.isOn = false;
      System.out.println("The lamp is now turned off.");
  }

  public boolean isLampOn() {
      return this.isOn;
  }

  public static void main(String[] args) {
      Lamp lamp = new Lamp();
      lamp.turnOn();
      System.out.println("Is the lamp on? " + lamp.isLampOn());
      lamp.turnOff();
      System.out.println("Is the lamp on? " + lamp.isLampOn());
  }
}



