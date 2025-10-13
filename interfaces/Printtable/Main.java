package myLearn.interfaces.Printtable;

public class Main {
   public static void main(String[] args) {
     Printable []x = new Printable[10];
    for(int i =0  ; i <10; i++)

    
    {
        if(i%2 == 0)
            x[i] = new Book("" + i);
        else 
            x[i] = new Invoice(0+ i);
            
    }    

    for (var t :x )
        t.printDetails();

   }
}
