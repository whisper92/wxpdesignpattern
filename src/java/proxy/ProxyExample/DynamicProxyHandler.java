import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
public class DynamicProxyHandler implements InvocationHandler {
  private Object mProxied;
  public DynamicProxyHandler(Object obj){
    this.mProxied = obj;
  }

  @Override
  public Object invoke(Object proxy,Method method,Object[] args) throws Throwable{
    System.out.println("invoke : Object.getClass() --> "+proxy.getClass());
    System.out.println("invoke : Method --> "+method);
    System.out.println("invoke : Object[] --> "+args);

    if (args != null){
      for (Object arg : args) {
        System.out.println("args : "+args);
      }
    }

    return method.invoke(mProxied,args);
  }


}
