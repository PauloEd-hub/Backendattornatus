package com.paulocavalcante.backendattornatus.controller;

import com.paulocavalcante.backendattornatus.mapper.PessoaMapper;
import com.paulocavalcante.backendattornatus.request.PessoaRequest;
import com.paulocavalcante.backendattornatus.response.PessoaResponse;
import com.paulocavalcante.backendattornatus.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;


    //Criar uma pessoa
    @PostMapping("/cria")
    public PessoaResponse createPeople(@RequestBody PessoaRequest pessoa) {
        var response = PessoaMapper.requestToModel(pessoa);

        return PessoaMapper.modelToResponse(pessoaService.save(response));

    }

    //Consultar uma pessoa
    @GetMapping("/{id}")
    public PessoaResponse findPeopleById(@PathVariable Long id) {
        return PessoaMapper.modelToResponse(pessoaService.findPeopleById(id));

    }

    //Listar pessoas
    @GetMapping
    public List<PessoaResponse> showAllPeople() {
        return PessoaMapper.modelToResponseList(pessoaService.showAllPeople());
    }

    //Editar uma pessoa
    @PutMapping("/atualiza/{id}")
    public PessoaResponse updatePeople(@PathVariable Long id, @RequestBody PessoaRequest pessoa) {
        return PessoaMapper.modelToResponse(pessoaService.updatePeople(id, PessoaMapper.requestToModel(pessoa)));
    }
}
