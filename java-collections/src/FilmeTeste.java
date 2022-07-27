import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class FilmeTeste {
    public static void main(String[] args) {

        ArrayList<Filme> filmes = new ArrayList<Filme>();
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

        filmes.add(filme1);
        filmes.add(filme2);
        filmes.add(filme3);

        //Collections.sort(filmes);

        filmes.forEach(System.out::println);

        System.out.println();
        Collections.sort(filmes, Comparator.comparing(Filme::getNome));

        filmes.forEach(System.out::println);


        filmes.stream()
                .filter(filme -> filme.getTempoDuracao()> 170)
                .map(Filme::toString)
                .forEach(System.out::println);
    }
}
