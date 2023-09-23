package br.com.dev.exerciciospring.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author viniberaldo
 */
@RestController
@RequestMapping("/metodos")
public class MetodosHttpController {

    @GetMapping
    public String get() {
        return "Requisição GET\n";
    }

    @PostMapping
    public String post() {
        return "Requisição POST\n";
    }

    @PutMapping
    public String put() {
        return "Requisição PUT\n";
    }

    @PatchMapping
    public String patch() {
        return "Requisição PATCH\n";
    }

    @DeleteMapping
    public String delete() {
        return "Requisição DELETE\n";
    }

}
