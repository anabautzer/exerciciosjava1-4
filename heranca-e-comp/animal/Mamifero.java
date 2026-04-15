public class Mamifero extends Animal {
    protected int tempoGestacao;

    public Mamifero(String nome, int idade, String tipo, double area, int tempoGestacao) {
        super(nome, idade, tipo, area);
        this.tempoGestacao = tempoGestacao;
    }
    public void amamentar(){
        System.out.println("Amamentar");
    }
    @Override
    public String getInfo(){
        return super.getInfo() + "\nGestação: " + tempoGestacao;

    }
}
