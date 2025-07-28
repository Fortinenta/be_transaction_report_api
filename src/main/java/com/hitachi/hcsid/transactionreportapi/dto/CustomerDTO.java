package com.hitachi.hcsid.transactionreportapi.dto;

import com.hitachi.hcsid.transactionreportapi.model.CustomerStatus;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@Schema(example = "{\"name\": \"Jane Doe\", \"birthdate\": \"1995-05-10\", \"birthplace\": \"Bandung\", \"email\": \"jane.doe@example.com\", \"phoneNumber\": \"081234567891\", \"address\": \"Jl. Contoh No. 45\", \"status\": \"ACTIVE\"}")
public class CustomerDTO {
    private UUID id;
    private String name;
    private LocalDate birthdate;
    private String birthplace;
    private String email;
    private String phoneNumber;
    private String address;
    private CustomerStatus status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private UUID createdBy;
    private UUID updatedBy;
}