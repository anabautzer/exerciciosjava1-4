public class Medico extends ProfissionalSaude implements Atendimento{
    private String especialidade;
    private int numeroPlantao;
    private double salarioBase;

    public Medico(String nome, int idade, String cpf, String registroProfissional, String especialidade, int numeroPlantao, double salarioBase) {
        super(nome, idade, cpf, registroProfissional);
        this.especialidade = especialidade;
        this.numeroPlantao = numeroPlantao;
        this.salarioBase = salarioBase;
    }

    @Override
    public void realizarAtendimento() {
        System.out.println("O médico está realizando o atendimento");
    }

    @Override
    public double calularSalario() {
        salarioBase = salarioBase + (500 * numeroPlantao);
        return salarioBase;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Nome: " + super.getNome());
        System.out.println("Idade: " + super.getIdade());
        System.out.println("CPF: " + super.getCpf());
        System.out.println("Registro: " + super.getRegistroProfissional());
        System.out.println("Especialidade: " + especialidade);
        System.out.println("Número do Plantão: " + numeroPlantao);
        System.out.println("Salário: R$" + salarioBase);
    }
}
