package collection;

/**
 * Created by clwang on 2/1/16.
 */
public class User{
    private String name ;
    private int priority;

    public User(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "collection.User{" +
            "name='" + name + '\'' +
            ", priority=" + priority +
            '}';
    }
}
