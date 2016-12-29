package local.exception;

/**
 * Created by codedrinker on 3/27/16.
 */
public class ExceptionFinallyBlock {
    public static String test() throws Exception {
        try {
            throw new RuntimeException("");
        } catch (Exception e) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }
        return "";
    }

    public static void main(String[] args) {
        try {
            test();
        } catch (Exception e) {
            System.out.println("error");
        }
    }
}
