package local.emailt;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeUtility;
import java.util.Map;
import java.util.Properties;

/**
 * Created by codedrinker on 7/11/16.
 */
public class Email {
    public static boolean send(String host, final String username,
                               final String password, String addresslist, boolean debug,
                               String content, String mimeType, String subject,
                               Map<String, String> from) {
        try {
            Properties props = new Properties();
            props.setProperty("mail.smtp.auth", "true");
            props.setProperty("mail.transport.protocol", "smtp");
            props.setProperty("mail.host", host);
            Session session = Session.getInstance(props, new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(username, password);
                }

            });
            session.setDebug(true);
            Message msg = new MimeMessage(session);
            msg.setRecipients(MimeMessage.RecipientType.TO,
                    InternetAddress.parse(addresslist));
            msg.setContent(content, mimeType);
            msg.setSubject(MimeUtility.decodeText(subject));

            // 设置邮件的发件人信息
            // 设置类似于"王春磊 <335365344@qq.com>"格式的发件人形式
            if (from != null && !from.isEmpty()) {
                for (String name : from.keySet()) {
                    msg.setFrom(new InternetAddress("\""
                            + MimeUtility.encodeText(name) + "\"" + " <"
                            + from.get(name) + ">"));
                }
            }

            Transport.send(msg);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
