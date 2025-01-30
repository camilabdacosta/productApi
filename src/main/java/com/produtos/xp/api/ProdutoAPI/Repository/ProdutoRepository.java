package com.produtos.xp.api.ProdutoAPI.Repository;

import com.produtos.xp.api.ProdutoAPI.Model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto,Long> {
    List<Produto> findByNome(String nome);
}
