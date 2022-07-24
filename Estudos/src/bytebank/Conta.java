package bytebank;

import java.util.Objects;

public class Conta {
    private String nome;
    private int numeroConta;
    private int agencia;

    protected double saldo;

    public Conta(int numeroConta, int agencia) {
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

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public void saca(double valor) throws ExcecaoValor {
        this.saldo -= valor;
    }

    public void tranferir(double valor, Conta c) throws ExcecaoValor {
        saca(valor);
        c.deposita(valor);
    }

    @Override
    public String toString() {
        return String.format("Nome: %s\nNumero da conta: %d\n Agencia: %d",getNome(), getNumeroConta(), getAgencia());
    }

    @Override
    public boolean equals(Object ref) {
        Conta outra = (Conta) ref;

        if(this.agencia != outra.agencia){
            return false;
        }

        if(this.numeroConta != numeroConta) {
            return false;
        }

        return true;
    }
}

