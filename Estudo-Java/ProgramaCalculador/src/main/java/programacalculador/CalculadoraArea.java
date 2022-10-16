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

    /**
     * Calcula a área de um círculo de raio "r"
     * @param r raio do círculo
     * @return área do círculo
     */
    protected Double areaCirculo(int r) {
        Float PI = 3.141516f;
        Double area = super.multiplicar(PI, super.potenciacao(r, 2));
        return Math.floor(area);
    }

    /**
     * Calcula a área de um quadrilátero
     * @param a lado a
     * @param b lado b
     * @return área do quadrilátero
     */
    protected Double areaQuadrilatero(int a, int b) {
        Double area = super.multiplicar(a, b);
        return area;
    }

}
