package local.rabbitmqt;

import com.rabbitmq.client.*;

import java.io.IOException;

/**
 * Created by codedrinker on 10/02/2017.
 */
public class RabbitMQRouteConsumer {

    private static final String EXCHANGE_NAME = "direct_logs2";

    public static void main(String[] argv) throws Exception {
        final ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        factory.setUsername("admin");
        factory.setPassword("admin");
        Connection connection = factory.newConnection();
        final Channel channel = connection.createChannel();

        channel.exchangeDeclare(EXCHANGE_NAME, "fanout", true);

        if (argv.length < 1) {
            System.err.println("Usage: ReceiveLogsDirect [info] [warning] [error]");
            System.exit(1);
        }

        for (String severity : argv) {
            channel.queueBind("ttl-queue", EXCHANGE_NAME, severity);
        }
        System.out.println(" [*] Waiting for messages. To exit press CTRL+C");

        Consumer consumer = new DefaultConsumer(channel) {
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope,
                                       AMQP.BasicProperties properties, byte[] body) throws IOException {
                String message = new String(body, "UTF-8");
                System.out.println(" [x] Received '" + envelope.getRoutingKey() + "':'" + message + "'" + " " + System.currentTimeMillis());
//                channel.basicReject(envelope.getDeliveryTag(), true);
//                channel.basicAck(envelope.getDeliveryTag(), false);

            }
        };
        channel.basicConsume("ttl-queue", false, consumer);
    }
}