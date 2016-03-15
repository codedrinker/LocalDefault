package local.generic;

/**
 * Created by codedrinker on 3/13/16.
 */
public class Main {
    public static void main(String[] args) {
        SubFunctionality subFunctionality = new SubFunctionality();
        SubEntity subEntity = subFunctionality.testDynamicReturn();
        System.out.println(subEntity);
    }
}
