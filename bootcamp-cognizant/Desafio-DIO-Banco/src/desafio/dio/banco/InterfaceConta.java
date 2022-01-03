/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package desafio.dio.banco;

/**
 *
 * @author viniberaldo
 */
public interface InterfaceConta {
    
    public void sacar(double valor);
    public void depositar(double valor);
    public void transferir(double valor, Conta contaDestino);
    public void imprimirExtrato();
    

    
}
