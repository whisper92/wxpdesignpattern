import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class CommonUserInvocationHandler implements InvocationHandler {

  private User userObj;
  public CommonUserInvocationHandler(User user){
    this.userObj = user;
  }

  public Object invoke(Object proxy,Method method,Object[] args) throws Throwable{
    if (method.getName().equals("getName")
        || method.getName().equals("setName")
        || method.getName().equals("getId")
        || method.getName().equals("receiveNotification")) {
            return method.invoke(userObj,args);
    } else if (method.getName().equals("setId") || method.getName().equals("sendNotification")) {
        throw new IllegalAccessException("access deny");
    } else {
        System.out.println("non method invoke");
        return null;
    }

  }

}
