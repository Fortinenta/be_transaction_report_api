package com.hitachi.hcsid.transactionreportapi.entity;

import com.hitachi.hcsid.transactionreportapi.model.ProductStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "products")
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false, unique = true)
    private String name;

    private String description;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal price; // Tax-excluded price

    @Enumerated(EnumType.STRING)
    private ProductStatus status; // ACTIVE, INACTIVE, DISCONTINUED

    private String category;
    private String sku; // Stock Keeping Unit

    // Many-to-many relationship with taxes
    @ManyToMany
    @JoinTable(
            name = "product_taxes",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "tax_id")
    )
    private Set<Tax> taxes = new HashSet<>();

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;
}