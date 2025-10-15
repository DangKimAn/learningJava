package myLearn.enums.Coin;

public enum Coin {
  PENNY(1),
  NICKEL(5),
  DIME(10),
  QUARTER(25);


  private final int value;
  private Coin(int num){
    this.value = num;
  }


public int getValue()
  {
    return this.value;
  }
}
