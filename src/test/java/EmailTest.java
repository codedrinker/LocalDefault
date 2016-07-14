import local.email.Email;
import org.apache.commons.io.IOUtils;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by codedrinker on 7/11/16.
 */
public class EmailTest {
    String host = "smtp.yeah.net";
    String username = "primos@yeah.net";
    String password = "primostest";
    String addresslist = "wangchunlei@jiandaola.com";

    @Test
    public void sendMail() {
        String file = "http://dev.res.jusweet.com/dev/v3/file/3f47/f397/0a85860b18ab2de5e69cccea.html";
        InputStream inputStream = null;
        String body = null;
        try {
            URL url = new URL(file);
            inputStream = url.openStream();
            body = IOUtils.toString(inputStream, StandardCharsets.UTF_8);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        String mimeType = "text/html;charset=GBK";
        String subject = "这个是第一个简单的测试";
        Map<String, String> from = new HashMap<>();
        from.put("邮件测试", username);
        Email.send(host, username, password, addresslist, true, body, mimeType, subject, from);
    }
}
