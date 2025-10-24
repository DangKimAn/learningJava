package study.optional.notnullpointerexception;

import java.util.*;
import java.lang.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Nhap bien : ");
    String name = sc.nextLine();
    Optional<String> check = Optional.ofNullable(name.isEmpty() ? null : name);
    System.out.println(check.map(String::toUpperCase).orElse("Khong co ten "));
  }
}
