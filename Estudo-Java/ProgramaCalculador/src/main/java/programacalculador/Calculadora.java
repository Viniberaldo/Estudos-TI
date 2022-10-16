package programacalculador;

/**
 * Interface para orientar a criação de implementação de calculadoras
 */
public interface Calculadora {

    /**
     * Exibe as opções disponíveis para o usuário.
     */
    public void iniciar();

    /**
     * Realiza a operação de adição entre dois números.
     *
     * @param a primeiro número
     * @param b segundo número
     * @return Resultado da operação
     */
    public double adicionar(double a, double b);

    /**
     * Realiza a operação de subtração entre dois números.
     *
     * @param a primeiro número
     * @param b segundo número
     * @return Resultado da operação
     */
    public double subtrair(double a, double b);

    /**
     * Realiza a operação de divisão de "a" por "b"
     *
     * @param a numerador
     * @param b denominador
     * @return Resultado da operação
     */
    public double dividir(double a, double b);

    /**
     * Realiza a multiplicação de "a" por "b"
     *
     * @param a primeiro número
     * @param b segundo número
     * @return Resultado da multiplicação
     */
    public double multiplicar(double a, double b);

    /**
     * Realiza a poteciação de um número
     * @param a base
     * @param b expoente
     * @return Resultado de "base" elevado a "expoente"
     */
    public double potenciacao(double a, int b);
}
