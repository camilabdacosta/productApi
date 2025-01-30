package com.produtos.xp.api.ProdutoAPI.Controller;

import com.produtos.xp.api.ProdutoAPI.Service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {
    @Autowired
    private ProdutoService produtoService;


    @GetMapping("/produtos")
    public String listarProdutos(Model model) {
        model.addAttribute("products", produtoService.listarTodos());
        return "index";

    }
}