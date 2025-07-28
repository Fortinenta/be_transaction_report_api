package com.hitachi.hcsid.transactionreportapi.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Schema(example = "{\"username\": \"admin\", \"password\": \"adminpass\"}")
public class LoginRequest {
    @NotBlank
    private String username;

    @NotBlank
    private String password;
}
