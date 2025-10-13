package myLearn.interfaces.DataProcessor;

public class DatabaseProseccor implements  DataProseccor{

    public DatabaseProseccor(){

    }
    @Override
    public void process(String data) {
        System.out.println("Processing data for database [date]");
    }
    
}
