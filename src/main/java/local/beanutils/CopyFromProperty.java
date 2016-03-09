package local.beanutils;

/**
 * Created by codedrinker on 3/9/16.
 */
public class CopyFromProperty {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CopyFromProperty(String name, int i) {
        this.age = i;
        this.name = name;
    }

    @Override
    public String toString() {
        return "CopyFromProperty{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
