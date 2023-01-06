package com.paulocavalcante.backendattornatus.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "enderecos")
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_endereco;
    private String logradouro;
    private Long cep;
    private int numero;
    private String cidade;

//    @ManyToOne
//    @JoinColumn(name = "id")
//    private Pessoa pessoa;
}
