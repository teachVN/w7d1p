package com.example.progetto.requests;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class DipendenteRequest {
    @NotNull(message = "Non può essere null")
    @NotEmpty(message = "Non può essere vuoto")
    @NotBlank(message = "Non può essere vuoto")
    @Size(min=3,max=15,message = "Deve avere un numero di caratteri compreso tra 3 e 15")
    private String nome;

    @NotNull(message = "Non può essere null")
    @NotEmpty(message = "Non può essere vuoto")
    @NotBlank(message = "Non può essere vuoto")
    @Size(min=3,max=15,message = "Deve avere un numero di caratteri compreso tra 3 e 15")
    private String cognome;

    @NotNull(message = "Non può essere null")
    @NotEmpty(message = "Non può essere vuoto")
    @NotBlank(message = "Non può essere vuoto")
    @Size(min=3,max=15,message = "Deve avere un numero di caratteri compreso tra 3 e 15")
    private String username;

    @NotNull(message = "Non può essere null")
    @NotEmpty(message = "Non può essere vuoto")
    @NotBlank(message = "Non può essere vuoto")
    @Email(message = "Deve essere un'email")
    private String email;
}
