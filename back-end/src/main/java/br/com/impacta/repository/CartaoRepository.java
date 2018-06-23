package br.com.impacta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.impacta.model.Cartao;

@Repository
public interface CartaoRepository extends JpaRepository<Cartao,Long>{
  
}
