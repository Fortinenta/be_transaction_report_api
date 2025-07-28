package com.hitachi.hcsid.transactionreportapi.entity;

import com.hitachi.hcsid.transactionreportapi.model.TaxStatus;
import com.hitachi.hcsid.transactionreportapi.model.TaxType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "taxes")
@Getter
@Setter
public class Tax {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false, unique = true)
    private String name; // e.g., "VAT", "Sales Tax", "Service Tax"

    @Column(nullable = false, precision = 5, scale = 2)
    private BigDecimal rate; // Tax rate as percentage (e.g., 10.00 for 10%)

    @Enumerated(EnumType.STRING)
    private TaxType type; // PERCENTAGE, FIXED_AMOUNT

    private String description;

    @Enumerated(EnumType.STRING)
    private TaxStatus status; // ACTIVE, INACTIVE
}