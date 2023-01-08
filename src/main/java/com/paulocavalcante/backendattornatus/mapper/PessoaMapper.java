package com.paulocavalcante.backendattornatus.mapper;

import com.paulocavalcante.backendattornatus.entities.Pessoa;
import com.paulocavalcante.backendattornatus.request.PessoaRequest;
import com.paulocavalcante.backendattornatus.response.PessoaResponse;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Component
public class PessoaMapper {

    public static Pessoa requestToModel(PessoaRequest pessoaRequest) {
        return Pessoa
                .builder()
                .nome(pessoaRequest.getNome())
                .dataDeNascimento(pessoaRequest.getDataDeNascimento())
                .build();
    }

    public static PessoaResponse modelToResponse(Pessoa pessoa) {
        return PessoaResponse
                .builder()
                .id_pessoa(pessoa.getId())
                .nome(pessoa.getNome())
                .dataDeNascimento(pessoa.getDataDeNascimento())
                .build();
    }

    public static List<PessoaResponse> modelToResponseList(List<Pessoa> pessoas) {

        if (Objects.isNull(pessoas)) {
            return new ArrayList<>();
        } else {
            return pessoas.stream().map(PessoaMapper::modelToResponse).collect(Collectors.toList());
        }
    }
}