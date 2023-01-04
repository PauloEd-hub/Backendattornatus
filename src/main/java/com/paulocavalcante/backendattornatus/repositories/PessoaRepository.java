package com.paulocavalcante.backendattornatus.repositories;

import com.paulocavalcante.backendattornatus.entities.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
