package com.paulocavalcante.backendattornatus.controller;

import com.paulocavalcante.backendattornatus.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController("/pessoas")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;
}
