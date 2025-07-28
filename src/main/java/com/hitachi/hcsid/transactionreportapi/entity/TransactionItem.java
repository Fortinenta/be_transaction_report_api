package com.hitachi.hcsid.transactionreportapi.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "transaction_items")
@Getter
@Setter
public class TransactionItem {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "transaction_id")
    private Transaction transaction;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Product product;

    @Column(nullable = false)
    private Integer quantity;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal unitPrice; // Price at time of purchase

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal totalPrice; // unitPrice * quantity

    @Column(precision = 10, scale = 2)
    private BigDecimal taxAmount; // Tax applied to this item
}