package study.optional.checkUser;

import java.util.*;

import study.optional.checkUser.User;

import java.lang.*;

public class Main {

  static Optional<User> findUserByName(List<User> lU, String name) {

    return lU.stream().filter(e -> e.getName().equalsIgnoreCase(name)).findFirst();

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    ArrayList<User> lU = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      User u = new User(String.format("kiman%d", i), i);
      lU.add(u);
    }
    String name = sc.nextLine();
    findUserByName(lU, name).ifPresentOrElse(
        e -> System.out.println(e.getAge()), () -> System.out.println("khong hop le "));
    // this.findUserByName(lU, "kiman04").orElse(e -> e.System.out.println("Kima
    // an"));
  }
}
