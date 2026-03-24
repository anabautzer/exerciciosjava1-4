package Retangulo;

public class Retangulo {
    public int lado1;
    public int lado2;

    public Retangulo (int lado1, int lado2){
        // é usado quando vou criar um objeto do tipo retangulo
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    public Retangulo(){
    }
    public void getInformacao(String informacao){
        System.out.println(informacao);
    }
    public int recuperaLado1() {
        // obrigado a ter um elemento retornado
        return lado1;
    }
    public void getInformacaoArea() {
        System.out.println("Valor da Área é: " + (lado1*lado2));
    }
    public void getInformacaoPerimetro() {
        System.out.println("Valor do Perimêtro é: " + (2 * (lado1) + 2 * (lado2)));
    }
    public void getInformacaoOutra() {
        System.out.println("Informação não disponivel");
    }
    public void alteraLados(int valor1, int valor2) { // posso chamar todas as vezes que achar necessario para alterar o valor dos dados
        System.out.println();
    }
}
