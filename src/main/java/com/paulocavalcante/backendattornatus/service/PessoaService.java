package com.paulocavalcante.backendattornatus.service;

import com.paulocavalcante.backendattornatus.entities.Pessoa;
import com.paulocavalcante.backendattornatus.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public List<Pessoa> showAllPeople() {
        List<Pessoa> resultado =  pessoaRepository.findAll();
        return resultado;
    }

    public Pessoa findPeopleById(Long id) {
        return pessoaRepository.findById(id).get();
    }

    public Pessoa save(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }
}
