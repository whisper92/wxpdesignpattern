import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class RootUserInvocationHandler implements InvocationHandler {

  private User userObj;
  public RootUserInvocationHandler(User user){
    this.userObj = user;
  }

  public Object invoke(Object proxy,Method method,Object[] args) throws Throwable{
    if (method.getName().equals("getName")
        || method.getName().equals("setName")
        || method.getName().equals("getId")
        || method.getName().equals("sendNotification")) {
            return method.invoke(userObj,args);
    } else if (method.getName().equals("setId") || method.getName().equals("receiveNotification")) {
        throw new IllegalAccessException("access deny");
    } else {
        System.out.println("non method invoke");
        return null;
    }

  }

}
