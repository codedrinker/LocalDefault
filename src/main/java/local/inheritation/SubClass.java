package local.inheritation;

/**
 * Created by codedrinker on 3/21/16.
 */
public class SubClass extends SuperClass {
    private Integer age;

    public SubClass() {
        this.age = 12;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return this.getId() + this.getName() + this.getAge();
    }
}
