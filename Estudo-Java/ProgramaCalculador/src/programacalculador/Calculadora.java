package programacalculador;

/**
 * Interface para orientar a criação de implementação de calculadoras
 */
public interface Calculadora {

    public double adicionar(double a, double b);

    public double subtrair(double a, double b);

    public double dividir(double a, double b);

    public double multiplicar(double a, double b);

    public double potenciacao(double a, int b);
}
