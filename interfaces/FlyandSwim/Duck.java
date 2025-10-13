
package myLearn.interfaces.FlyandSwim;

public class Duck implements Flyable , Swimmable{

  @Override
  public  void fly(){
    System.out.println("Duck is flapping swing and flying ");
  }

  public  void swim()
  {
    System.out.println("Duck is padding and swimming");

  }
}


