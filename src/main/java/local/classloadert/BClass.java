package local.classloadert;

/**
 * Created by codedrinker on 19/11/2017.
 */
public class BClass extends AClass {
    static {
        System.out.println("static in B class");
    }

    {
        System.out.println("block in B class");
    }

    public BClass() {
        System.out.println("constructor in B class ");
    }

    public static void main(String[] args) {
        new BClass();
    }
}
