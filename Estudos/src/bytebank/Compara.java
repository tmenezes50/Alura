package bytebank;

import java.util.Comparator;

public class Compara implements Comparator<Conta> {
    @Override
    public int compare(Conta o1, Conta o2) {
        return Integer.compare(o1.getNumeroConta(), o2.getNumeroConta());
    }


}
