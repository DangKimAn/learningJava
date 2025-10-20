package myLearn.exceptionHandling.throwException;
import java.util.*; 
import java.lang.*;

public class Main {


  static double tinhCanBacHai(double t) throws IllegalArgumentException

  {

    double x= Math.sqrt(t);
    return x;
  }
	public static void main(String []args)
  {
       try {
        System.out.println(tinhCanBacHai(2));
        
        System.out.println(tinhCanBacHai(-2));

        System.out.println("thanh cong");
       } catch (Exception e) {
         //TODO: handle exception
         System.out.println("Khong thanh cong");
       }
      
	}
}
