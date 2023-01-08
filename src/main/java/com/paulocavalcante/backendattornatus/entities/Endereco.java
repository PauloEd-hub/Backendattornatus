package com.paulocavalcante.backendattornatus.entities;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
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

//    private enum principalAdrress

    @ManyToOne
    @JoinColumn(name = "id_endereco_pessoa")
    private Pessoa pessoa;
}
