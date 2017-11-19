package local.classloadert;

/**
 * Created by codedrinker on 19/11/2017.
 */
public class AClass {
    static {
        System.out.println("static in A class");
    }

    {
        System.out.println("block in A class");
    }

    public AClass() {
        System.out.println("constructor in A class ");
    }
}
