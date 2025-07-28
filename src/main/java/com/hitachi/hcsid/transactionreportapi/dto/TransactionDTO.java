package com.hitachi.hcsid.transactionreportapi.dto;

import com.hitachi.hcsid.transactionreportapi.model.PaymentMethod;
import com.hitachi.hcsid.transactionreportapi.model.PaymentStatus;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Schema(example = "{\"transactionNumber\": \"TRX-20240721-001\", \"customerId\": \"0f75f8f9-fd4a-4b80-9ed6-ecf3c0863abf\", \"netAmountPaid\": 100.00, \"totalTaxPaid\": 10.00, \"totalAmountPaid\": 110.00, \"transactionTime\": \"2024-07-21T10:00:00\", \"paymentStatus\": \"PAID\", \"paymentMethod\": \"CASH\", \"items\": [{\"productId\": \"8f6ef676-f9e5-402f-9338-55a8b406eae6\", \"quantity\": 1, \"unitPrice\": 100.00, \"totalPrice\": 100.00, \"taxAmount\": 10.00}], \"notes\": \"Sample transaction\"}")
public class TransactionDTO {
    private UUID id;
    private String transactionNumber;
    private UUID customerId;
    private BigDecimal netAmountPaid;
    private BigDecimal totalTaxPaid;
    private BigDecimal totalAmountPaid;
    private LocalDateTime transactionTime;
    private PaymentStatus paymentStatus;
    private PaymentMethod paymentMethod;
    private List<TransactionItemDTO> items;
    private UUID createdBy;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String notes;
}