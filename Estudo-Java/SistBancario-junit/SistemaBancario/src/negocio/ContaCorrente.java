package negocio;

/**
 * Classe {@link ContaCorrente} que representa uma conta corrente real
 * e que poder ser associada a um cliente.
 * @author Gustavo Farias
 */
public class ContaCorrente {
	
	private int id;
	
	private double saldo;
	
	private boolean ativa;

	public ContaCorrente(int id, double saldo, boolean ativa) {
		this.id = id;
		this.saldo = saldo;
		this.ativa = ativa;
	}

	/**
	 * Mtodo que retorna o ID da conta corrente. 
	 * @return ID da conta corrente
	 */
	public int getId() {
		return id;
	}

	/**
	 * Mtodo que atualiza o ID da conta corrente. 
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Mtodo que retorna o saldo da conta corrente. 
	 * @return saldo da conta corrente
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Mtodo que atualiza o saldo da conta corrente. 
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Mtodo que retorna o status da conta corrente, podendo ser Ativa ou Inativa. 
	 * @return status da conta corrente
	 */
	public boolean isAtiva() {
		return ativa;
	}

	/**
	 * Mtodo que atualiza o status da conta corrente. 
	 */
	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}
	
	/**
	 * Mtodo que retorna a representao textual de uma conta corrente. 
	 * @return representao textual da conta corrente
	 */
	@Override
	public String toString() {
		
		String str = "========================="
					+ "Id: " + this.id + "\n"
					+ "Saldo: " + this.saldo + "\n"
					+ "Status: " + (ativa?"Ativa":"Inativa") + "\n"
					+ "=========================";
		return str;
	}
	
}
