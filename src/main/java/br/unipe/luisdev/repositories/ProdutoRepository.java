package br.unipe.luisdev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.unipe.luisdev.domain.Produto;
@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
