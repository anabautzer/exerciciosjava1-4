public class SalaDeAula {
    int numeroDaSala;
    int numeroDeComputadores;
    int andar; //variavel global
    SalaDeAula(int numeroDaSala, int numeroDeComputadores, int andar) { //usada uma unica vez, não pode ser chamado mais uma vez pelo mesmo objeto, construtor. Nesse caso pode 6 construtores, fatorial das variaveis
        this.numeroDaSala = numeroDaSala; //ele também é um método, não precisa usar todas as variaveis
        this.numeroDeComputadores = numeroDeComputadores;
        this.andar = andar;
    }

    SalaDeAula(){ //constutor padrão, remeter a 0

    }

    void imprimeNumeroDeComputadores() { //pode usar varias vezes o método, ele altera todas as variaveis
        int abc = 10; //variavel local
        System.out.println(numeroDeComputadores);

    }
    void imprimeNumeroDeAndares() {
        System.out.println(andar);
    }

     void imprimeNumeroDaSala() {
        System.out.println(numeroDaSala);
    }

    void alterarAndar(int qtdeAndar) {
        ; //criar método que altere o andar, quntidade de variaveis que podem ser usadas
        andar = qtdeAndar; //andar existe por ser variavel do componente inteiro e qtdeAndar não
        System.out.println(qtdeAndar);

    }
    void alterarVariaveis(int numeroDaSala, int numeroDeComputadores, int andar) {
       this.numeroDaSala = numeroDaSala; //this remete a origem, que no caso é a classe
       this.numeroDeComputadores = numeroDeComputadores;
       this.andar = andar;
       System.out.println(numeroDaSala);
       System.out.println(numeroDeComputadores);
       System.out.println(andar);
    }
}
