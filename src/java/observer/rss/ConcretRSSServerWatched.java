//具体被观察者角色
import java.util.List;
import java.util.ArrayList;
public class ConcretRSSServerWatched implements IRSSServerWatched {

    private List<IClientWatcher> mWatchersList = new ArrayList<IClientWatcher>();
    public void addWatcher(IClientWatcher watcher) {
        mWatchersList.add(watcher);
    }

    public void removeWatcher(IClientWatcher watcher) {
        mWatchersList.remove(watcher);
    }

    public void publishContent(String content) {
       System.out.println("服务器更新内容啦～"); 
       for(IClientWatcher watcher : mWatchersList) {

            watcher.update(content);
        }
    }

}

