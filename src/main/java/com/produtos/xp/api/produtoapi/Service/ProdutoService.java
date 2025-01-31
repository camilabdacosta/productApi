package com.produtos.xp.api.produtoapi.Service;

import com.produtos.xp.api.produtoapi.Model.Produto;
import com.produtos.xp.api.produtoapi.Repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> listarTodos() {
        return produtoRepository.findAll();
    }

    public Optional<Produto> buscarPorId(Long id) {
        return produtoRepository.findById(id);
    }
    public List<Produto> buscarPorNome(String nome) {
        return produtoRepository.findByNome(nome);
    }
    public Produto salvar(Produto produto) {
        return produtoRepository.save(produto);
    }
    public void deletar(Long id) {
        produtoRepository.deleteById(id);
    }

    public long contarProdutos() {
        return produtoRepository.count();
    }

}
