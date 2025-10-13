
package myLearn.interfaces.FlyandSwim;

import java.util.*;
public class Main{
  public static void main(String []args) {
    ArrayList <Flyable> a = new ArrayList<>();
    int n ;
    System.out.println("Nhap so n : ");

    Scanner sc= new Scanner(System.in);
    n = sc.nextInt();
    for (int i  =0  ; i <= n ;i++)
    {
      if(i%2 == 0)
        a.add(new Airplane());
      else 
        a.add(new Duck());
    }

    for (var x: a)
      x.fly();

    for(var x:a)
    {
      if(x instanceof Swimmable)
      {

        Swimmable t = (Swimmable)x;
        t.swim();
      }
    }
  }
}
