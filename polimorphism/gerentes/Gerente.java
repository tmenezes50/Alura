package polimorphism.gerentes;

public class Gerente extends Funcionario{
    private String senha = "asdufih1";

    public Gerente(String senha) {
        if (senha != this.senha) {
            System.out.println("Acesso de Gerente negado");
        } else {this.senha = senha;} 
    }

    @Override
    public double registra(Funcionario f) {
        super.bonus = (f.getSalario() * 0.2);
        return super.bonus ;
    }


}
