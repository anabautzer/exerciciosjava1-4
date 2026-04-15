public class Funcionario extends Pessoa{
    private int registro;

    public Funcionario(String nome, int cpf, int registro) { // precisa implementar o construtor para dar certo com o extends
        super(nome, cpf);
        this.registro = registro;
    }

    public void imprimeDados(){
        System.out.println("Nome: " + super.getNome());
        System.out.println("CPF: " + super.getCpf());
        System.out.println("Registro: " + registro);
    }


}

