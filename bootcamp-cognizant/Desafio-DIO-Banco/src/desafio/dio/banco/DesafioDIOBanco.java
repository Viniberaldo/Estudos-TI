/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desafio.dio.banco;

import java.util.Scanner;

/**
 *
 * @author viniberaldo
 */
public class DesafioDIOBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Cliente individuo = new Cliente();
        Conta cc = new ContaCorrente(individuo);
        Conta poup = new ContaPoupanca(individuo);
        int opt = 0;
        int sair = 0;
        Scanner variavelScanner = new Scanner(System.in);

        System.out.println("Olá, qual seu nome?");
        String user = variavelScanner.nextLine();
        
        while (sair != 1) {            
            
        System.out.println("Bem vindo(a) " + user + " !");
        System.out.println("***********");
        System.out.println("*Banco DESAFIO*");
        System.out.println("*selecione a opção*");
        System.out.println("1. Abrir conta");
        System.out.println("2. Transferir fundos para poupança");
        System.out.println("3. Pedir cartão de crédito");
        System.out.println("4. Sair");
        System.out.println("***********\n");

        opt = variavelScanner.nextInt();
        
        switch (opt) {
            case 1:
                //abrir conta

                individuo.setNome(user);
                System.out.println("Conta aberta para " + user);
                break;
            case 2:
                System.out.println("Quanto deseja transferir para poupança?");
                int valor = variavelScanner.nextInt();
                cc.transferir(valor, poup);
                cc.imprimirExtrato();
                poup.imprimirExtrato();
                // transferir dinheiro
                break;
            case 3:
                //pedir cartão
                System.out.println("Cartão em produção!");
                break;
            case 4:
                sair=1;
                System.out.println("Encerrando aplicação, "+user+" !");
        }
        
        }
    }

}
