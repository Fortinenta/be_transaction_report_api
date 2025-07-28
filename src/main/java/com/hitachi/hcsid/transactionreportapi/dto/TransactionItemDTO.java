package com.hitachi.hcsid.transactionreportapi.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
@Schema(example = "{\"productId\": \"8f6ef676-f9e5-402f-9338-55a8b406eae6\", \"quantity\": 1, \"unitPrice\": 100.00, \"totalPrice\": 100.00, \"taxAmount\": 10.00}")
public class TransactionItemDTO {

    private UUID id;
    private UUID productId;
    private Integer quantity;
    private BigDecimal unitPrice;
    private BigDecimal totalPrice;
    private BigDecimal taxAmount;
}