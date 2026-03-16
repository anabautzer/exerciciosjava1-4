public class Pessoa {
    // atributos
    String nome;
    String sobrenome;
    int pesoEmGramas;
    int alturaEmCentimentros;
    Pessoa (String nome, String sobrenome, int pesoEmGramas, int alturaEmCentimentros) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.pesoEmGramas = pesoEmGramas;
        this.alturaEmCentimentros = alturaEmCentimentros;
    }
    Pessoa () {

    }
    String nomeCompleto (String nome, String sobrenome) {
        return nome + sobrenome;
    }
    double pesoEmKilogramas (int pesoEmGramas) {
        return pesoEmGramas/1000.0; //.0 para forçar a ser double
    }
    double alturaEmMetros (int alturaEmCentimentros) {

        return alturaEmCentimentros/100.0;
    }
}
