package myLearn.interfaces.Printtable;

public class Book implements  Printable{
    String name;
    public Book(){

    }
    public Book(String name){
        this.name = name;
    }
    @Override
    public void printDetails(){
        System.out.println("in sach : " +  this.name);
    }
}
