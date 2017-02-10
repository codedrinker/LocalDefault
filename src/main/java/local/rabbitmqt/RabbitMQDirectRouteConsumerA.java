package local.rabbitmqt;

import com.rabbitmq.client.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by codedrinker on 10/02/2017.
 */
public class RabbitMQDirectRouteConsumerA {

    private static final String EXCHANGE_NAME = "direct_exchange";

    public static void main(String[] argv) throws Exception {
        Connection connection = RabbitMQFactory.getFactory().newConnection();
        final Channel channel = connection.createChannel();
        channel.exchangeDeclare(EXCHANGE_NAME, "direct", true);
        Map args = new HashMap();
        args.put("x-message-ttl", 60000);
        channel.queueDeclare("direct_exchange_error_queue", true, false, false, args);
        channel.queueBind("direct_exchange_error_queue", EXCHANGE_NAME, "error");
        System.out.println(" [*] Waiting for messages. To exit press CTRL+C");
        Consumer consumer = new DefaultConsumer(channel) {
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                String message = new String(body, "UTF-8");
                System.out.println(this.getClass().getCanonicalName() + " Received '" + envelope.getRoutingKey() + "':'" + message + "'" + " at " + System.currentTimeMillis());
//                channel.basicReject(envelope.getDeliveryTag(), true);
//                channel.basicAck(envelope.getDeliveryTag(), false);
            }
        };
        channel.basicConsume("direct_exchange_error_queue", false, consumer);
    }
}