package com.paulocavalcante.backendattornatus.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.w3c.dom.stylesheets.LinkStyle;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "pessoas")
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private LocalDate dataDeNascimento;

    @OneToOne( cascade = CascadeType.ALL)
    @JoinColumn(name = "id_endereco")
    private List<Endereco> endereco;


}
