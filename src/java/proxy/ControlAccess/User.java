public interface User {
    public String getName();

    public void setName(String name);

    public int getId();

    public void setId(int id);

    public String receiveNotification();

    public void sendNotification(String notification);
}
