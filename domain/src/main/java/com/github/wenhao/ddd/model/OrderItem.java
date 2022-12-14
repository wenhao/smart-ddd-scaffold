package com.github.wenhao.ddd.model;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderItem {
    private Long id;
    private Long orderId;
    private String productName;
    private Long quantity;
    private BigDecimal price;
    private BigDecimal totalPrice;
    private Date createdAt;
}
