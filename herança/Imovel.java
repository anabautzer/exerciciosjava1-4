public class Imovel {
    int id;
    String endereco;
    double valor;

    public Imovel(int id, String endereco, double valor) {
        this.id = id;
        this.endereco = endereco;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = enderco;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    public void imprimeDado(){
        System.out.println("ID: " + id);
        System.out.println("Endereço: " + endereco);
        System.out.println("Valor: " + valor);

    }
}
