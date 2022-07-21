package polimorphism.conta;

public class Cliente {
    private String nome;
    private int numeroConta;
    private int agencia;
    private double saldo;

    public Cliente(int numeroConta, int agencia) {
        System.out.println("Conta criada com sucesso");
        this.numeroConta = numeroConta;
        this.agencia = agencia;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    public int getAgencia() {
        return agencia;
    }
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double depositar(double valor) {
        return this.saldo += valor;
    }

    public double sacar(double valor) {
        return this.saldo -= valor;
    }

    public boolean transferir(double valor, Cliente cliente) {
        cliente.depositar(valor);
        this.saldo -= valor;
        return true;

    }

}