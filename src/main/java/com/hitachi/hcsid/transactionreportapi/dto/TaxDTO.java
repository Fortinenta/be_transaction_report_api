package com.hitachi.hcsid.transactionreportapi.dto;

import com.hitachi.hcsid.transactionreportapi.model.TaxStatus;
import com.hitachi.hcsid.transactionreportapi.model.TaxType;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
@Schema(example = "{\"name\": \"VAT 10%\", \"rate\": 10.00, \"type\": \"PERCENTAGE\", \"description\": \"Value Added Tax 10%\", \"status\": \"ACTIVE\"}")
public class TaxDTO {
    private UUID id;
    private String name;
    private BigDecimal rate;
    private TaxType type;
    private String description;
    private TaxStatus status;
}