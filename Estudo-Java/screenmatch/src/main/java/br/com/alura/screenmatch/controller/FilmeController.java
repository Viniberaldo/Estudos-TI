package br.com.alura.screenmatch.controller;

import br.com.alura.screenmatch.domain.filme.DadosCadastroFilme;
import br.com.alura.screenmatch.domain.filme.Filme;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/filmes")
public class FilmeController {

    private List<Filme> filmes = new ArrayList<>();

    @GetMapping
    public String carregarPaginaFormulario() {
        return "filmes/formulario";
    }

    @PostMapping
    public String cadastrarFilme(DadosCadastroFilme dados) {
        Filme filme = new Filme(dados);
        filmes.add(filme);
        return "filmes/formulario";
    }
}
