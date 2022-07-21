package polimorphism.gerentes;

public class Diretor extends Funcionario {
    private String senha = "8j88i799";

    public Diretor(String senha) {
        if(senha != this.senha) {
            System.out.println("Senha invalida");
        } else {this.senha = senha;}
    }

    @Override
    public double registra(Funcionario f) {
        super.bonus = (f.getSalario() * 0.3);
        return super.bonus;
    }

}
