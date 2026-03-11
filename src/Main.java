//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SalaDeAula s= new SalaDeAula(3,5, 7); //copiar uma classe para outra, onde pode usar as variaveis de classes diferentes
        s.imprimeNumeroDeComputadores(); //s é objeto
        s.numeroDeComputadores = 10;
        s.imprimeNumeroDeComputadores();
        s = new SalaDeAula(); //recriou o objeto, imprime valor original da classe SalaDeAula
        s.imprimeNumeroDeComputadores();
        SalaDeAula fiap1 = new SalaDeAula(); //local diferente, fiap1 é um novo objeto, são objetos independentes
        fiap1.numeroDeComputadores = 500;
        s.imprimeNumeroDeComputadores();
        fiap1.imprimeNumeroDeComputadores();
        fiap1.imprimeNumeroDeAndares();
        fiap1.alterarAndar(17); //parametro da minha função, pode ter mais desde que não tenha o mesmo nome
        fiap1.alterarVariaveis(3, 5, 10);



    }
}