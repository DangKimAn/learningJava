package myLearn.exceptionHandling.exceptionCustom;

import java.util.*;
import java.beans.Expression;
import java.lang.*;

public class InvalidAge extends Exception {

  public InvalidAge(String message) {
    super(message);
  }

  static void checkAge(int age) throws InvalidAge {
    if (age < 18)
      throw new InvalidAge("Chua du 18 tuoi");
    else
      System.out.println("tuoi hop le");
  }

  public static void main(String[] args) {
    try {

      checkAge(10);

      checkAge(20);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

}
