  interface CheatWife{
    public void seduceMan();
    public void happyWithMan();
  }

  class HouseWifeOne implements CheatWife {
    public void seduceMan(){System.out.println("seduceMan...");}
    public void happyWithMan(){System.out.println("happyWithMan...");}
  }

  class BussinessAgent implements CheatWife {
    private CheatWife cheatWife = null;
    public BussinessAgent(){this.cheatWife = new HouseWifeOne();}

    public BussinessAgent(CheatWife cheatWife){this.cheatWife = cheatWife;}

    public void seduceMan(){this.cheatWife.seduceMan();}

    public void happyWithMan(){this.cheatWife.happyWithMan();}
  }
public class ProxyTest{
  public static void main(String[] args){

    BussinessAgent ba  = new BussinessAgent();
    ba.seduceMan();
    ba.happyWithMan();

  }

}
