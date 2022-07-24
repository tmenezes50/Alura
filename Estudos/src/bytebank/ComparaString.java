package bytebank;

import java.util.Comparator;

public class ComparaString implements Comparator<Conta> {
    @Override
    public int compare(Conta o1, Conta o2) {

        String nome1 = o1.getNome();
        String nome2 = o2.getNome();

        return nome1.compareTo(nome2);
    }
}
