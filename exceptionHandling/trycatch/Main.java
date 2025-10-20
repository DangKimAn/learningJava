package myLearn.exceptionHandling.trycatch;

import java.util.*;
public class Main {


	public static void main(String []args)
	{

    int a,b;
    Scanner sc = new Scanner(System.in);
    a = sc.nextInt();
    b = sc.nextInt();
    try {
      System.out.println(a/b);
    } catch (ArithmeticException e) {
      //TODO: handle exception
      System.out.println("khong the chia cho 0");
    }
	
	}
}
