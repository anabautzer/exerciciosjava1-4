public class Animal {
    protected String nome;
    protected int idade;
    protected Habitat habitat;

    public Animal(String nome, int idade, String tipo, double area) {
        this.nome = nome;
        this.idade = idade;
        this.habitat = new Habitat(tipo, area);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTipo() {
        return habitat.tipo;
    }

    public void setTipo(String tipo) {
        habitat.setTipo(tipo);
    }

    public double getArea() {
        return habitat.area;
    }

    public void setArea(double area) {
        habitat.setArea(area);
    }
    public void emitirSom(){
        System.out.println("Saindo som");
    }
    public String getInfo(){ //toString (mostrar o texto)
        return "Nome: " + getNome() + "\nIdade: " + getIdade() + "\nHabitat: " + habitat.getDescricao();
    }
}
