package com.paulocavalcante.backendattornatus.controller;


import com.paulocavalcante.backendattornatus.mapper.EnderecoMapper;
import com.paulocavalcante.backendattornatus.request.EnderecoRequest;
import com.paulocavalcante.backendattornatus.response.EnderecoResponse;
import com.paulocavalcante.backendattornatus.service.EnderecoService;
import com.paulocavalcante.backendattornatus.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/enderecos")
public class EnderecoController {

    @Autowired
    private EnderecoService enderecoService;

    @Autowired
    private PessoaService pessoaService;


    @PostMapping("/criaEndereco/pessoa")
    public EnderecoResponse createAddress(@RequestBody EnderecoRequest endereco) {

        var response = EnderecoMapper.requestToModel(endereco);

        return EnderecoMapper.modelToResponse(enderecoService.createAddress(response));

    }

    //Listar endereços da pessoa
    @GetMapping("/buscaEndereco/pessoa/{idPessoa}")
    public List<EnderecoResponse> searchAddress(@PathVariable(value = "idPessoa") Long idPessoa) {


        return EnderecoMapper.modelToResponseList(enderecoService.findAddressByPeopleId(idPessoa));

    }
    //Poder informar qual endereço é o principal da pessoa
    @GetMapping("/buscaPrioridadeEndereco/{idPessoa}")
    public EnderecoResponse searchPriorityAddress(@PathVariable Long idPessoa, @RequestParam String prioridadeEndereco) {

        return EnderecoMapper.modelToResponse(enderecoService.searchPriorityAddress(idPessoa, prioridadeEndereco));

    }

}
