package local.typet;

/**
 * Created by codedrinker on 5/12/16.
 */
public class Main {
    public static void main(String[] args) {
        Type type = new SType();

        if (type instanceof MType) {
            System.out.println("MType");
        } else if (type instanceof SType) {
            System.out.println("SType");
        } else {
            System.out.println("shit");
        }

        type = new MType();

        if (type instanceof MType) {
            System.out.println("MType");
        } else if (type instanceof SType) {
            System.out.println("SType");
        } else {
            System.out.println("shit");
        }
    }
}
