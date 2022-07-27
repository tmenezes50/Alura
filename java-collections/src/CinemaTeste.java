import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CinemaTeste {
    public static void main(String[] args) {

        Cinema cinema = new Cinema("PopCine", "Shopping Tropical");

        Filme filme1 = new Filme();
        filme1.setNome("Titanic");
        filme1.setAnoLancamente(1997);
        filme1.setTempoDuracao(194);

        Filme filme2 = new Filme();
        filme2.setNome("Poderoso Chefão");
        filme2.setAnoLancamente(1972);
        filme2.setTempoDuracao(175);

        Filme filme3 = new Filme();
        filme3.setNome("Watchmen");
        filme3.setTempoDuracao(163);
        filme3.setAnoLancamente(2009);

        cinema.adiciona(filme1);
        cinema.adiciona(filme2);
        cinema.adiciona(filme3);

        System.out.println(cinema.getFilmeList());

        List<Filme> filmes = new ArrayList<>(cinema.getFilmeList());

        Collections.sort(filmes, Comparator.comparing(Filme::getAnoLancamente));

        System.out.println(cinema.getFilmeList());
    }
}
