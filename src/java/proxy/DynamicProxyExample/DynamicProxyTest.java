import java.lang.reflect.Proxy;
public class DynamicProxyTest {
  public static void main(String[] args){
    Invoker invoker = new Invoker(new ClassA());
    AbstractClass aca = (AbstractClass)Proxy.newProxyInstance(AbstractClass.class.getClassLoader(),
    new Class[]{AbstractClass.class},invoker);
    aca.show();

    ClassA ca = new ClassA();
    ca.show();
  }
}
