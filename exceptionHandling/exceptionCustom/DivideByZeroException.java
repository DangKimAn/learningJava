package myLearn.exceptionHandling.exceptionCustom;

import java.util.*;
import java.lang.*;

public class DivideByZeroException extends Exception {

  public DivideByZeroException(String name) {
    super(name);
  }

  static void divide(int a, int b) throws DivideByZeroException {

    if (b == 0)
      throw new DivideByZeroException("Khong the chia cho khong ");
    else {
      System.out.println(1.0 * a / b);
    }
  }

  public static void main(String[] args) {
    try {
      int a;
      int b;
      Scanner sc = new Scanner(System.in);
      a = Integer.parseInt(sc.nextLine());
      b = Integer.parseInt(sc.nextLine());
      divide(a, b);
    } catch (DivideByZeroException e) {
      System.out.println(e);
    } catch (NumberFormatException e) {
      System.out.println(e);
    }
  }

}
