package com.paulocavalcante.backendattornatus.response;

import com.paulocavalcante.backendattornatus.enums.PrioridadeEndereco;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EnderecoResponse {
    private String logradouro;
    private Long cep;
    private int numero;
    private String cidade;
    private PrioridadeEndereco prioridadeEndereco;



}
