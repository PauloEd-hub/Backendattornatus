package com.paulocavalcante.backendattornatus.response;

import com.paulocavalcante.backendattornatus.entities.Endereco;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PessoaResponse {
    private Long id_pessoa;

    private String nome;

    private LocalDate dataDeNascimento;

//    private List<Endereco> endereco;
}
