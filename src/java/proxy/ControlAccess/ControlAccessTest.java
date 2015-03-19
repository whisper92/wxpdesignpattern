import java.lang.reflect.Proxy;

public class ControlAccessTest {
  public static void main(String[] args){
      User ruser = generateUser("root",0);
      User rootUser = (User)getRootUserProxy(ruser);
      rootUser.setName("www");
      rootUser.getName();

      rootUser.sendNotification("I am rootuser");
      try {
        rootUser.setId(1);
        System.out.println("rootUser.notification : "+rootUser.receiveNotification());
      } catch (Exception e) {
        System.out.println("can not access");
      }
      System.out.println("rootUser.id : "+rootUser.getId());

      User cuser = generateUser("wxp",1);
      User commonUser = (User)getCommonUserProxy(cuser);
      commonUser.setName("ppp");
      commonUser.getName();

      try {
        commonUser.setId(2);
        commonUser.sendNotification("I am commonuser");
      } catch (Exception e) {
        System.out.println("can not access");
      }
      System.out.println("commonuser.id : "+commonUser.getId());
      System.out.println("commonUser.notification : "+commonUser.receiveNotification());
  }

  public static User getRootUserProxy(User user){
      return (User)Proxy.newProxyInstance(user.getClass().getClassLoader(),user.getClass().getInterfaces(),new RootUserInvocationHandler(user));
  }

  public static User getCommonUserProxy(User user){
    return (User)Proxy.newProxyInstance(user.getClass().getClassLoader(),user.getClass().getInterfaces(),new CommonUserInvocationHandler(user));
  }

  public static User generateUser(String name,int id){
    User user = new UserImpl();
    user.setName(name);
    user.setId(id);
    user.sendNotification("Welcome To whisper ~");
    return user;
  }
}
