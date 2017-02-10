package local.rabbitmqt;

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by codedrinker on 10/02/2017.
 */
public class RabbitMQRouteProducer {

    private static final String EXCHANGE_NAME = "direct_logs2";

    public static void main(String[] argv) throws Exception {

        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        factory.setUsername("admin");
        factory.setPassword("admin");
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();

        channel.exchangeDeclare(EXCHANGE_NAME, "fanout", true);
        Map args = new HashMap();
        args.put("x-message-ttl", 60000);
        channel.queueDeclare("ttl-queue", true, false, false, args);

        String severity = getSeverity(argv);
        String message = getMessage(argv);

        int i = 0;
        while (true) {
            severity = i % 3 == 0 ? "info" : "error";
            channel.basicPublish(EXCHANGE_NAME,
                    severity,
                    new AMQP.BasicProperties.Builder().deliveryMode(2).expiration("60000").priority(1).build(),
                    (message + " : " + i).getBytes("UTF-8"));
            System.out.println(" [x] Sent '" + severity + "':'" + (message + " : " + i) + "' " + System.currentTimeMillis());
            Thread.sleep(10000);
            i++;
        }

//        channel.close();
//        connection.close();
    }

    private static String getSeverity(String[] strings) {
        if (strings.length < 1)
            return "info";
        return strings[0];
    }

    private static String getMessage(String[] strings) {
        if (strings.length < 2)
            return "Hello World!";
        return joinStrings(strings, " ", 1);
    }

    private static String joinStrings(String[] strings, String delimiter, int startIndex) {
        int length = strings.length;
        if (length == 0) return "";
        if (length < startIndex) return "";
        StringBuilder words = new StringBuilder(strings[startIndex]);
        for (int i = startIndex + 1; i < length; i++) {
            words.append(delimiter).append(strings[i]);
        }
        return words.toString();
    }
}