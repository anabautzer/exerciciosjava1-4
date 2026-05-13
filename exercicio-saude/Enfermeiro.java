import java.util.Objects;

public class Enfermeiro extends ProfissionalSaude implements Atendimento{
    private String turno;
    private double salarioBase;

    /**
     *
     * @param nome Nome do Enfermeiro
     * @param idade Idade do Enfermeiro
     * @param cpf CPF do Enfermeiro
     * @param registroProfissional
     * @param turno
     * @param salarioBase
     */

    public Enfermeiro(String nome, int idade, String cpf, String registroProfissional, String turno, double salarioBase) {
        super(nome, idade, cpf, registroProfissional);
        this.turno = turno;
        this.salarioBase = salarioBase;
    }

    @Override
    public void realizarAtendimento() {
        System.out.println("O médico está realizando o atendimento");
    }

    @Override
    public double calularSalario() {
        if (Objects.equals(turno, "Noturno")){ // turno.equals("Noturno")
            return salarioBase * 1.20;
        }
        return salarioBase;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Nome: " + super.getNome());
        System.out.println("Idade: " + super.getIdade());
        System.out.println("CPF: " + super.getCpf());
        System.out.println("Registro: " + super.getRegistroProfissional());
        System.out.println("Turno: " + turno);
        System.out.println("Salário: R$" + salarioBase);
    }
}
