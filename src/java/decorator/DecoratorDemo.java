interface Action{
  public void exercise();
}
class CodeMonkey implements Action{
  public void exercise(){
    System.out.println("Man eat banaba...");
  }
}
class Exercise implements Action{
  private Action action;
  public void exercise(){
    action.exercise();
  }
}
class Run extends Exercise{
  private Action action;
  public Run(Action action){
    super();
    this.action = action;
  }

  public void exercise(){
    System.out.println("Man run and stronger...");
    action.exercise();
  }
}

class Swim extends Exercise{
  private Action action;
  public Swim(Action action){
    super();
    this.action  = action;
    // exercise();
  }
  public void exercise(){
    System.out.println("Man swim and stronger...");
    action.exercise();
  }
}

public class DecoratorDemo{
  public static void main(String[] args){
    Action man = new CodeMonkey();
    Run runman = new Run(man);
    Swim swiman = new Swim(runman);
    runman.exercise();
    swiman.exercise();
  }
}

