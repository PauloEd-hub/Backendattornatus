package com.paulocavalcante.backendattornatus.entities;

import com.paulocavalcante.backendattornatus.enums.PrioridadeEndereco;
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

    @Enumerated(EnumType.STRING)
    private PrioridadeEndereco prioridadeEndereco;

    @ManyToOne
    @JoinColumn(name = "id_endereco_pessoa")
    private Pessoa pessoa;
}
