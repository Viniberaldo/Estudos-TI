package br.com.dev.exerciciospring.controllers;

import br.com.dev.exerciciospring.repositores.ProdutoRepository;
import br.com.dev.exerciciospring.models.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author viniberaldo
 */
@RestController
@RequestMapping(path = "/api/produtos")
public class ProdutoController {

    public ProdutoController() {
    }

    @Autowired
    public ProdutoRepository produtoRepository;

    @PostMapping
    public @ResponseBody Produto novoProduto(@RequestParam String nome) {
        Produto produto = new Produto(nome);
        produtoRepository.save(produto);
        return produto;
    }
}
