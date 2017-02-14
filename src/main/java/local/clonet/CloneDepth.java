package local.clonet;

/**
 * Created by codedrinker on 10/16/16.
 */
public class CloneDepth {
    public static void main(String[] args) {
        Entity entity = new Entity();
        entity.setId("userid");
        entity.setInnerClass(new InnerClass("origin"));
        System.out.println(entity.getId());
        System.out.println(entity.getInnerClass().getId());
        Entity clone = entity.clone();
        clone.setId("cloneId");
        clone.getInnerClass().setId("clone inner");
        System.out.println(entity.getId());
        System.out.println(entity.getInnerClass().getId());

        System.out.println(clone);
    }
}

class InnerClass implements Cloneable {
    public InnerClass(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String id;

    public InnerClass clone() {
        try {
            return (InnerClass) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}

class Entity implements Cloneable {
    @Override
    public String toString() {
        return "Entity{" +
                "id='" + id + '\'' +
                ", innerClass=" + innerClass +
                '}';
    }

    public InnerClass getInnerClass() {
        return innerClass;
    }

    public void setInnerClass(InnerClass innerClass) {
        this.innerClass = innerClass;
    }

    public Entity() {
    }

    public Entity(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String id;
    private InnerClass innerClass;


    public Entity clone() {
        try {
            Entity clone = (Entity) super.clone();
            clone.setInnerClass(this.innerClass.clone());
            return clone;

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }


}
