package study.fileHandling.ex5;

import java.util.*;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.lang.*;

public class Main {
  static int character = 0, word = 0;

  static void count2(String ip) {

    String[] t = ip.split("\\s+");

    word += t.length;
    for (var x : t) {
      for (int i = 0; i < x.length(); i++) {
        if (((int) x.charAt(i) >= 65 && (int) x.charAt(i) <= 90)
            || ((int) x.charAt(i) >= 97 && (int) x.charAt(i) <= 122))
          character++;
      }
    }

  }

  public static void main(String[] args)
      throws IOException {

    Scanner sc = new Scanner(System.in);

    // BufferedInputStream ip = new BufferedInputStream(new
    // FileInputStream("/home/kiman/code/java-learn/study/fileHandling/ex5/input.txt"));
    //
    BufferedReader reader = new BufferedReader(
        new FileReader("/home/kiman/code/java-learn/study/fileHandling/ex5/input.txt"));

    int count = 0;
    String ip;
    while ((ip = reader.readLine()) != null) {

      if (ip.equalsIgnoreCase("\n") == false)
        count++;
      count2(ip);
    }

    System.out.println(count);

    System.out.println(character);
    System.out.println(word);
  }
}
