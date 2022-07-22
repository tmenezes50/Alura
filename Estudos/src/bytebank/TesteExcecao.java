package bytebank;

public class TesteExcecao {
    public static void main(String[] args) {
        ContaPoupanca contaPoupanca = new ContaPoupanca(123, 432);
        ContaCorrente contaCorrente = new ContaCorrente(432, 242);

        contaPoupanca.deposita(400.0);
        contaCorrente.deposita(400.0);

        try {
            contaCorrente.tranferir(400.98, contaPoupanca);
        } catch (ExcecaoValor excecaoValor) {
            System.out.println("Saldo insuficiente");
        }

        System.out.println(contaPoupanca.getSaldo());
        System.out.println(contaCorrente.getSaldo());
    }
}
