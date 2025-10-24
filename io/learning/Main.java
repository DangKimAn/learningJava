package study.io.learning;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

  public static void main(String[] args) throws IOException {

    // System.out.println("study.io.learning");
    FileInputStream ip = null, image = null;
    FileOutputStream op = null, imgout = null;
    try {
      ip = new FileInputStream("/home/kiman/code/java-learn/study/io/learning/input.txt");
      image = new FileInputStream("/mnt/c/Users/Cao Đăng/Downloads/100.jpg");
      op = new FileOutputStream("/home/kiman/code/java-learn/study/io/learning/output.txt");
      imgout = new FileOutputStream("/mnt/c/Users/Cao Đăng/Downloads/output.jpg");
      BufferedInputStream bip = new BufferedInputStream(image);
      BufferedOutputStream bop = new BufferedOutputStream(imgout);
      int c;
      //
      // while ((c = bip.read()) != -1) {
      // System.out.println(c);
      // bop.write(c);
      // bop.flush();
      //
      // }
      byte[] buffer = new byte[1024];
      while ((c = bip.read(buffer)) != -1) {

        bop.write(buffer, 0, c);
      }

    } catch (Exception e) {
      // TODO: handle exception
      System.out.println("mo file that bai");
    } finally {
      if (ip != null)
        ip.close();

      if (op != null) {
        op.close();
      }

      if (imgout != null)
        imgout.close();

      if (image != null)
        image.close();
    }

  }
}
