package com.example.progetto.requests;

import com.example.progetto.enums.Status;
import com.example.progetto.enums.Tipo;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class DispositivoPatchRequest {
    private Status status;
    private Tipo tipo;
    private Integer dipendenteId;
}
