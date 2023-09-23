package br.com.dev.exerciciospring.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author viniberaldo
 */
@RestController
public class PrimeiroController {
    
    @RequestMapping(method = RequestMethod.GET, path = {"ola","saudacao"})
    public String ola() {
        return "Olá Mundo";
    }
    
}
