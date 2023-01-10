package com.paulocavalcante.backendattornatus.request;

import com.paulocavalcante.backendattornatus.enums.PrioridadeEndereco;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EnderecoRequest {

    private String logradouro;
    private Long cep;
    private int numero;
    private String cidade;

    private Long pessoa_id;

    private PrioridadeEndereco prioridadeEndereco;


}
