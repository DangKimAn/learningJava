package myLearn.enums.Coin;

public class Main {

  public static void  main(String []agrs) {
    Coin penny = Coin.PENNY;
    Coin dime = Coin.DIME;
    Coin quarter = Coin.QUARTER;
    
    System.out.println("tong la  : " + (penny.getValue() + dime.getValue() + quarter.getValue()));
  }
}
