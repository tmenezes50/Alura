package polimorphism.conta;

public class TesteCliente {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(1234, 444);
        Cliente cliente2 = new Cliente(4233, 444);

        cliente1.depositar(200.0);
        cliente2.depositar(400.0);

        cliente1.transferir(40, cliente2);

        System.out.println(cliente2.getSaldo());
        System.out.println(cliente1.getSaldo());
    }
}
