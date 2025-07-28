package com.hitachi.hcsid.transactionreportapi.dto;

import com.hitachi.hcsid.transactionreportapi.model.ProductStatus;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@Schema(example = "{\"name\": \"Laptop XYZ\", \"description\": \"Powerful laptop for everyday use\", \"price\": 1200.00, \"status\": \"ACTIVE\", \"category\": \"Electronics\", \"sku\": \"LPT-XYZ-001\", \"taxIds\": []}")
public class ProductDTO {

    private UUID id;
    private String name;
    private String description;
    private BigDecimal price;
    private ProductStatus status;
    private String category;
    private String sku;
    private Set<UUID> taxIds;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}