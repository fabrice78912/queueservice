package io.getarrays.queueservice.consumer;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.getarrays.queueservice.domain.OrderMessage;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

/**
 * Classe OrderConsumer
 *
 * @author Fabrice
 * @version 1.0
 * @since 2026-03-16
 */
@Service
public class OrderConsumer {

    public static final String QUEUE_NAME= "myQueue";

    @JmsListener(destination = QUEUE_NAME)
    public void receiveOrder(String messageJson) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            // Deserialize JSON back to OrderMessage
            OrderMessage order = mapper.readValue(messageJson, OrderMessage.class);
            System.out.println("Order received: " + order.toString());
            //check before if message already processed
            //processing message here
            //after save message in database
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
