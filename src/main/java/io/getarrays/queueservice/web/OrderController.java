package io.getarrays.queueservice.web;

/**
 * Classe OrderController
 *
 * @author Fabrice
 * @version 1.0
 * @since 2026-03-16
 */

import io.getarrays.queueservice.domain.OrderMessage;
import io.getarrays.queueservice.service.OrderProducer;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderProducer producer;

    public OrderController(OrderProducer producer) {
        this.producer = producer;
    }

    @PostMapping
    public String createOrder(@RequestBody OrderMessage order) {

        producer.sendOrder(order);

        return "Order message sent to queue";
    }
}
