package local.guava;

/**
 * Created by codedrinker on 2/29/16.
 */
public class Entity {
    private int id;
    private int pid;

    public Entity(int id, int pid) {
        this.id = id;
        this.pid = pid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }
}
