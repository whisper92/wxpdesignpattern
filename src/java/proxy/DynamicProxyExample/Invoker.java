import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
public class Invoker implements InvocationHandler {
  AbstractClass ac;
  public Invoker(AbstractClass ac){
    this.ac = ac;
  }

  @Override
  public Object invoke(Object proxy,Method method,Object[] args) throws Throwable{
    method.invoke(ac,args);
    return null;
  }
}
