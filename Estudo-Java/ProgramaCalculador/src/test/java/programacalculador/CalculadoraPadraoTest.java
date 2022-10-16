package programacalculador;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *Testes
 */
public class CalculadoraPadraoTest {

    public CalculadoraPadraoTest() {
    }

    @Test
    public void testIniciar() {
    }

    @Test
    public void testAdicionar() {
        Double a = -2d;
        Double b = 4d;
        CalculadoraPadrao calculadoraPadrao = new CalculadoraPadrao();
        Double obtido = calculadoraPadrao.adicionar(a, b);
        assertEquals(2d, obtido);
    }

    @Test
    public void testSubtrair() {
        Double a = -2d;
        Double b = 4d;
        CalculadoraPadrao calculadoraPadrao = new CalculadoraPadrao();
        Double obtido = calculadoraPadrao.subtrair(a, b);
        assertEquals(-6d, obtido);
    }

    @Test
    public void testDividir() {
        Double a = -2d;
        Double b = 4d;
        CalculadoraPadrao calculadoraPadrao = new CalculadoraPadrao();
        Double obtido = calculadoraPadrao.dividir(a, b);
        assertEquals(-0.5d, obtido);
    }

    @Test
    public void testMultiplicar() {
        Double a = -2d;
        Double b = 4d;
        CalculadoraPadrao calculadoraPadrao = new CalculadoraPadrao();
        Double obtido = calculadoraPadrao.multiplicar(a, b);
        assertEquals(-8d, obtido);
    }

    @Test
    public void testPotenciacao() {
        Double a = -2d;
        int b = 4;
        CalculadoraPadrao calculadoraPadrao = new CalculadoraPadrao();
        Double obtido = calculadoraPadrao.potenciacao(a, b);
        assertEquals(16d, obtido);
    }
}
