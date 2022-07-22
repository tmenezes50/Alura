package bytebank;

public class TesteArray {
    public static void main(String[] args) {

        ContaCorrente[] cc = new ContaCorrente[7];

        for (int i=0; i < 7; i++) {
            cc[i] = new ContaCorrente((i * 2 + 11), (i * 11 + 14));
            System.out.println("Conta Corrente " + (i+1));
            System.out.println("Agencia: " + cc[i].getAgencia());
            System.out.println("Numero conta: "  + cc[i].getNumeroConta());
            System.out.println();
        }
    }
}
