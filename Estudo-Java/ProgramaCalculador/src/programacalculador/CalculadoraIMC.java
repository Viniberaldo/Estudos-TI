package programacalculador;

import java.util.Scanner;

/**
 * Programa que calcula o IMC
 */
public class CalculadoraIMC extends CalculadoraPadrao {

    void iniciar() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira primeiro a altura e depois o peso para a "
                + "operação: ");
        String linha = leitor.nextLine();
        Double b = leitor.nextDouble();
        Float a = Float.valueOf(linha);
        
        calcularIMC(a, b);
    }

    private void calcularIMC(float a, double b) {
        float imc = (float) super.multiplicar(a, a);
        imc = (float) super.dividir(b, imc);
        System.out.println("O IMC é : " + imc);
    }
}
