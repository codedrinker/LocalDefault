package local.inheritation;

/**
 * Created by codedrinker on 3/21/16.
 */
public class SuperClass {
    private Integer id;
    private String name;

    public SuperClass() {
        this.id = 1;
        this.name = "name";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public final void test() {
        System.out.println("");
    }
}
