package io.getarrays.queueservice.domain;

import java.io.Serializable;

/**
 * Classe OrderMessage
 *
 * @author Fabrice
 * @version 1.0
 * @since 2026-03-16
 */

public class OrderMessage implements Serializable {

    private static final long serialVersionUID = 1L;

    private String orderId;
    private String product;
    private int quantity;

    public OrderMessage() {}

    public OrderMessage(String orderId, String product, int quantity) {
        this.orderId = orderId;
        this.product = product;
        this.quantity = quantity;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

}
