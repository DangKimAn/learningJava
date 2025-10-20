package myLearn.enums.OrderStatus;

public class Main {

  public static void main(String[] Args) {
    OrderStatus now = OrderStatus.PENDING;
    OrderStatus old = OrderStatus.PROCESSING;
    if (now.equals(OrderStatus.PENDING))
      System.out.println("Waiting for payment verification...");

  }
}
