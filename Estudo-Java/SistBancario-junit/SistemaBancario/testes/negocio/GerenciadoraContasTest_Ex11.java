package negocio;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Classe de teste criada para garantir o funcionamento das principais operaes
 * sobre contas, realizadas pela classe {@link GerenciadoraContas}.
 * 
 * @author Gustavo Farias
 * @date 21/01/2035 
 */
public class GerenciadoraContasTest_Ex11 {

	private GerenciadoraContas gerContas;
	
	/**
	 * Teste bsico da transferncia de um valor da conta de um cliente para outro,
	 * estando ambos os clientes ativos e havendo saldo suficiente para tal transferncia
	 * ocorrer com sucesso.
	 * 
	 * @author Gustavo Farias
	 * @date 21/01/2035
	 */
	@Test
	public void testTransfereValor() {

		/* ========== Montagem do cenrio ========== */
		
		// criando alguns clientes
		int idConta01 = 1;
		int idConta02 = 2;
		ContaCorrente conta01 = new ContaCorrente(idConta01, 200, true);
		ContaCorrente conta02 = new ContaCorrente(idConta02, 0, true);
		
		// inserindo os clientes criados na lista de clientes do banco
		List<ContaCorrente> contasDoBanco = new ArrayList<>();
		contasDoBanco.add(conta01);
		contasDoBanco.add(conta02);
		
		gerContas = new GerenciadoraContas(contasDoBanco);

		/* ========== Execuo ========== */
		boolean sucesso = gerContas.transfereValor(idConta01, 100, idConta02);
		
		/* ========== Verificaes ========== */
		assertTrue(sucesso);
		assertThat(conta02.getSaldo(), is(100.0));
		assertThat(conta01.getSaldo(), is(100.0));
	}
	
	/**
	 * Teste bsico da tentativa de transferncia de um valor da conta de um cliente para outro
	 * quando no h saldo suficiente, mas o saldo  positivo.
	 * 
	 * @author Gustavo Farias
	 * @date 21/01/2035
	 */
	@Test
	public void testTransfereValor_SaldoInsuficiente() {

		/* ========== Montagem do cenrio ========== */
		
		// criando alguns clientes
		int idConta01 = 1;
		int idConta02 = 2;
		ContaCorrente conta01 = new ContaCorrente(idConta01, 100, true);
		ContaCorrente conta02 = new ContaCorrente(idConta02, 0, true);
		
		// inserindo os clientes criados na lista de clientes do banco
		List<ContaCorrente> contasDoBanco = new ArrayList<>();
		contasDoBanco.add(conta01);
		contasDoBanco.add(conta02);
		
		gerContas = new GerenciadoraContas(contasDoBanco);

		/* ========== Execuo ========== */
		boolean sucesso = gerContas.transfereValor(idConta01, 200, idConta02);
		
		/* ========== Verificaes ========== */
		assertTrue(sucesso);
		assertThat(conta01.getSaldo(), is(-100.0));
		assertThat(conta02.getSaldo(), is(200.0));
	}

	/**
	 * Teste bsico da tentativa de transferncia de um valor da conta de um cliente para outro
	 * quando no h saldo suficientee o saldo  negativo.
	 * 
	 * @author Gustavo Farias
	 * @date 21/01/2035
	 */
	@Test
	public void testTransfereValor_SaldoNegativo() {

		/* ========== Montagem do cenrio ========== */
		
		// criando alguns clientes
		int idConta01 = 1;
		int idConta02 = 2;
		ContaCorrente conta01 = new ContaCorrente(idConta01, -100, true);
		ContaCorrente conta02 = new ContaCorrente(idConta02, 0, true);
		
		// inserindo os clientes criados na lista de clientes do banco
		List<ContaCorrente> contasDoBanco = new ArrayList<>();
		contasDoBanco.add(conta01);
		contasDoBanco.add(conta02);
		
		gerContas = new GerenciadoraContas(contasDoBanco);

		/* ========== Execuo ========== */
		boolean sucesso = gerContas.transfereValor(idConta01, 200, idConta02);
		
		/* ========== Verificaes ========== */
		assertTrue(sucesso);
		assertThat(conta01.getSaldo(), is(-300.0));
		assertThat(conta02.getSaldo(), is(200.0));
	}
	
	/**
	 * Teste bsico da tentativa de transferncia de um valor da conta de um cliente para outro
	 * quando o saldo do cliente origem  negativo e do cliente destino tambm  negativo.
	 * 
	 * @author Gustavo Farias
	 * @date 21/01/2035
	 */
	@Test
	public void testTransfereValor_SaldoNegativoParaNegativo() {

		/* ========== Montagem do cenrio ========== */
		
		// criando alguns clientes
		int idConta01 = 1;
		int idConta02 = 2;
		ContaCorrente conta01 = new ContaCorrente(idConta01, -100, true);
		ContaCorrente conta02 = new ContaCorrente(idConta02, -100, true);
		
		// inserindo os clientes criados na lista de clientes do banco
		List<ContaCorrente> contasDoBanco = new ArrayList<>();
		contasDoBanco.add(conta01);
		contasDoBanco.add(conta02);
		
		gerContas = new GerenciadoraContas(contasDoBanco);

		/* ========== Execuo ========== */
		boolean sucesso = gerContas.transfereValor(idConta01, 200, idConta02);
		
		/* ========== Verificaes ========== */
		assertTrue(sucesso);
		assertThat(conta01.getSaldo(), is(-300.0));
		assertThat(conta02.getSaldo(), is(100.0));
	}
	
	/**
	 * Teste bsico da tentativa de transferncia de um valor nulo da conta de um cliente para outro.
	 * 
	 * @author Gustavo Farias
	 * @date 21/01/2035
	 */
	@Test
	public void testTransfereValor_Nenhum() {

		/* ========== Montagem do cenrio ========== */
		
		// criando alguns clientes
		int idConta01 = 1;
		int idConta02 = 2;
		ContaCorrente conta01 = new ContaCorrente(idConta01, -100, true);
		ContaCorrente conta02 = new ContaCorrente(idConta02, -100, true);
		
		// inserindo os clientes criados na lista de clientes do banco
		List<ContaCorrente> contasDoBanco = new ArrayList<>();
		contasDoBanco.add(conta01);
		contasDoBanco.add(conta02);
		
		gerContas = new GerenciadoraContas(contasDoBanco);

		/* ========== Execuo ========== */
		boolean sucesso = gerContas.transfereValor(idConta01, 2, idConta02);
		
		/* ========== Verificaes ========== */
		assertTrue(sucesso);
		assertThat(conta01.getSaldo(), is(-102.0));
		assertThat(conta02.getSaldo(), is(-98.0));
	}
	
}
// Clculos matemticos e financeiros