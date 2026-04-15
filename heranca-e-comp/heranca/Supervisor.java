public class Supervisor extends Funcionario {
    private String departamento;
    public Supervisor(String nome, int cpf, int registro, String departamento) {
        super(nome, cpf, registro);
        this.departamento = departamento;
    }

    @Override // boas práticas para mostrar de onde vem quando o nome é igual
    public void imprimeDados(){
        super.imprimeDados();
        System.out.println("Departamento: " + departamento);
    }
}
