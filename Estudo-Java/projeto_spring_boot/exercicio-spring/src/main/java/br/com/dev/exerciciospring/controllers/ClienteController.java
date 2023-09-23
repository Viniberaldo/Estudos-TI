package br.com.dev.exerciciospring.controllers;

import models.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author viniberaldo
 */
@RestController
@RequestMapping(path = "/clientes")
public class ClienteController {

    @GetMapping(path = "/qualquer")
    public Cliente obterCliente() {
        return new Cliente(1, "José", "123.456.789-0");
    }

    @GetMapping(path = "/{id}")
    public Cliente obterClientePorId(@PathVariable int id) {
        return new Cliente(id, "Maria", "987.654.321-00");
    }

    @GetMapping
    public Cliente obterClientePorIdRequestParam(
            @RequestParam(name = "id", defaultValue = "1") int id) {
        return new Cliente(id, "JonJon", "987.654.321-00");
    }
}
