package BancoW;

public class Cliente {

    protected int agencia;
    protected int numero;
    protected double saldo;

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}