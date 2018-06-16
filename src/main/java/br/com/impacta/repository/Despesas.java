package br.com.impacta.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.impacta.model.Cartao;

public interface Despesas extends JpaRepository<Cartao,Long>{

}
