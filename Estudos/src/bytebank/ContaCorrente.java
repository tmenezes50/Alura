package bytebank;

/**
 * Criando classe utilizando polimorfismo em java
 *
 * @version 1
 *
 * @author thiag
 */

public class ContaCorrente extends Conta{

    private double taxa;

    public ContaCorrente(int numeroConta, int agencia) {
        super(numeroConta, agencia);
    }

    @Override
    public void saca(double valor) throws ExcecaoValor {
        if (valor > saldo) {
            throw new ExcecaoValor("Saldo insuficiente");
        } else {this.saldo -= valor + 0.2;}
    }

    @Override
    public String toString() {
        return String.format("Contacorrente: \n%s", super.toString());
    }

}
