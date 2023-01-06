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


    //Criar uma pessoa
    @PostMapping("/cria")
    public Pessoa createPeople(@RequestBody Pessoa pessoa) {
        return pessoaService.save(pessoa);
    }

    //Consultar uma pessoa
    @GetMapping("/{id}")
    public Pessoa findPeopleById(@PathVariable Long id) {
        return pessoaService.findPeopleById(id);

    }

    //Listar pessoas
    @GetMapping
    public List<Pessoa> showAllPeople() {
        return pessoaService.showAllPeople();
    }

    //Editar uma pessoa
    @PutMapping("/atualiza/{id}")
    public Pessoa updatePeople(@PathVariable Long id, @RequestBody Pessoa pessoa) {
        return pessoaService.updatePeople(id, pessoa);

    }
}
