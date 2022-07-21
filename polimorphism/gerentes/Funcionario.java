package polimorphism.gerentes;

public class Funcionario {
    
    private String nome;
    private String cpf;
    private double salario;
    protected double bonus;


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
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        if(this.salario < 0) {
            System.out.println("Salário deve ser maior que zero");
        } else {this.salario = salario;}    
    }

    public double registra(Funcionario f) {
        this.bonus = (this.salario * 0.1);
        return bonus;
    }

    public double getBonus() {
        return this.salario + this.bonus;
    }
    
}
