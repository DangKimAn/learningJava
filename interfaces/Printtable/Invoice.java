package myLearn.interfaces.Printtable;

public class Invoice implements  Printable{
    int num ;
    public Invoice(){}

    public Invoice(int num){
        this.num=num;
    }
    @Override
    public void printDetails(){
        //throw new UnsupportedOperationException("Not supported yet.");
        System.out.println("In hoa don : " + this.num);
    }

}
