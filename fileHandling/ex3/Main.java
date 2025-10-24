package study.fileHandling.ex3;

import java.util.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.rmi.server.ExportException;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    FileReader fi;
    FileWriter fo;
    try {
      Path ipPath = Paths.get("/home/kiman/code/java-learn/study/fileHandling/ex2/");
      fi = new FileReader(ipPath + "/input.txt");
      Path oPath = Paths.get("/home/kiman/code/java-learn/study/fileHandling/ex3/");

      fo = new FileWriter(oPath + "/output.txt");
      int x, cnt = 2;
      fo.write((int) '1');
      fo.write((int) ' ');
      while ((x = fi.read()) != -1) {
        fo.write(x);
        if (x == (int) '\n') {
          fo.write(String.format("%d ", cnt));
          cnt++;

        }
        fo.flush();
      }

      System.out.println("xuat file thanh cong ");
    } catch (IOException e) {
      System.out.println("Khong the mo file");

    } catch (Exception e) {
      System.out.println("Loi khac ");
    } finally {
      //
      // if (fi != null)
      // fi.close();
      //
      // if (fo != null)
      // fo.close();
    }

  }
}
