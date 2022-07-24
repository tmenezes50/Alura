package bytebank;

import java.util.ArrayList;
import java.util.List;

public class ListaTeste {
    public static void main(String[] args) {
        List lista = new ArrayList();

        Conta conta1 = new Conta(324,11);
        conta1.setNome("Calor");

        Conta conta2 = new Conta(442, 114);
        conta2.setNome("Arthur");

        Conta conta3 = new Conta(423, 1124);
        conta3.setNome("Bruno");

        Conta conta4 = new Conta(4234,5432);
        conta4.setNome("Enzo");

        Conta conta5 = new Conta(4756,3456);
        conta5.setNome("Thiago");

        lista.add(conta1);
        lista.add(conta2);
        lista.add(conta3);
        lista.add(conta4);
        lista.add(conta5);


        System.out.println(lista.size());

        for (Object o: lista) {
            System.out.println(o);
        }

        System.out.println("--------------------------------------");

        Compara compara = new Compara();

        lista.sort(compara);

        for (Object o: lista) {
            System.out.println(o);
        }

        System.out.println("-----------------------------------");
        ComparaString comparaString = new ComparaString();
        lista.sort(comparaString);

        for (Object o: lista) {
            System.out.println(o);
        }
    }
}


