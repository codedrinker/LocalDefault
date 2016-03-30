package local.uri;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * Created by codedrinker on 3/30/16.
 */
public class UriEncodeTest {

    private static String encode;

    public static void main(String[] args) {
        String referrer = "utm_source=%s&utm_medium=%s&anid=conversant";
        String uri = "https://play.google.com/store/apps/details?id=com.suapp.dailycast&referrer=%s";

        System.out.println(referrer);
        try {
            encode = URLEncoder.encode(String.format(referrer, "2", "2"), "UTF-8");
            System.out.println(encode);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        System.out.println(String.format(uri, String.format(referrer, "2", "2")));
        System.out.println(String.format(uri, encode));
    }
}
