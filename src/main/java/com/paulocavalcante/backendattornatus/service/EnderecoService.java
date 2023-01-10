package com.paulocavalcante.backendattornatus.service;

import com.paulocavalcante.backendattornatus.entities.Endereco;
import com.paulocavalcante.backendattornatus.enums.PrioridadeEndereco;
import com.paulocavalcante.backendattornatus.repositories.EnderecoRepository;
import com.paulocavalcante.backendattornatus.repositories.PessoaRepository;
import jakarta.persistence.NoResultException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Autowired
    private PessoaRepository pessoaRepository;


    public Endereco findPessoaById(Long idPessoa) {
        return enderecoRepository.findById(idPessoa).get();
    }

    public List<Endereco> findAddressByPeopleId(Long idPessoa) {
        return enderecoRepository.findByPessoa(pessoaRepository.findById(idPessoa).orElseThrow(
                () -> new NoResultException("Pessoa não encontrada")
        ));
    }

    public Endereco createAddress(Endereco response) {
        return enderecoRepository.save(response);
    }

//    public Endereco UpdateAddress(Long id_endereco, Endereco endereco) {
//        enderecoRepository.findById(id_endereco).orElseThrow(
//                () -> new NoResultException("Endereço não encontrado")
//        );
//
//        endereco.setId_endereco(id_endereco);
//
//        enderecoRepository.save(endereco);
//
//        return endereco;
//    }

    public Endereco searchPriorityAddress(Long idPessoa, String prioridadeEndereco) {
        var prioridade = PrioridadeEndereco.valueOf(prioridadeEndereco).toString();

        return enderecoRepository.findMainAddressByPriority(idPessoa, prioridade);
    }
}
