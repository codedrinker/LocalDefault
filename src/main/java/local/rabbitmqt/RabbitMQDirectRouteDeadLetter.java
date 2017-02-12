package local.rabbitmqt;

import com.rabbitmq.client.*;

import java.io.IOException;

/**
 * Created by codedrinker on 10/02/2017.
 */
public class RabbitMQDirectRouteDeadLetter {

    private static final String EXCHANGE_NAME = "dead_letter_direct_exchange";
    private static final String QUEUE_NAME = "dead_letter_direct_exchange_queue_name";

    public static void main(String[] argv) throws Exception {
        Connection connection = RabbitMQFactory.getFactory().newConnection();
        final Channel channel = connection.createChannel();
        channel.queueBind(QUEUE_NAME, EXCHANGE_NAME, "dead_letter");
        System.out.println(" [*] Waiting for messages. To exit press CTRL+C");
        Consumer consumer = new DefaultConsumer(channel) {
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                String message = new String(body, "UTF-8");
                System.out.println(new RabbitMQDirectRouteDeadLetter().getClass().getCanonicalName() + " Received '" + envelope.getRoutingKey() + "':'" + message + "'" + " at " + System.currentTimeMillis());
//                channel.basicReject(envelope.getDeliveryTag(), true);
//                channel.basicAck(envelope.getDeliveryTag(), false);
            }
        };
        channel.basicConsume(QUEUE_NAME, false, consumer);
    }
}