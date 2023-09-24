package br.com.dev.exerciciospring.controllers;

import br.com.dev.exerciciospring.repositores.ProdutoRepository;
import br.com.dev.exerciciospring.models.Produto;
import jakarta.validation.Valid;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
    public @ResponseBody
    Produto novoProduto(@Valid Produto produto) {
        produtoRepository.save(produto);
        return produto;
    }

    @GetMapping
    public List obterProdutos() {
        return produtoRepository.findAll();
    }

    @GetMapping(path = "/nome/{partNome}")
    public Iterable<Produto> obterProdutosPorNome(@PathVariable String partNome) {
        return produtoRepository.findByNomeContainingIgnoreCase(partNome);
    }

    @GetMapping(path = "/pagina/{numeroPagina}")
    public Iterable<Produto> obterProdutosPorPagina(
            @PathVariable int numeroPagina) {
        Pageable pageable = PageRequest.of(numeroPagina, 2);
        return produtoRepository.findAll(pageable);
    }

    @GetMapping(path = "/{id}")
    public Optional<Produto> obterProdutoPorId(@PathVariable int id) {
        return produtoRepository.findById(id);
    }

    @PutMapping
    public Produto alterarProduto(@Valid Produto produto) {
        produtoRepository.save(produto);
        return produto;
    }

    @DeleteMapping(path = "/{id}")
    public void excluirProduto(@PathVariable int id) {
        produtoRepository.deleteById(id);
    }
}
