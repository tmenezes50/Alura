package bytebank;

public class ExcecaoValor extends Exception{

    public ExcecaoValor(String msg) {
        super("Saldo insuficiente");
    }
}
