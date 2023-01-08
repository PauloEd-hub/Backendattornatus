package com.paulocavalcante.backendattornatus.mapper;

import com.paulocavalcante.backendattornatus.entities.Endereco;
import com.paulocavalcante.backendattornatus.entities.Pessoa;
import com.paulocavalcante.backendattornatus.request.EnderecoRequest;
import com.paulocavalcante.backendattornatus.response.EnderecoResponse;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Component
public class EnderecoMapper {

    public static Endereco requestToModel(EnderecoRequest enderecoRequest) {
        return Endereco
                .builder()
                .logradouro(enderecoRequest.getLogradouro())
                .cep(enderecoRequest.getCep())
                .numero(enderecoRequest.getNumero())
                .cidade(enderecoRequest.getCidade())
                .pessoa(Pessoa.builder()
                        .id(enderecoRequest.getPessoa_id())
                        .build())
                //enum
                .build();
    }

    public static EnderecoResponse modelToResponse(Endereco endereco) {
        return EnderecoResponse
                .builder()
                .nome_pessoa(endereco.getPessoa().getNome())
                .logradouro(endereco.getLogradouro())
                .cep(endereco.getCep())
                .numero(endereco.getNumero())
                .cidade(endereco.getCidade())
                .build();
    }

    public static List<EnderecoResponse> modelToResponseList(List<Endereco> enderecos) {

        if (Objects.isNull(enderecos)) {
            return new ArrayList<>();
        } else {
            return enderecos.stream().map(EnderecoMapper::modelToResponse).collect(Collectors.toList());
        }
    }
}