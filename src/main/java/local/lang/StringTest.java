package local.lang;

/**
 * Created by codedrinker on 10/30/16.
 */
public class StringTest {
    public static void main(String[] args) {
        String s = "sha2cha";
        char c = s.charAt(3);
        System.out.println(c);

        System.out.println(s.concat("her").concat("she"));

        boolean s1 = s.contains("2c");
        System.out.println(s1);

        boolean sha = s.contentEquals("sha2chaa");
        System.out.println(sha);

        char[] sr = new char[]{'a', 'd', 'f'};
        String s2 = String.copyValueOf(sr);
        System.out.println(s2);

        boolean a = s.endsWith("a");
        System.out.println(a);

        String w = String.format("%s ded", "w");
        System.out.println(w);


        System.out.println(s.indexOf("2a"));

        System.out.println(s.substring(2));
        System.out.println(s.substring(2, 5));
        char[] chars = s.toCharArray();

        System.out.println(chars);

        String str = " we are stupid ";
        System.out.println(str.trim());

        String s3 = String.valueOf(sr);

        String str1 = " abcdefghijklmnopqrstuvwxyz ";
        System.out.println(str1);
        StringBuffer stringBuffer = new StringBuffer(str1);
        stringBuffer.trimToSize();
        String s4 = stringBuffer.reverse().toString();
        System.out.println(s4);

        String source = "hell.oworld.png";

        int i = source.lastIndexOf(".");
        System.out.println(source.substring(i+1));

    }
}
