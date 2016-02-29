package entity;

/**
 * Created by codedrinker on 2/29/16.
 */
public class CollectionTestEntity {
    private Long id;
    private Long pid;

    public CollectionTestEntity(Long id, Long pid) {
        this.id = id;
        this.pid = pid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }
}
