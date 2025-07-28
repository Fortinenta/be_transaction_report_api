package com.hitachi.hcsid.transactionreportapi.dto;

import com.hitachi.hcsid.transactionreportapi.model.UserStatus;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@Schema(example = "{\"username\": \"newuser\", \"email\": \"newuser@example.com\", \"firstName\": \"New\", \"lastName\": \"User\", \"phoneNumber\": \"081234567899\", \"status\": \"ACTIVE\", \"roles\": [\"STAFF\"]}")
public class UserDTO {
    private UUID id;
    private String username;
    private String email;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private UserStatus status;
    private Set<String> roles;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private UUID createdBy;
    private UUID updatedBy;
}