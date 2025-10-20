package myLearn.exceptionHandling.readfile;
import java.util.*; 
import java.lang.*;
import java.io.FileReader;
import java.io.IOException;

public class Main {


	public static void main(String []args)
  {
			 Scanner sc = new Scanner(System.in);

      FileReader reader = null;
      String namefile = "testFile.txt";

      try {
        System.out.println("try to open : "+  namefile);

        reader = new FileReader(namefile);
      } catch (IOException e) {
        System.out.println("Khong the mo file ");
        //TODO: handle exception
      }
      finally{
        if(reader != null)
        {
          try{
          reader.close();
          System.out.println("Close file ");
          }
          catch(IOException e)
          {
            System.err.println("Loi khi dong tai nguyen " );
          }
        }
        else{
          System.out.println("reader la null , khong can dong");
        }
      }


      System.out.println("ket thuc chuong trinhf");
	}
}
