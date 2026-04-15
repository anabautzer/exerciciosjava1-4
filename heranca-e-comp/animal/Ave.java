public class Ave extends Animal {
    protected double envergaduraAsa;

    public Ave(String nome, int idade, String tipo, double area, double envergaduraAsa) {
        super(nome, idade, tipo, area);
        this.envergaduraAsa = envergaduraAsa;
    }
    public void voar(){
        System.out.println("Voando");
    }
    @Override
    public String getInfo(){
        return super.getInfo() + "\nAsa: " + envergaduraAsa;
    }
}
