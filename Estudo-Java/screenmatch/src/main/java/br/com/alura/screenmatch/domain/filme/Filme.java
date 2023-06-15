/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.alura.screenmatch.domain.filme;

/**
 *
 * @author viniberaldo
 */
public class Filme {
    private String nome;
    private Integer duracaoEmMinutos;
    private Integer anoLancamento;
    private String genero;
    
    public Filme(DadosCadastroFilme dados) {
        this.nome = dados.nome();
        this.duracaoEmMinutos = dados.duracao();
        this.anoLancamento = dados.ano();
        this.genero = dados.genero();
               
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(Integer duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public Integer getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(Integer anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Filme{" + "nome=" + nome + ", duracaoEmMinutos=" + duracaoEmMinutos + ", anoLancamento=" + anoLancamento + ", genero=" + genero + '}';
    }
    
    
    
}
