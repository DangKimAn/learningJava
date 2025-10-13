package myLearn.interfaces.DataProcessor;

public interface DataProseccor {
    public abstract void process(String data);

    public default  void logTime()
    {
        System.out.println(System.currentTimeMillis());
    }
}
