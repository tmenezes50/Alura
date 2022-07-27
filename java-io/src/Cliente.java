import java.io.Serializable;

public class Cliente implements Serializable {
    private final static long serialVersionUID = 8196996939374794377L;
    private String nome;
    private String cpf;
    private String profi;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getProfi() {
        return profi;
    }

    public void setProfi(String profi) {
        this.profi = profi;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s\nCPF: %s\nProfissão: %s", getNome(), getCpf(), getProfi());
    }
}
