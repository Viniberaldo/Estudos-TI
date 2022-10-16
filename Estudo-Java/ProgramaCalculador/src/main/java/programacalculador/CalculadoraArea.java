package programacalculador;

import java.math.RoundingMode;
import java.util.Scanner;

/**
 * Programa que realiza cálculo de áreas simples.
 */
public class CalculadoraArea extends CalculadoraPadrao {

    @Override
    public void iniciar() {
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
            int a = leitor.nextInt();
            int b = leitor.nextInt();

            areaQuadrilatero(a, b);
        }

    }

    protected Double areaCirculo(int r) {
        Float PI = 3.141516f;
        Double area = super.multiplicar(PI, super.potenciacao(r, 2));
        return Math.floor(area);
    }

    protected Double areaQuadrilatero(int a, int b) {
        Double area = super.multiplicar(a, b);
        return area;
    }

}
