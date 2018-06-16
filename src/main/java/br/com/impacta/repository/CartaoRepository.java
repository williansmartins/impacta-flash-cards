package br.com.impacta.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.impacta.model.Cartao;


public interface CartaoRepository extends JpaRepository<Cartao,Long>{
  
}
