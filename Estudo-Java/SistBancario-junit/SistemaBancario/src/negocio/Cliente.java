package negocio;

/**
 * Classe {@link Cliente} que representa um cliente real do banco.
 *
 * @author Gustavo Farias
 */
public class Cliente {

    private int id;

    private String nome;

    private int idade;

    private String email;

    private boolean ativo;

    private int idContaCorrente;

    public Cliente(int id, String nome, int idade, String email, int idContaCorrente, boolean ativo) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.idContaCorrente = idContaCorrente;
        this.ativo = ativo;
    }

    /**
     * Metodo que retorna o ID do cliente.
     *
     * @return ID do cliente
     */
    public int getId() {
        return id;
    }

    /**
     * Matodo que atualiza o ID do cliente.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Matodo que retorna o nome do cliente.
     *
     * @return nome do cliente
     */
    public String getNome() {
        return nome;
    }

    /**
     * Matodo que atualiza o nome do cliente.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Matodo que retorna a idade do cliente.
     *
     * @return idade do cliente
     */
    public int getIdade() {
        return idade;
    }

    /**
     * Matodo que atualiza a idade do cliente.
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * Matodo que retorna o email do cliente.
     *
     * @return email do cliente
     */
    public String getEmail() {
        return email;
    }

    /**
     * Matodo que atualiza o email do cliente.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Matodo que retorna o status (Ativo ou Inativo) do cliente.
     *
     * @return status do cliente
     */
    public boolean isAtivo() {
        return ativo;
    }

    /**
     * Matodo que atualiza o status do cliente.
     */
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    /**
     * Matodo que retorna o ID da conta corrente associada ao cliente.
     *
     * @return ID da conta corrente associada ao cliente
     */
    public int getIdContaCorrente() {
        return this.idContaCorrente;
    }

    /**
     * Matodo que atualiza o ID da conta corrente associada ao cliente.
     */
    public void setIdContaCorrente(int idContaCorrente) {
        this.idContaCorrente = idContaCorrente;
    }

    /**
     * Matodo que retorna a representaaao textual de um cliente.
     *
     * @return representaaao textual de um cliente
     */
    @Override
    public String toString() {

        String str = "========================="
                + "Id: " + this.id + "\n"
                + "Nome: " + this.nome + "\n"
                + "Email: " + this.email + "\n"
                + "Idade: " + this.idade + "\n"
                + "Status: " + (ativo ? "Ativo" : "Inativo") + "\n"
                + "=========================";
        return str;
    }

}
