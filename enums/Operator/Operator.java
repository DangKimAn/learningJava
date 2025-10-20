package myLearn.enums.Operator;

public enum Operator {

  ADD {
    @Override
    public double apply(double x, double y) {
      return x + y;
    }
  },
  SUBTRACT {
    @Override
    public double apply(double x, double y) {
      return x - y;
    }
  },
  MULTIPLY {
    @Override
    public double apply(double x, double y) {
      return x * y;
    }
  },

  DIVIDE {
    @Override
    public double apply(double x, double y) {

      try {
        return x / y;
      } catch (Exception e) {
        System.out.println("y = 0, can't devide");
        // TODO: handle exception
      }

      return -1;
    }
  };

  public abstract double apply(double x, double y);
}
