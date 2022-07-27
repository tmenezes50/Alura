import java.io.*;

import polimorphism.conta.Cliente;


public class TesteSerializacao {
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {

        /* String nome = "Thiago Menezes";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.bin"));
        oos.writeObject(nome);
        oos.close(); */

        /* ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.bin"));
        String nome = (String) ois.readObject();
        ois.close();
        System.out.println(nome); */

        /* Cliente cliente = new Cliente();
        cliente.setNome("Thiago");
        cliente.setCpf("000.211.889-58");
        cliente.setProfi("Estudante");

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
        oos.writeObject(cliente);
        oos.close(); */

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
        Cliente cliente1 = (Cliente) ois.readObject();
        ois.close();
        System.out.println(cliente1);

    }
}
