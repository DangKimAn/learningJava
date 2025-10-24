package study.optional.listValidEmail;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.lang.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    List<String> email = List.of("dangkiman41005@gmail.com", "Dangkiman", "dangkima@gmail.com",
        "ki@gmail.com",
        "name@gmail.com", "an#mgmail.cmo", "thien@gmail.com", "duyn@gmail.com");

    List<String> validEmail = email.stream().filter(e -> e.endsWith("@gmail.com"))
        .collect(Collectors.toList());

    // Optional<String> valid = email.stream().filter(e ->
    // e.endsWith("@gmail.com"));

    validEmail.forEach(e -> Optional.ofNullable(e).ifPresentOrElse(t -> System.out.println(t),
        () -> System.out.println("khong hop le ")));

      
    }
  }

}
