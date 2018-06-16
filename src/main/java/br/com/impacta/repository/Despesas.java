package br.com.impacta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.impacta.springmvc.gerenciadordespesas.model.Despesa;

public interface Despesas extends JpaRepository<Despesa,Long>{

}
