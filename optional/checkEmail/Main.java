package study.optional.checkEmail;

import java.util.*;
import java.lang.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhap email :  ");
    String email = sc.nextLine();
    Optional<String> check = Optional.ofNullable(email.isEmpty() ? null : email);

    check.filter(e -> e.endsWith("@gmail.com")).ifPresentOrElse(e -> System.out.println("Email hop le : " + e),
        () -> System.out.println("Khong phai emil "));
  }
}
