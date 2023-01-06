package com.paulocavalcante.backendattornatus.service;

import com.paulocavalcante.backendattornatus.repositories.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;
}
