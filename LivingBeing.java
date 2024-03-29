public interface LivingBeing {

  void specialFeature();


public class Fish implements LivingBeing{

  @Override
  public void specialFeature(){
    System.out.println("It can swim");
  }
  
}
public class Bird implements LivingBeing{

  @Override
  public void specialFeature(){
    System.out.println("It can fly");
  }
  
}

public static void main(String[] args) {

  Fish Ish = new Fish();
  Bird Ird = new Bird();

  Ish.specialFeature();
  Ird.specialFeature();
}
}