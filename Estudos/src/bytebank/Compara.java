package bytebank;

import java.util.Comparator;

public class Compara implements Comparator<Conta> {
    @Override
    public int compare(Conta o1, Conta o2) {
        if(o1.getNumeroConta() < o2.getNumeroConta()) {
            return 1;
        }
        if(o2.getNumeroConta() < o1.getNumeroConta()) {
            return -1;
        }
        return 0;
    }


}
