package local.exception;

/**
 * Created by codedrinker on 12/29/16.
 */
public class ExceptionInstanceOf {
    public static void main(String[] args) {
        try {
            new ExceptionInstanceOf().produceUncheckedException();
        } catch (Exception e) {
            if (e instanceof ClassCastException) {
                System.out.println("ClassCastException");
            } else {
                System.out.println("Unknown");
            }
        }
    }

    public void produceUncheckedException() {
        throw new ClassCastException();
    }
}
