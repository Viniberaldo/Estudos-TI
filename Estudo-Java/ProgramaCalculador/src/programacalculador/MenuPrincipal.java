/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacalculador;

import java.util.Scanner;

/**
 * Menu inicial do programa Calculador.
 */
public class MenuPrincipal {

    void iniciar() {
        System.out.println("Programa Calculador iniciado. Escolha o modo desejado:");
        System.out.println("1. Calculadora Padrão");
        System.out.println("2. Calculadora IMC");
        System.out.println("3. Calculadora Área");

        Scanner leitor = new Scanner(System.in);

        int opcao = leitor.nextInt();

        switch (opcao) {
            case 1:
                CalculadoraPadrao calculadoraPadrao = new CalculadoraPadrao();
                calculadoraPadrao.iniciar();
                break;
            case 2:
                CalculadoraIMC calculadoraIMC = new CalculadoraIMC();
                calculadoraIMC.iniciar();
                break;
            case 3:
                CalculadoraArea calculadoraArea = null;
                calculadoraArea.iniciar();
            default:
                System.out.println("Selecione uma opção válida.");
        }
    }
    //TODO: colocar os menus solicitados
}
