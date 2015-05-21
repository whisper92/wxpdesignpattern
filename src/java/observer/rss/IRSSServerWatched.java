//抽象被观察者：RSS订阅服务器
public interface IRSSServerWatched {
    public void addWatcher(IClientWatcher watcher);
    public void removeWatcher(IClientWatcher watcher);
    public void publishContent(String content);
}
