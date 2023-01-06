package com.paulocavalcante.backendattornatus.controller;


import com.paulocavalcante.backendattornatus.entities.Endereco;
import com.paulocavalcante.backendattornatus.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/enderecos")
public class EnderecoController {

    @Autowired
    private EnderecoService enderecoService;


    //Criar endereço para pessoa

    public Endereco createAddress(@RequestBody Endereco endereco) {
        return null;

    }
    //Listar endereços da pessoa
    //Poder informar qual endereço é o principal da pessoa
}
