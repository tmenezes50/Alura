package bytebank;

public class ArrayContas {
    private Conta[] contas;

    public ArrayContas() {
        this.contas = new Conta[10];
    }

    public void adicionarConta(Conta conta, int indice) {
        this.contas[indice] = conta;
    }

   public int getNumeroContas() {
       for (int i = 0; i < 10; i++) {
           System.out.println(contas[i].getNumeroConta());
       }
       return 10;
   }
}
