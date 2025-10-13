package myLearn.enums.Operator;

public class Main {

  public static void main(String []args) {

    Operator add = Operator.ADD;
    Operator divide1 = Operator.DIVIDE;
    Operator divide2 = Operator.DIVIDE;
    System.out.println( add.apply(1,200));   
    System.out.println(divide1.apply(1,5));
    System.out.println(divide2.apply(2,0));
    
    
  }
}
