package com.paulocavalcante.backendattornatus.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EnderecoResponse {

    private String nome_pessoa;
    private String logradouro;
    private Long cep;
    private int numero;
    private String cidade;

    //    private EnumEndereco principalAdrress = EnumEndereco.OUTROS



}
