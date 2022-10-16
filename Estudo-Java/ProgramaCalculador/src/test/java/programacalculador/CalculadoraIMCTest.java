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
public class CalculadoraIMCTest {

    public CalculadoraIMCTest() {
    }

    @Test
    public void testIniciar() {
    }

    @Test
    public void testCalcularIMC() {
        Double altura = 1.75d;
        Double massa = 89d;
        CalculadoraIMC calculadoraIMC = new CalculadoraIMC();
        Double esperado = massa / Math.pow(altura, 2);
        Double obtido = calculadoraIMC.calcularIMC(massa, altura);
        Double erroMaximo = 0.001d;
        assertTrue((obtido - esperado) < erroMaximo);
    }

}
