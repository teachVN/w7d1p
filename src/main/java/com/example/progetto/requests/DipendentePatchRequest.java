package com.example.progetto.requests;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class DipendentePatchRequest {
    private String nome;
    private String cognome;
    private String username;
    @Email(message = "Deve essere un'email")
    private String email;
}
