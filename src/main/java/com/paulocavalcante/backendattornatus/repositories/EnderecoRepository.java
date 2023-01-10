package com.paulocavalcante.backendattornatus.repositories;

import com.paulocavalcante.backendattornatus.entities.Endereco;
import com.paulocavalcante.backendattornatus.entities.Pessoa;
import com.paulocavalcante.backendattornatus.enums.PrioridadeEndereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {


    List<Endereco> findByPessoa(Pessoa pessoa);

    @Query(value = "SELECT * from Enderecos e JOIN Pessoas p on p.id = e.id_endereco_pessoa where e.prioridade_endereco = :prioridadeEndereco AND p.id= :idPessoa", nativeQuery = true)
    Endereco findMainAddressByPriority(Long idPessoa, String prioridadeEndereco);
}
