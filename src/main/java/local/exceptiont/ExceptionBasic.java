package local.exceptiont;

import java.util.ArrayList;

/**
 * Created by codedrinker on 3/3/16.
 */
public class ExceptionBasic {
    public static void main(String[] args) {
        ArrayList<String> objects = new ArrayList<String>();
        objects.add("1");

        System.out.println("call" + getExce(objects));
    }

    private static String getExce(ArrayList<String> objects) {
        try {
            System.out.println("try");
            objects.get(2);
            return "try";
        } catch (Exception e) {
            System.out.println("catch");
        }

        System.out.println("end");
        return "end";
    }
}
