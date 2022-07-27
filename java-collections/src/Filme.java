public class Filme implements Comparable<Filme>{
    private String nome;
    private String autor;
    private int anoLancamente;
    private int tempoDuracao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoLancamente() {
        return anoLancamente;
    }

    public void setAnoLancamente(int anoLancamente) {
        this.anoLancamente = anoLancamente;
    }

    public int getTempoDuracao() {
        return tempoDuracao;
    }

    public void setTempoDuracao(int tempoDuracao) {
        this.tempoDuracao = tempoDuracao;
    }

    @Override
    public int compareTo(Filme outroFilme) {
        return this.getTempoDuracao() - outroFilme.getTempoDuracao();
    }


    @Override
    public String toString() {
        return String.format("\nNome: %s\nAno de Lançamento: %d\nDuração: %dh %02dmin\n", getNome(), getAnoLancamente(),
                (tempoDuracao/60), (tempoDuracao%60));
    }
}
