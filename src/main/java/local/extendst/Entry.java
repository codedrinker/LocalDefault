package local.extendst;

/**
 * Created by codedrinker on 9/23/16.
 */
class HomeTest {
    private String home = "This is HOME";

    public void printHome() {
        System.out.println(home);
    }
}

class SmallHomeTest extends HomeTest {
    private String home = "This is SMALL HOME";

}

public class Entry {
    public static void main(String[] args) {
        SmallHomeTest small = new SmallHomeTest();
        small.printHome();
        String s = Character.toString((char) 65);
        System.out.println(s);
    }
}