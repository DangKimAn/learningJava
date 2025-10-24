package study.fileHandling.ex4;

import java.util.*;
import java.io.File;
import java.io.IOException;
import java.lang.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Main {

  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    Path iPath = Paths.get("/home/kiman/code/java-learn/study/fileHandling/ex3/output.txt");
    Path oPath = Paths.get("/home/kiman/code/java-learn/study/fileHandling/ex4/output.txt");
    // File iFile = new File(iPath + "/input.txt");
    // File oFile = new File(oPath + "/output.txt");
    //
    Files.copy(iPath, oPath, StandardCopyOption.REPLACE_EXISTING);
    System.out.println("Sao chep thanh cong ");
  }
}
