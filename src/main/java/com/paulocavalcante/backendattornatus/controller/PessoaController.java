package com.paulocavalcante.backendattornatus.controller;

import com.paulocavalcante.backendattornatus.entities.Pessoa;
import com.paulocavalcante.backendattornatus.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.format.DateTimeFormatter;
import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    //Listar pessoas
    @GetMapping
    public List<Pessoa> showAllPeople() {
        return pessoaService.showAllPeople();
    }

    //Editar uma pessoa


    //Criar uma pessoa
    @PostMapping("/insere")
    public Pessoa insertPeople(@RequestBody Pessoa pessoa) {
        Pessoa result = pessoaService.save(pessoa);
        return result;
    }

    //Consultar uma pessoa
    @GetMapping("/{id}")
    public Pessoa findPeopleById(@PathVariable Long id) {
        return pessoaService.findPeopleById(id);

    }






}
