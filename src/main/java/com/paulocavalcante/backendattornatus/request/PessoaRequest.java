package com.paulocavalcante.backendattornatus.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class PessoaRequest {

    private String nome;

    private LocalDate dataDeNascimento;
}
