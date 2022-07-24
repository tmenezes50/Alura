package bytebank;

public class ArrayContasTeste {

    public static void main(String[] args) {

        Conta cc = new ContaCorrente(33, 22);
        ArrayContas arrayContas = new ArrayContas();

        for (int i = 0; i < 10; i++) {
            arrayContas.adicionarConta(cc, i);
        }

        System.out.println();

    }
}
