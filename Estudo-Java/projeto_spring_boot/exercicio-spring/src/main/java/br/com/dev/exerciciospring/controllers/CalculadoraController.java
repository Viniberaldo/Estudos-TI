package br.com.dev.exerciciospring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author viniberaldo
 */
@RequestMapping(path = "/calculadora")
@RestController
public class CalculadoraController {

    // usando o padrão /calculadora/somar/1/1
    @GetMapping(path = "/somar/{a}/{b}")
    public String soma(
            @PathVariable int a,
            @PathVariable int b) {
        int soma = a + b;
        String resultado = String.valueOf(soma);
        return resultado;
    }

    //usando o padrão /calculadora/subtrair?a=5&b=2
    @GetMapping(path = "/subtrair")
    public String subtrair(
            @RequestParam(name = "a") int a,
            @RequestParam(name = "b") int b) {
        int diferenca = a - b;
        String resultado = String.valueOf(diferenca);
        return resultado;
    }
}
