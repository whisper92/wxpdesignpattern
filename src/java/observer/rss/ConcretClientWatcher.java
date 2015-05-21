//具体观察者角色：RSS订阅客户端
public class ConcretClientWatcher implements IClientWatcher {

    public void update(String content) {
        System.out.println("客户端更新内容 : "+content);
    }
}
