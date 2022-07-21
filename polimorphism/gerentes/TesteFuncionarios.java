package polimorphism.gerentes;

public class TesteFuncionarios {
    public static void main(String[] args) {
        

        Funcionario funcioario = new Funcionario();

        Gerente gerente = new Gerente("47fnbuAgy");

        Diretor diretor = new Diretor("8j88i799");

        funcioario.setSalario(3000);
        gerente.setSalario(6000);
        diretor.setSalario(15000);

        funcioario.registra(funcioario);
        gerente.registra(gerente);
        diretor.registra(diretor);

        System.out.println(funcioario.getBonus());
        System.out.println(gerente.getBonus());
        System.out.println(diretor.getBonus());

    }
    
}
