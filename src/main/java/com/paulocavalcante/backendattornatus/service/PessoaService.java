package com.paulocavalcante.backendattornatus.service;

import com.paulocavalcante.backendattornatus.entities.Pessoa;
import com.paulocavalcante.backendattornatus.repositories.PessoaRepository;
import jakarta.persistence.NoResultException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public List<Pessoa> showAllPeople() {
        return pessoaRepository.findAll();
    }

    public Pessoa findPeopleById(Long idPessoa) {
        return pessoaRepository.findById(idPessoa).get();
    }

    public Pessoa save(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    public Pessoa updatePeople(Long idPessoa, Pessoa pessoa) {
         pessoaRepository.findById(idPessoa).orElseThrow(
                () -> new NoResultException("Pessoa não encontrada")
        );

        pessoa.setId(idPessoa);

        pessoaRepository.save(pessoa);

        return pessoa;

    }
}
