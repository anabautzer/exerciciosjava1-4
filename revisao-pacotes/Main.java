import Retangulo.Retangulo;

public class Main {
    public static void main(String[] args) {
        Retangulo rt = new Retangulo();
        rt.getInformacao("Gostaria de saber valores");
        rt.getInformacaoArea();
        rt.getInformacaoPerimetro();
        rt.getInformacaoOutra();
        rt.alteraLados();
        System.out.println("O lado 1 é: " + rt.recuperaLado1());
        rt = new Retangulo(); //chama o construtor e reinicia
    }
}