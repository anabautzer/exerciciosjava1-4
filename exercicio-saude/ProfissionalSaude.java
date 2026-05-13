public abstract class ProfissionalSaude extends Pessoa{
    private String registroProfissional;

    public ProfissionalSaude(String nome, int idade, String cpf, String registroProfissional) {
        super(nome, idade, cpf);
        this.registroProfissional = registroProfissional;
    }

    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public abstract double calularSalario();
}
