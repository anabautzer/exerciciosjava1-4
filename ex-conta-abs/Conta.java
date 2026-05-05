public abstract class Conta {
    protected int numero;
    protected double saldo;

    public Conta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }
    public void depositar(double valor){
        System.out.println("Depositando " + valor);
    }
    public abstract void sacar(double valor);
}
