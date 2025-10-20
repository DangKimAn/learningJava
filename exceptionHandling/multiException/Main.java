package myLearn.exceptionHandling.multiExccption;
import java.util.*; 
import java.lang.*;
public class Main {


	public static void main(String []args)
	{
			 Scanner sc = new Scanner(System.in);

      System.out.println("nhap so ban muon :");
      try {
       int x = Integer.parseInt(sc.nextLine());
        
        int [] a = new int [10];
        for(int i  =0  ; i < 10; i++)
          a[i] = i;

        System.out.println(a[x]);
      
      } catch ( ArrayIndexOutOfBoundsException e) {
        System.out.println("Tran bo nho ");
        //TODO: handle exception
      } catch ( NumberFormatException e)
      {
        System.out.println(" Khong phai la so, vui long nhap lai ");
      }

      System.out.println(" Chuong trinh ket thuc ");
  }
}
