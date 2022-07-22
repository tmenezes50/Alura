package bytebank;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(int numeroConta, int agencia) {
        super(numeroConta, agencia);
    }

    @Override
    public void saca(double valor) throws ExcecaoValor {
        if (valor > saldo) {
            throw new ExcecaoValor("Saldo insuficiente");
        } else {this.saldo -= valor + 0.3;}
    }
}
