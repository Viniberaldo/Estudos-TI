package programacalculador;

import java.util.Scanner;

/**
 * Programa que realiza cálculo de áreas simples.
 */
public class CalculadoraArea extends CalculadoraPadrao {

    void iniciar() {
        System.out.println("Calculadora de área iniciada. Escolha a geometria "
                + "desejada:");
        System.out.println("1. Círculo");
        System.out.println("2. Quadrado");
        System.out.println("3. Retangulo");

        Scanner leitor = new Scanner(System.in);
        int r = 0;

        int opcao = leitor.nextInt();

        if (opcao == 1) {
            System.out.println("Insira o raio do círculo: ");
            r = leitor.nextInt();
            areaCirculo(r);
        } else {
            System.out.println("Insira os dois números para a operação: ");
            var a = leitor.nextInt();
            var b = leitor.nextInt();

            areaQuadrilatero(a, b);
        }

    }

    private void areaCirculo(int r) {
        Float PI = 3.141516f;
        var area = super.multiplicar(PI, super.potenciacao(r, 2));
    }

    private void areaQuadrilatero(int a, int b) {
        var area = super.multiplicar(a, b);
    }

}
