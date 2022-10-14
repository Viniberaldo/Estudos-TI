package programacalculador;

import java.util.Scanner;

/**
 * Classe pra operações padrão
 */
public class CalculadoraPadrao {

    void iniciar() {
        System.out.println("Calculadora Padrão iniciada. Escolha a operação"
                + "desejada:");
        System.out.println("1. Adição");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        System.out.println("5. Potenciação");

        Scanner leitor = new Scanner(System.in);

        int opcao = leitor.nextInt();

        System.out.println("Insira os dois números para a operação: ");
        var a = leitor.nextInt();
        var b = leitor.nextInt();

        switch (opcao) {
            case 1 ->
                adicionar(a, b);
            case 2 ->
                subtrair(a, b);
            case 3 ->
                multiplicar(a, b);
            case 4 ->
                dividir(a, b);
            case 5 ->
                potenciacao(a, b);
            default ->
                System.out.println("Não foi possível executar a"
                        + "operação.");
        }
    }

    private long adicionar(long a, long b) {
        return a + b;
    }

    private long subtrair(long a, long b) {
        return a - b;
    }

    private long dividir(long a, long b) {
        return a / b;
    }

    private long multiplicar(long a, long b) {
        return a * b;
    }

    private long potenciacao(long a, int b) {
        //se b = 0 resultado = 1
        if (b == 0) {
            return 1;
        }

        //se b = 1 resultado = a
        if (b == 1) {
            return a;
        }

        //se b > 1 resultado = 
        if (b > 1) {
            long resultado = 1;
            for (int expoente = b; expoente > 0; expoente--) {
                resultado = resultado * a;
            }
            return resultado;
        }
        return 0;
    }
}
