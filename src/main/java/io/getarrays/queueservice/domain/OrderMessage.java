package io.getarrays.queueservice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * Classe OrderMessage
 *
 * @author Fabrice
 * @version 1.0
 * @since 2026-03-16
 */

@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderMessage implements Serializable {

    private static final long serialVersionUID = 1L;

    private String orderId;
    private String product;
    private int quantity;
}
