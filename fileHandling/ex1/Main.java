package study.fileHandling.ex1;

import java.util.*;
import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

//Kiem tra xem file input.txt co ton tai hay khong ?
public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Path path = new
    // Paths.get("/home/kiman/code/java-learn/study/fileHandling/ex1");
    System.out.println("Nhap ten file : ");
    String nameFile = sc.nextLine();
    Path path = Paths.get("/home/kiman/code/java-learn/study/fileHandling/ex1/");

    File file = new File(String.format("%s/%s", path, nameFile));

    if (file.exists()) {

      System.out.println(file.getName());
      System.out.println(file.getTotalSpace());
      // System.out.println(file.getUsableSpace);
      System.out.println(file.getPath());
      // System.out.println("File ton tai ");
    } else
      System.out.println("File khong ton tai ");
  }
}
