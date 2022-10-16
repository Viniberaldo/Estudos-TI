package programacalculador;

import java.util.Scanner;

/**
 * Programa que calcula o IMC
 */
public class CalculadoraIMC extends CalculadoraPadrao {

    @Override
    public void iniciar() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira primeiro a altura e depois a massa corporal "
                + "para a operação: ");
               
        String altura = leitor.nextLine();
        Double massa = leitor.nextDouble();
        Double alturaNumerica = Double.valueOf(altura);
        
        calcularIMC(massa, alturaNumerica);
    }

    /**
     * Calcula o IMC, dada a altura e massa do indivíduo.
     * @param massa massa do corpo em kg
     * @param altura altura do corpo em metros
     * @return o valor do IMC
     */
    protected Double calcularIMC(Double massa, Double altura) {
        float quadradoAltura = (float) super.multiplicar(altura, altura);
        Double imc = (double) super.dividir(massa, quadradoAltura);
        
        System.out.println("O IMC é : " + imc);
        return imc;
    }
}
