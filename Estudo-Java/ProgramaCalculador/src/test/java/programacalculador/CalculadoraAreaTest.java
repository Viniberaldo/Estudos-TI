/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package programacalculador;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author viniberaldo
 */
public class CalculadoraAreaTest {

    public CalculadoraAreaTest() {
    }

    @Test
    public void testIniciar() {
    }

    @Test
    public void testAreaCirculo() {
        int r = 1;
        CalculadoraArea calculadoraArea = new CalculadoraArea();
        Double obtido = calculadoraArea.areaCirculo(r);
        Double erroMaximo = 0.0001d;
        assertTrue((obtido - 3.141515d) < erroMaximo);
    }

    @Test
    public void testAreaQuadrilatero() {
        int a = 3;
        int b = 5;
        CalculadoraArea calculadoraArea = new CalculadoraArea();
        Double obtido = calculadoraArea.areaQuadrilatero(a, b);
        assertEquals(15d, obtido);
    }

}
