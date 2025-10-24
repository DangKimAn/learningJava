package study.fileHandling.ex2;

import java.util.*;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.lang.*;
import java.nio.file.Path;
import java.nio.file.Paths;

// Nhap tu ban phim danh sach ten sinh vien ("khong nhap exit ")
// sau do ghi vao file 
public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Path path = null;
    FileWriter file = null;
    try {

      path = Paths.get("/home/kiman/code/java-learn/study/fileHandling/ex2/");

      // FileOutputStream op = new FileOutputStream(path + "/input.txt");
      // File file = new File(String.format("%s/input.txt", path));
      // BufferedOutputStream bop = new BufferedOutputStream(op);

      System.out.println(path + "/input.txt");
      file = new FileWriter(path + "/input.txt");
      String name = "";
      while (!name.equalsIgnoreCase("exit"))

      {

        System.out.print("Nhap ten sinh vien :  ");
        name = sc.nextLine();

        file.write(name + "\n");
        file.flush();
      }
    } catch (Exception e) {
      // TODO: handle exception
      // throw new Exception(e);
      System.out.println("Khong the mo file ");
    } finally {
      //
      // if (file != null)
      // file.close();
    }
  }
}
