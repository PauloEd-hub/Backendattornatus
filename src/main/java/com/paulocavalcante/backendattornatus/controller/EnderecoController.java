package com.paulocavalcante.backendattornatus.controller;


import com.paulocavalcante.backendattornatus.entities.Endereco;
import com.paulocavalcante.backendattornatus.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/enderecos")
public class EnderecoController {

    @Autowired
    private EnderecoService enderecoService;


    //Criar endereço para pessoa

    @PostMapping("/criaEndereco/pessoa/{id}")
    public Endereco createAddress(@PathVariable(value ="pessoaId") Long id ,@RequestBody Endereco endereco) {
        return null;

    }
    //Listar endereços da pessoa
    //Poder informar qual endereço é o principal da pessoa
}
