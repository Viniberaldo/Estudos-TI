package br.com.alura.screenmatch.controller;

import br.com.alura.screenmatch.domain.filme.DadosAlteracaoFilme;
import br.com.alura.screenmatch.domain.filme.DadosCadastroFilme;
import br.com.alura.screenmatch.domain.filme.Filme;
import br.com.alura.screenmatch.domain.filme.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/filmes")
public class FilmeController {

    @Autowired
    private FilmeRepository repository;

    @GetMapping("/formulario")
    public String carregarPaginaFormulario(Long id, Model model) {
        if (id != null) {
            Filme filme = repository.getReferenceById(id);
            model.addAttribute("filme", filme);
        }
        return "filmes/formulario";
    }

    @GetMapping
    public String carregarPaginaListagem(Model model) {
        model.addAttribute("lista", repository.findAll());
        return "filmes/listagem";
    }

    @PostMapping
    public String cadastrarFilme(DadosCadastroFilme dados) {
        Filme filme = new Filme(dados);
        repository.save(filme);
        return "redirect:/filmes";
    }

    @DeleteMapping
    public String removerFilme(Long id) {
        repository.deleteById(id);
        return "redirect:/filmes";
    }

    @PutMapping
    @Transactional
    public String alterarFilme(DadosAlteracaoFilme dados) {
        Filme filme = repository.getReferenceById(dados.id());
        filme.atualizarDados(dados);
        return "redirect:/filmes";
    }
}
