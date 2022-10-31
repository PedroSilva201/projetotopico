package br.gov.sp.fatec.projetotopicos.repository;

import org.springframework.stereotype.Repository;

import br.gov.sp.fatec.projetotopicos.entity.Teste;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface TesteRepository extends JpaRepository<Teste, Long> { 
    /**
     * @param nome
     * @return
     */
    public List<Teste> findByNomeContains(String nome);
}
