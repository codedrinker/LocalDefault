package local.base64t;

import org.apache.commons.codec.binary.Base64;

/**
 * Created by codedrinker on 1/10/17.
 */
public class Base64Url {
    public static void main(String[] args) {
        String imageUrl = "https://codedrinker.github.io/images/profile.jpg";

        byte[] encodedBytes = Base64.encodeBase64(imageUrl.getBytes());
        System.out.println("encodedBytes " + new String(encodedBytes));
    }
}
