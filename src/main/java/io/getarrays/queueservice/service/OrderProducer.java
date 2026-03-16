package io.getarrays.queueservice.service;

/**
 * Classe OrderProducer
 *
 * @author Fabrice
 * @version 1.0
 * @since 2026-03-16
 */
import com.fasterxml.jackson.databind.ObjectMapper;
import io.getarrays.queueservice.domain.OrderMessage;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class OrderProducer {

  private final JmsTemplate jmsTemplate;

  public OrderProducer(JmsTemplate jmsTemplate) {
    this.jmsTemplate = jmsTemplate;
  }

  public void sendOrder(OrderMessage order) {
    ObjectMapper mapper = new ObjectMapper();
    try {
      String json = mapper.writeValueAsString(order); // CONVERTIR LA DATA AVANT enVOI SUR LE RESEAU
      jmsTemplate.convertAndSend("myQueue", json);
      System.out.println("Message envoyé : " + json);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
