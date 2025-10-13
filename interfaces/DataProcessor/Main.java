package myLearn.interfaces.DataProcessor;

public class Main {
   public static void main(String[] args) {
         DatabaseProseccor dbp = new DatabaseProseccor();
        dbp.logTime();
        dbp.process(new String("xin chao"));
   }
}

