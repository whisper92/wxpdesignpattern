public class StrategyExample {



  static class Context {
    Strategy strategy;
    public Context(Strategy strategy) {
      this.strategy = strategy;
    }

    public void execute(){
      strategy.execute();
    }
  }
  public static void main(String[] args){
    Context c1 = new Context(new FirstStrategy());
    Context c2 = new Context(new SecondStrategy());
    c1.execute();
    c2.execute();
  }

}
interface Strategy {
    public void execute();
  }

  class FirstStrategy implements Strategy{
    public void execute(){
      System.out.println("FirstStrategt...");
    }
  }

  class SecondStrategy implements Strategy{
    public void execute(){
      System.out.println("SecondStrategy...");
    }
  }
