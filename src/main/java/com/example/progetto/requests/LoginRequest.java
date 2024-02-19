package com.example.progetto.requests;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class LoginRequest {

    @NotBlank(message = "username obbligatorio")
    private String username;
    @NotBlank(message = "password obbligatoria")
    private String password;
}
