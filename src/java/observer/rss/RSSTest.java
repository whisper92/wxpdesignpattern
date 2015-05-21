
public class RSSTest {
    public static void main(String[] args) {
        IRSSServerWatched server = new ConcretRSSServerWatched();

        IClientWatcher watcherOne = new ConcretClientWatcher();
        IClientWatcher watcherTwo = new ConcretClientWatcher();
        IClientWatcher watcherThree = new ConcretClientWatcher();

        server.addWatcher(watcherOne);
        server.addWatcher(watcherTwo);
        server.addWatcher(watcherThree);
        server.publishContent("更新的是天气预报。。。");
    }
}
