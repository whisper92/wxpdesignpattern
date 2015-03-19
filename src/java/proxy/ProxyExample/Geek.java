import java.lang.reflect.Proxy;
public class Geek{
    public static void main(String[] args){
        System.out.println("--------------------   Without Proxy   --------------------");
        GAE gae = new GAE();
        System.out.println("Result is :"+gae.googlesearch("wxp"));
        System.out.println("--------------------  Use Static Proxy  --------------------");
        Search staticsearch = new GoAgent();
        System.out.println("Result is :"+staticsearch.googlesearch("wxp"));
        System.out.println("--------------------  Use Dynamic Proxy --------------------");
        DynamicProxyHandler dynamicproxyhandler = new DynamicProxyHandler(gae);
        Search dynamicproxysearch = (Search)Proxy.newProxyInstance(
            Search.class.getClassLoader(),
            gae.getClass().getInterfaces(),
            dynamicproxyhandler);
        System.out.println("Result is :"+dynamicproxysearch.googlesearch("wxp"));
    }
}
