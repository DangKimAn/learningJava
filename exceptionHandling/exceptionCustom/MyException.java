package myLearn.exceptionHandling.exceptionCustom;

import java.util.*;
import java.lang.*;

public class MyException extends Exception {

  public MyException(String message) {
    super(message);

  }

  //
  // @Override
  // public static String getMessage() {
  // return this.message;
  // }
  //
  static void checkage(int age) throws MyException {

    if (age < 18)
      throw new MyException("tuoi duoi 18 khong hop le");
    else
      System.out.println("tuoi hop le");
  }

  public static void main(String[] args) {
    try {
      checkage(18);

    } catch (MyException e) {
      System.out.println("Loi" + e.getMessage());

    }

  }
}
