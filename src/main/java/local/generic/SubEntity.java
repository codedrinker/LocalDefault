package local.generic;

/**
 * Created by codedrinker on 3/13/16.
 */
public class SubEntity extends Entity {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    @Override
    public String toString() {
        return "SubEntity{" +
                "name='" + name + '\'' +
                '}';
    }
}
