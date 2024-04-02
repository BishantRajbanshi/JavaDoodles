public class Bird implements LivingeBeing{

  @Override
  public void breathe() {
    System.out.println("They use nose");
  }

  @Override
  public void eat() {
    System.out.println("They eat insects");
  }

  @Override
  public void repeat() {
    System.out.println("Repeat");
  }

  @Override
  public void specialFeature() {
    System.out.println("They can fly");
  }
}


