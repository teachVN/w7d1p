package com.example.progetto.requests;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class DipendentePatchRequest {
    @Size(min=3,max=15,message = "Deve avere un numero di caratteri compreso tra 3 e 15")
    private String nome;
    @Size(min=3,max=15,message = "Deve avere un numero di caratteri compreso tra 3 e 15")
    private String cognome;
    @Size(min=3,max=15,message = "Deve avere un numero di caratteri compreso tra 3 e 15")
    private String username;
    @Email(message = "Deve essere un'email")
    private String email;
}
