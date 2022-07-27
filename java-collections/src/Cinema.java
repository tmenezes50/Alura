import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Cinema {
    private String nomeCinema;
    private String lugarCinema;
    private List<Filme> filmeList = new LinkedList<>();

    public Cinema(String nomeCinema, String lugarCinema) {
        this.nomeCinema = nomeCinema;
        this.lugarCinema = lugarCinema;
    }

    public String getNomeCinema() {
        return nomeCinema;
    }

    public void setNomeCinema(String nomeCinema) {
        this.nomeCinema = nomeCinema;
    }

    public String getLugarCinema() {
        return lugarCinema;
    }

    public void setLugarCinema(String lugarCinema) {
        this.lugarCinema = lugarCinema;
    }

    public List<Filme> getFilmeList() {
        return Collections.unmodifiableList(filmeList);
    }

    public void setFilmeList(List<Filme> filmeList) {
        this.filmeList = filmeList;
    }

    public void adiciona(Filme filme) {
        filmeList.add(filme);
    }

    @Override
    public String toString() {
        return String.format("%s - %s %s", getNomeCinema(), getLugarCinema(), filmeList.toString());
    }
}
